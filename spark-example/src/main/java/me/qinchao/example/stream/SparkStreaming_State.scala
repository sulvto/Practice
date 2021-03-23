package me.qinchao.example.stream

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
 * Created by sulvto on 22/03/2021.
 *
 * @author sulvto
 */
object SparkStreaming_State {

  def main(args: Array[String]): Unit = {

    // 创建 SparkSQL 的运行环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming")
    val ssc = new StreamingContext(sparkConf, Seconds(3))
    ssc.checkpoint("cp")

    // nc -lp 9999
    val lines: ReceiverInputDStream[String] = ssc.socketTextStream("localhost", 9999)
    val wordToOne = lines.map((_, 1))
    // 根据key对数据的状态进行更新
    // 使用有状态数据时需要设置检查点
    val state = wordToOne.updateStateByKey((seq: Seq[Int], buff: Option[Int]) => {
      val newCount = buff.getOrElse(0) + seq.sum
      Option(newCount)
    })
    state.print()

    // SparkStreaming 采集器是长期执行的任务，所以不能直接关闭
    // 1. 启动采集器
    ssc.start()
    // 2. 等待采集器的关闭
    ssc.awaitTermination()
  }

}
