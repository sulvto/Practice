package me.qinchao.example.stream

import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}
import org.apache.spark.streaming.{Seconds, StreamingContext}

import scala.collection.mutable

/**
 * Created by sulvto on 21/03/2021.
 *
 * @author sulvto
 */
object SparkStreaming_Queue {

  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming")
    val ssc = new StreamingContext(sparkConf, Seconds(3))

    val rddQueue = new mutable.Queue[RDD[Int]]()
    val inputStream = ssc.queueStream(rddQueue, oneAtATime = false)
    val mappedStream = inputStream.map((_, 1))
    val reducedStream = mappedStream.reduceByKey(_ + _)
    reducedStream.print()

    // SparkStreaming 采集器是长期执行的任务，所以不能直接关闭
    // 1. 启动采集器
    ssc.start()

    for (i <- 1 to 50) {
      rddQueue += ssc.sparkContext.makeRDD(1 to 300, 10)
      Thread.sleep(2000)
    }

    // 2. 等待采集器的关闭
    ssc.awaitTermination()
  }

}
