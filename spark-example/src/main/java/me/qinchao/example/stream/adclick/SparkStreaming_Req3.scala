package me.qinchao.example.stream.adclick

import java.io.{File, FileWriter, PrintWriter}
import java.sql.Connection
import java.text.SimpleDateFormat
import java.util.Date

import me.qinchao.example.util.JDBCUtil
import org.apache.kafka.clients.consumer.{ConsumerConfig, ConsumerRecord}
import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.InputDStream
import org.apache.spark.streaming.kafka010.{ConsumerStrategies, KafkaUtils, LocationStrategies}
import org.apache.spark.streaming.{Seconds, StreamingContext}

import scala.collection.mutable.ListBuffer

/**
 * 案例3: 最近一小时广告点击量。
 *
 * Created by sulvto on 23/03/2021.
 *
 * @author sulvto
 */
object SparkStreaming_Req3 {
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

    val reduceDS = kafkaDataDS
      .map(kafkaData => {
        val data = kafkaData.value()
        val datas = data.split(" ")
        AdClickData(datas(0), datas(1), datas(2), datas(3), datas(4))
      })

      // 最近一分钟，每10秒计算一次
      // 12：01 => 12：00
      // 12：11 => 12：10
      // 12：19 => 12：10
      // 12：25 => 12：20
      // 12：59 => 12：50

      // 59 / 10 * 10 = 50

      // 这里涉及窗口的计算
      .map(
        data => {
          val ts = data.ts.toLong
          val newTs = ts / 10 * 10
          (newTs, 1)
        }
      )
      .reduceByKeyAndWindow((x: Int, y: Int) => x + y, Seconds(60), Seconds(10))

//    reduceDS.print()

    reduceDS.foreachRDD(
      rdd => {
        val list = ListBuffer[String]()
        rdd.sortByKey(true)
          .collect()
          .foreach {
            case (time, cnt) => {
              val timeString = new SimpleDateFormat("mm:ss").format(new Date(time.toLong))
              list.append(s"""{"xtime": "${timeString}", "yval": "${cnt}"}""")
            }
          }

        val out = new PrintWriter(new FileWriter(new File("./data/adclick/adclick.json")))

        out.println("[" + list.mkString(", ") + "]")
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
