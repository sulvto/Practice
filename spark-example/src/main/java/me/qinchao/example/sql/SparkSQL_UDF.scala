package me.qinchao.example.sql

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
 * Created by sulvto on 21/03/2021.
 *
 * @author sulvto
 */
object SparkSQL_UDF {
  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("sql_basic")
    val spark = SparkSession.builder().config(sparkConf).getOrCreate()

    // DataFrame
    val df = spark.read.json("datas/user.json")

    //    df.show()

    // DataFrame <=> SQL
    df.createOrReplaceTempView("user")

    spark.udf.register("prefixName", (name:String) => {
      "name:" + name
    })

    spark.sql("select age, 'name: ' + username from user").show
    spark.sql("select age, prefixName(username) from user").show

    // 关闭环境
    sparkConf.clone()
  }
}
