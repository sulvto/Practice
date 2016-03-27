package me.qinchao;

import me.qinchao.annotation.RpcRegistry;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Map;
import java.util.logging.Logger;

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

        Provider provider = context.getBean(Provider.class);
        Map<String, Object> serviceBeanMap = context.getBeansWithAnnotation(RpcRegistry.class); // 获取所有带有 RpcService 注解的 Spring Bean
        if (!serviceBeanMap.isEmpty()) {
            // registry
            for (Object registryBean : serviceBeanMap.values()) {
                RpcRegistry annotation = registryBean.getClass().getAnnotation(RpcRegistry.class);
                LOGGER.debug(registryBean.getClass().getName());
                provider.publish(annotation.host(),annotation.port(),(Remote) registryBean);
            }



            //todo
        }
    }

    public static void main(String[] args) {
        run();
    }
}
