package me.qinchao;

import me.qinchao.bean.ImportService;
import me.qinchao.listrner.MyApplicationListener;
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

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        applicationContext.addApplicationListener(new MyApplicationListener());
    }
}
