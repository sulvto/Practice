package me.qinchao.web;

import me.qinchao.common.integration.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by sulvto on 2/13/19.
 */
@RestController
public class HelloController {

    @Autowired
    ContentService contentService;

    @RequestMapping("/")
    public String hello() {
        return "hello." + contentService.content();
    }
}
