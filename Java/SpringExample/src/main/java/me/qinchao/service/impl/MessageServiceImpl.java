package me.qinchao.service.impl;

import me.qinchao.service.MessageService;
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
