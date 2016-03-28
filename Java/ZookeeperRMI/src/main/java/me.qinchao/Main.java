package me.qinchao;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by SULVTO on 16-3-26.
 */
@Configuration
@ComponentScan
public class Main {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Main.class);

    @Bean
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        return annotationBean;
    }


    public static void run() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

//        context.start();

    }

    public static void main(String[] args) {
        run();
    }
}
