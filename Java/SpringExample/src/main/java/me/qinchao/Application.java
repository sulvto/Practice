package me.qinchao;

import me.qinchao.service.MessagePrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by SULVTO on 16-3-15.
 */
//@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        context.start();
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
