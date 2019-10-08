package me.qinchao.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by sulvto on 2/12/19.
 */
@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
