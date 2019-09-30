package me.qinchao.example;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by sulvto on 3/19/19.
 */
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    public Listener listener() {
        return new Listener();
    }

    class Listener {
        private final Logger logger = LoggerFactory.getLogger(ConsumerApplication.class);

        @KafkaListener(topics = {"test-topic"})
        public void listen(ConsumerRecord record) {
            logger.info("kafka key: {}", record.key());
            logger.info("kafka value: {}", record.value());
            logger.info("kafka offset: {}", record.offset());
        }
    }
}
