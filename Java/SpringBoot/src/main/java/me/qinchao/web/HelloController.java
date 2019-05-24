package me.qinchao.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sulvto on 2/13/19.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
