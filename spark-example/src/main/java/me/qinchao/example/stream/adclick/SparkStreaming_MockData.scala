package me.qinchao.example.stream.adclick

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}

import scala.collection.mutable.ListBuffer
import scala.util.Random

/**
 * Created by sulvto on 22/03/2021.
 *
 * @author sulvto
 */
object SparkStreaming_MockData {

  def main(args: Array[String]): Unit = {
    // 生成模拟数据
    // 时间戳 省份 城市 用户 广告

    // Application => Kafka => SparkStreaming => Analysis
    val prop = new Properties()
    // 添加配置
    prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
    prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
    prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
    val producer = new KafkaProducer[String, String](prop)

    while (true) {
      mockdata().foreach(
        data => {
          // 向 Kafka 生产数据
          val record = new ProducerRecord[String, String]("spark-streaming", data)
          producer.send(record)
          println(data)
        }
      )

      Thread.sleep(2000)
    }
  }

  def mockdata(): ListBuffer[String] = {
    val list = ListBuffer[String]()
    val areaList = ListBuffer[String]("华北", "华东", "华南")
    val cityList = ListBuffer[String]("北京", "成都", "上海")
    for (i <- 1 to 30) {
      val area = areaList(new Random().nextInt(3))
      val city = cityList(new Random().nextInt(3))
      val userid = new Random().nextInt(6)
      val adid = new Random().nextInt(6)
      list.append(s"${System.currentTimeMillis()} ${area} ${city} ${userid} ${adid}")
    }

    list
  }

}
