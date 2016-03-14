package me.qinchao.spring.service.impl;

import me.qinchao.spring.service.MessageService;
import org.springframework.stereotype.Component;

/**
 * Created by SULVTO on 16-3-15.
 */
@Component
public class MessageServiceImpl implements MessageService {
    public String getMessage(){
        return "hello";
    }
}
