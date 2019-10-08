package me.qinchao;

import me.qinchao.bean.ImportService;
import me.qinchao.listrner.MyApplicationListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by sulvto on 2/13/19.
 */
@SpringBootApplication
@Import(ImportService.class)
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("main start.");
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        applicationContext.addApplicationListener(new MyApplicationListener());
    }
}
