package me.qinchao;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by SULVTO on 16-3-16.
 */
@ComponentScan
public class Main {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void run() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);
        context.start();

        System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date()) + " Main application started!");
    }

    public static void main(String[] args) {
        run();
    }
}

