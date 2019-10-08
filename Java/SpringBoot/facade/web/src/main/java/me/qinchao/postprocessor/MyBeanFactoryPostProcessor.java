package me.qinchao.postprocessor;

import me.qinchao.bean.SimpleBeanInBeanFactoryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 2/13/19.
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        System.out.println("======= MyBeanFactoryPostProcessor construct =======");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("======= postProcessBeanFactory =======");
        beanFactory.registerSingleton("createByBeanFactoryPostProcessor", new SimpleBeanInBeanFactoryPostProcessor());

        if (beanFactory instanceof BeanDefinitionRegistry) {

        }
    }
}
