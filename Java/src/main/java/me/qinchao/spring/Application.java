package me.qinchao.spring;

import me.qinchao.spring.service.MessagePrinter;
import me.qinchao.spring.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Created by SULVTO on 16-3-15.
 */
//@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

        while (true) {
            TimeUnit.SECONDS.sleep(5);
        }
    }
}
