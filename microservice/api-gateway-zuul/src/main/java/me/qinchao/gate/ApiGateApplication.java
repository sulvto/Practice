package me.qinchao.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sulvto on 18-8-2.
 */
@SpringBootApplication
@EnableZuulProxy
public class ApiGateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGateApplication.class, args);
    }
}
