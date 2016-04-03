package me.qinchao.proxy.aop;

import me.qinchao.proxy.Chinese;
import me.qinchao.proxy.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by SULVTO on 16-3-12.
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = false)
@ComponentScan(value = {"me.qinchao"})
public class AopConfig {
    @Bean
    public AspectProxy aspectProxy() throws Exception {
        return new AspectProxy();
    }

    @Bean
    public Person person() {
        Person person = new Chinese();
        return person;
    }

}