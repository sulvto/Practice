package me.qinchao.service;

import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 18-7-31.
 */
@Component
public class ScheduleServiceHelloHystrix implements ScheduleServiceHello {

    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry, " + name + " (Hystrix)";
    }
}
