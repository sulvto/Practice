package me.qinchao.example.sql

import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, Dataset, Row, SparkSession}

/**
 * Created by sulvto on 21/03/2021.
 *
 * @author sulvto
 */
object SparkSQL_Basic {
  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("sql_basic")
    val spark = SparkSession.builder().config(sparkConf).getOrCreate()

    // DataFrame
    val df = spark.read.json("datas/user.json")

//    df.show()

    // DataFrame <=> SQL
    df.createOrReplaceTempView("user")

//    spark.sql("select * from user").show
//    spark.sql("select username,age from user").show
//    spark.sql("select avg(age) from user").show

    // DataFrame <=> DSL
    // 在使用 DataFrame 时， 如果涉及到转换操作， 需要引入转换规则
    import spark.implicits._
    df.select("age", "username").show()
    df.select($"age" + 1).show()
    df.select('age + 1).show()

    // DataSet
    val seq = Seq(2, 5, 3, 7)
    val ds = seq.toDS()
    ds.show()

    // RDD <=> DataFrame
    val rdd = spark.sparkContext.makeRDD(List((1, "zhangsan", 18), (2, "lisi", 40)))
    val df2: DataFrame = rdd.toDF("id", "username", "age")
    val rowRDD: RDD[Row] = df2.rdd

    // DataFrame <=> DataSet
    val ds2:Dataset[User] = df2.as[User]
    val df3: DataFrame = ds2.toDF()

    // RDD <=> DataSet
    val ds3: Dataset[User] = rdd.map {
      case (id, username, age) => User(id, username, age)
    }.toDS()
    val userRDD: RDD[User] = ds3.rdd
    println(userRDD.toDebugString)

    // 关闭环境
    sparkConf.clone()
  }

  case class User(id:Int, username:String, age:Int)

}
