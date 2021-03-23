package me.qinchao.example.stream

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
 * Created by sulvto on 22/03/2021.
 *
 * @author sulvto
 */
object SparkStreaming_Resume {

  def main(args: Array[String]): Unit = {

    val ssc = StreamingContext.getActiveOrCreate("cp", () => {

      // 创建 SparkSQL 的运行环境
      val sparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming")
      val ssc = new StreamingContext(sparkConf, Seconds(3))

      // nc -lp 9999
      val lines = ssc.socketTextStream("localhost", 9999)

      val wordToOne = lines.map((_, 1))
      wordToOne.print()
      ssc
    })

    ssc.checkpoint("cp")

    // SparkStreaming 采集器是长期执行的任务，所以不能直接关闭
    // 1. 启动采集器
    ssc.start()
    // 2. 等待采集器的关闭
    ssc.awaitTermination()

    // 优雅关闭, 当前的所有任务执行完再关闭
    // ssc.stop(true, true)
  }

}
