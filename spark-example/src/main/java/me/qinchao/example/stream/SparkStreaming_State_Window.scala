package me.qinchao.example.stream

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.DStream
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
 * Created by sulvto on 22/03/2021.
 *
 * @author sulvto
 */
object SparkStreaming_State_Window {

  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming")
    val ssc = new StreamingContext(sparkConf, Seconds(3))

    // nc -lp 9999
    val lines = ssc.socketTextStream("localhost", 9999)

    val wordToOne = lines.map((_, 1))

    // 窗口的范围应该是采集周期的整数倍
    // 窗口可以滑动， 但是默认下，一个采集周期进行滑动
    // 为了避免滑动出现的重复数据的计算，可以改变滑动的步长
    // 窗口时长： 计算内容的时间范围
    // 滑动步长： 隔多久触发一次计算
    // 注意： 这两者都必须是采集周期大小的整数倍
    val windowDS = wordToOne.window(Seconds(6), Seconds(6))

    val wordToCount = windowDS.reduceByKey(_ + _)
    wordToCount.print()

    // SparkStreaming 采集器是长期执行的任务，所以不能直接关闭
    // 1. 启动采集器
    ssc.start()
    // 2. 等待采集器的关闭
    ssc.awaitTermination()
  }

}
