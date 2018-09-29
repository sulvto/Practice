package me.qinchao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sulvto on 18-8-4.
 */
@RestController
class TestController {

    @Value("${from}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
