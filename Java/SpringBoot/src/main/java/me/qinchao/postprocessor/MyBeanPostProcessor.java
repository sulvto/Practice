package me.qinchao.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 2/13/19.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        System.out.println("============ MyBeanPostProcessor construct =============");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(String.format("====== MyBeanPostProcessor postProcessAfterInitialization beanName: %s ======", beanName));
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(String.format("====== MyBeanPostProcessor postProcessBeforeInitialization beanName: %s ======", beanName));
        return bean;
    }
}
