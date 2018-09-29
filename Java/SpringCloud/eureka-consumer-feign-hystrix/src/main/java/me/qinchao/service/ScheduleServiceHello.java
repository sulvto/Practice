package me.qinchao.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sulvto on 18-7-31.
 */

@FeignClient(value = "service-hello", fallback = ScheduleServiceHelloHystrix.class)
public interface ScheduleServiceHello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
