package me.qinchao.example.sql

import org.apache.spark.SparkConf
import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.expressions.{MutableAggregationBuffer, UserDefinedAggregateFunction}
import org.apache.spark.sql.types.{DataType, LongType, StructField, StructType}

/**
 * Created by sulvto on 21/03/2021.
 *
 * @author sulvto
 */
object SparkSQL_UDAF {
  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("sql_basic")
    val spark = SparkSession.builder().config(sparkConf).getOrCreate()

    // DataFrame
    val df = spark.read.json("datas/user.json")

    //    df.show()

    // DataFrame <=> SQL
    df.createOrReplaceTempView("user")

    spark.udf.register("ageAvg", new AvgUDAF())

    spark.sql("select ageAvg(age) from user").show

    // 关闭环境
    sparkConf.clone()
  }

  /**
   * 自定义聚合类函数（弱类型聚合函数）： 求年龄平均值
   */
  class AvgUDAF extends UserDefinedAggregateFunction {

    // 输入数据的结构
    override def inputSchema: StructType = {
      StructType(
        Array(
          StructField("age", LongType)
        )
      )
    }

    // 缓冲区数据的结构
    override def bufferSchema: StructType = {
      StructType(
        Array(
          StructField("total", LongType),
          StructField("count", LongType)
        )
      )
    }

    // 函数计算结果的数据类型
    override def dataType: DataType = LongType

    // 函数的稳定性
    override def deterministic: Boolean = true

    // 缓冲区初始化
    override def initialize(buffer: MutableAggregationBuffer): Unit = {
//      buffer(0) = 0L
//      buffer(1) = 0L
      buffer.update(0, 0L)
      buffer.update(1, 0L)
    }

    // 根据输入的值更新缓冲区数据
    override def update(buffer: MutableAggregationBuffer, input: Row): Unit = {
      buffer.update(0, buffer.getLong(0) + input.getLong(0))
      buffer.update(1, buffer.getLong(1) + 1)
    }


    // 缓冲区数据合并
    override def merge(buffer1: MutableAggregationBuffer, buffer2: Row): Unit = {
      buffer1.update(0, buffer1.getLong(0) + buffer2.getLong(0))
      buffer1.update(1, buffer1.getLong(1) + buffer2.getLong(1))
    }


    // 计算平均值
    override def evaluate(buffer: Row): Any = {
      buffer.getLong(0) / buffer.getLong(1)
    }
  }

}
