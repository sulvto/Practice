package me.qinchao.spring.service.impl;

import me.qinchao.spring.service.MessagePrinter;
import me.qinchao.spring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by SULVTO on 16-3-15.
 */
@Component
public class MessagePrinterImpl implements MessagePrinter {
    final private MessageService service;

    @Autowired
    public MessagePrinterImpl(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
