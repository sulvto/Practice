package me.qinchao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;

/**
 * Created by sulvto on 16-5-15.
 */
@Component
public class BeanHandle implements InitializingBean, BeanFactoryPostProcessor, BeanPostProcessor {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
        System.out.println("BeanFactoryPostProcessor.postProcessBeanFactory");
        while (beanNamesIterator.hasNext()) {
            System.out.println(beanNamesIterator.next());
        }
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor.postProcessBeforeInitialization::" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor.postProcessAfterInitialization::" + beanName);
        return bean;
    }
}
