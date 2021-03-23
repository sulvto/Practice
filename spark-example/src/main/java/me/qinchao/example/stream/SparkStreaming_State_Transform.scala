package me.qinchao.example.stream

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
 * Created by sulvto on 22/03/2021.
 *
 * @author sulvto
 */
object SparkStreaming_State_Transform {

  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming")
    val ssc = new StreamingContext(sparkConf, Seconds(3))
    ssc.checkpoint("cp")

    // nc -lp 9999
    val lines: ReceiverInputDStream[String] = ssc.socketTextStream("localhost", 9999)

    // transform 方法可以将底层 RDD 获取到后进行操作
    // Code: Driver 端
    // 1. DStream 功能不完善
    // 2. 需要代码周期性的执行
    val newDs:DStream[String] = lines.transform(rdd => {
      // Code: Driver 端，（周期性执行）
      rdd.map(data => {
        // Code: Executor 端
        data
      })
    })

    // Code: Driver 端
    val newDs2:DStream[String] = lines.map(data => {
      // Code: Executor 端
      data
    })

    // SparkStreaming 采集器是长期执行的任务，所以不能直接关闭
    // 1. 启动采集器
    ssc.start()
    // 2. 等待采集器的关闭
    ssc.awaitTermination()
  }

}
