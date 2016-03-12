package me.qinchao.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by SULVTO on 16-3-9.
 */
@Service
public class Chinese implements Person {
    private final static Logger LOGGER = LoggerFactory.getLogger(Chinese.class);

    public String hello(String name) {
        LOGGER.debug("hello: " + name);
        return "hello: " + name;
    }
}
