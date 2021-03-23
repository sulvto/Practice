package me.qinchao.example.stream.adclick

import java.sql.{Connection, Date}
import java.text.SimpleDateFormat

import me.qinchao.example.util.JDBCUtil
import org.apache.kafka.clients.consumer.{ConsumerConfig, ConsumerRecord}
import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.InputDStream
import org.apache.spark.streaming.kafka010.{ConsumerStrategies, KafkaUtils, LocationStrategies}
import org.apache.spark.streaming.{Seconds, StreamingContext}

import scala.collection.mutable.ListBuffer

/**
 * 案例1: 广告黑名单。实现动态黑名单机制，将每天对某个广告点击超过阀值的用户拉黑
 *
 * Created by sulvto on 23/03/2021.
 *
 * @author sulvto
 */
object SparkStreaming_Req1_BlackList {
  val AD_CLICK_THRESHOLD:Int = 30

  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming")
    val ssc = new StreamingContext(sparkConf, Seconds(3))

    val kafkaParams: Map[String, Object] = Map[String, Object](
      ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG -> "localhost:9092",
      ConsumerConfig.GROUP_ID_CONFIG -> "spark_example",
      "key.deserializer" -> "org.apache.kafka.common.serialization.StringDeserializer",
      "value.deserializer" -> "org.apache.kafka.common.serialization.StringDeserializer"
    )

    val kafkaDataDS: InputDStream[ConsumerRecord[String, String]] = KafkaUtils.createDirectStream[String, String](
      ssc,
      LocationStrategies.PreferConsistent,
      ConsumerStrategies.Subscribe[String, String](Set("spark-streaming"), kafkaParams)
    )

    val adClickData = kafkaDataDS.map(kafkaData => {
      val data = kafkaData.value()
      val datas = data.split(" ")
      AdClickData(datas(0), datas(1), datas(2), datas(3), datas(4))
    })
    val dataStreaming = adClickData.transform(
      rdd => {
        // 周期性获取黑名单数据
        val blackList = ListBuffer[String]()
        val connection = JDBCUtil.getConnection
        val sql = "SELECT userid FROM black_list"
        val resultSet = JDBCUtil.executeQuery(connection, sql, null)
        while (resultSet.next()) {
          blackList.append(resultSet.getString(1))
        }
        resultSet.close()
        connection.close()

        val filterRdd = rdd.filter(data => {
          // 判断点击用户是否在黑名单中
          !blackList.contains(data.user)
        })
        filterRdd.map(
          data => {
            val sdf = new SimpleDateFormat("yyyy-MM-dd")
            val day = sdf.format(new Date(data.ts.toLong))
            val user = data.user
            val ad = data.ad
            ((day, user, ad), 1)
          })
          .reduceByKey(_ + _)
      }
    )

    dataStreaming.foreachRDD(
      rdd => {
        // 一个分区建立一个连接对象，减少连接对象的数量，提升效率
        rdd.foreachPartition(iterator => {
          val connection = JDBCUtil.getConnection
          iterator.foreach {
            case ((day, user, ad), count) => {
              if (count >= AD_CLICK_THRESHOLD) {
                // 如果统计数量超过点击阀值（30），那么将用户拉入到黑名单
                insertBlackList(user, connection)
                connection.close()
              } else {
                // 如果没有超过阀值，那么需要将当天的广告点击数量进行更新
                val connection = JDBCUtil.getConnection
                if (hasUserAdCount(day, user, ad, connection)) {
                  // 更新当天的广告点击量，然后在判断是否超过阈值
                  updateUserAdCount(day, user, ad, count, connection)
                  if (checkUserCountGte(day, user, ad, AD_CLICK_THRESHOLD, connection)) {
                    insertBlackList(user, connection)
                  }
                } else {
                  // 加入一条新的用户广告点击统计数据
                  insertUserAdCount(day, user, ad, count, connection)
                }
                connection.close()
              }
            }
          }
        })
      }
    )

    // SparkStreaming 采集器是长期执行的任务，所以不能直接关闭
    // 1. 启动采集器
    ssc.start()
    // 2. 等待采集器的关闭
    ssc.awaitTermination()
  }

  /**
   *
   * @param day
   * @param user
   * @param ad
   * @param connection
   * @return
   */
  private def hasUserAdCount(day: String, user: String, ad: String, connection: Connection) = {
    val sql = "SELECT * FROM user_ad_count WHERE dt = ? AND usreid = ? AND adid = ?"
    JDBCUtil.queryIsExist(connection, sql, Array(day, user, ad))
  }

  /**
   * 将用户拉入黑名单
   *
   * @param user
   * @param connection
   */
  private def insertBlackList(user: String, connection: Connection) = {
    val sql =
      """
        |INSERT INTO black_list (userid) VALUES (?)
        |ON DUPLICATE KEY
        |UPDATE userid = ?
        |""".stripMargin
    JDBCUtil.executeUpdate(connection, sql, Array(user, user))
  }

  /**
   * 判断用户广告点击量是否大于等于指定值
 *
   * @param day
   * @param user
   * @param ad
   * @param count
   * @param connection
   * @return
   */
  private def checkUserCountGte(day: String, user: String, ad: String, count: Int, connection: Connection) = {
    val sql = "SELECT * FROM user_ad_count WHERE dt = ? AND usreid = ? AND adid = ? AND count >= ?"
    JDBCUtil.queryIsExist(connection, sql, Array(day, user, ad, count))
  }

  /**
   * 更新用户广告点击量
   * @param day
   * @param user
   * @param ad
   * @param count
   * @param connection
   */
  private def updateUserAdCount(day: String, user: String, ad: String, count: Int, connection: Connection) = {
    val sql = "UPDATE user_ad_count SET count = count + ? WHERE dt = ? AND userid = ? AND adid = ?"
    JDBCUtil.executeUpdate(connection, sql, Array(day, user, ad, count))
  }

  /**
   * 插入用户广告点击数据
   * @param day
   * @param user
   * @param ad
   * @param count
   * @param connection
   */
  private def insertUserAdCount(day: String, user: String, ad: String, count: Int, connection: Connection) = {
    val sql = "INSERT INTO user_ad_count (dt, userid, adid, count ) values(? ,? ,? ,?)"
    JDBCUtil.executeUpdate(connection, sql, Array(day, user, ad, count))

  }

  /**
   * 广告点击数据
   */
  case class AdClickData(ts:String, area:String, city:String, user:String, ad:String)
}
