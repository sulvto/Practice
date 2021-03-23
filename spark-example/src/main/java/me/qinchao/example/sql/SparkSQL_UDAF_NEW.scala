package me.qinchao.example.sql

import org.apache.spark.sql.expressions.Aggregator
import org.apache.spark.sql.{Encoder, SparkSession, functions}
import org.apache.spark.{SparkConf, sql}

/**
 * Created by sulvto on 21/03/2021.
 *
 * @author sulvto
 */
object SparkSQL_UDAF_NEW {
  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("sql_basic")
    val spark = SparkSession.builder().config(sparkConf).getOrCreate()

    // DataFrame
    val df = spark.read.json("datas/user.json")

    //    df.show()

    // DataFrame <=> SQL
    df.createOrReplaceTempView("user")

    spark.udf.register("ageAvg", functions.udaf(new AvgUDAF()))

    spark.sql("select ageAvg(age) from user").show

    // 关闭环境
    sparkConf.clone()
  }

  /**
   * 自定义聚合类函数（强类型聚合函数）： 求年龄平均值
   *
   * IN: 输入的数据类型 Long
   * BUF: 缓冲区的数据类型 Buff
   * OUT: 输出的数据类型 Long
   *
   */
  class AvgUDAF extends Aggregator[Long, Buff, Long] {

    // 缓冲区的初始化
    override def zero: Buff = {
      Buff(0L, 0L)
    }

    // 根据输入的数据更新缓冲区的数据
    override def reduce(buff: Buff, in: Long): Buff = {
      buff.total = buff.total + in
      buff.count = buff.count + 1
      buff
    }

    // 合并缓冲区
    override def merge(buff1: Buff, buff2: Buff): Buff = {
      buff1.total = buff1.total + buff2.total
      buff1.count = buff1.count + buff2.count
      buff1
    }

    // 计算结果
    override def finish(reduction: Buff): Long = {
      reduction.total / reduction.count
    }

    // 缓冲区的编码操作
    override def bufferEncoder: Encoder[Buff] = sql.Encoders.product

    // 计算结果的编码操作
    override def outputEncoder: Encoder[Long] = sql.Encoders.scalaLong
  }

  // AvgUDAF 的缓冲区
  case class Buff(var total: Long, var count: Long)

}
