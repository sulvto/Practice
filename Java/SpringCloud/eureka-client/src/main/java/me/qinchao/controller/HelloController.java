package me.qinchao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by sulvto on 18-7-31.
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name") String name) {
        sleep();

        logger.info("port: {}, hello {}", port, name);

        return "Hello, " + name + " (port: " + port + ")";
    }

    private void sleep() {
        try {
            int millis = new Random().nextInt(5) * 800;
            logger.info("sleep {}", millis);
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }
}
