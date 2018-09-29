package me.qinchao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sulvto on 16-7-7.
 */
@Controller
public class HomeController {
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
