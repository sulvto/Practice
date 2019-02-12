package me.qinchao.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

/**
 * Created by sulvto on 1/31/19.
 */
@Controller
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        Principal userPrincipal = request.getUserPrincipal();
        String user = request.getRemoteUser();
        request.setAttribute("user", user);
        log.info("user name: {}", user);
        return "hello";
    }
}
