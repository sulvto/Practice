package me.qinchao.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sulvto on 3/19/19.
 */
@SpringBootApplication
@RestController
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    private final static Logger logger = LoggerFactory.getLogger(ProducerApplication.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("/send")
    public Map<String, Object> sendKafka(String message) {
        Map<String, Object> result = new HashMap<>();

        try {
            logger.info("kafka send: {}", message);
            kafkaTemplate.send("test-topic", message);

            logger.info("Successfully!");

            result.put("message", "Successfully!");
            result.put("error", 0);
            return result;
        } catch (Exception e) {
            logger.info("Failed!");
            result.put("message", "Failed!");
            result.put("error", 1);
            return result;
        }
    }
}
