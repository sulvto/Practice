package me.qinchao.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sulvto on 02/01/2021.
 *
 * @author sulvto
 */
@Controller
public class SystemController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health() {
        return "ok";
    }
}
