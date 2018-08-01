package me.qinchao.controller;


import me.qinchao.service.ScheduleServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sulvto on 18-7-31.
 */
@RestController
public class HelloController {

    @Autowired
    private ScheduleServiceHello scheduleServiceHello;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam String name) {
        return scheduleServiceHello.sayHelloFromClientOne(name);
    }
}
