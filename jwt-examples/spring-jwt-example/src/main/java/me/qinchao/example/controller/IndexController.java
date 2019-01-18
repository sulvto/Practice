package me.qinchao.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sulvto on 1/17/19.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "home";
    }

    @RequestMapping("/index")
    @ResponseBody
    String index() {
        return "index";
    }
}
