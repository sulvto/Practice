package me.qinchao;

import me.qinchao.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by SULVTO on 16-3-28.
 */
public class AnnotationBean  implements Serializable, BeanPostProcessor {

    private static final long serialVersionUID = -7582802454287589552L;

    private static final Logger logger = LoggerFactory.getLogger(AnnotationBean.class);


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        Class<?> clazz = bean.getClass();
        if(isProxyBean(bean)){
            clazz = AopUtils.getTargetClass(bean);
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            try {
                if (! field.isAccessible()) {
                    field.setAccessible(true);
                }
                Reference reference = field.getAnnotation(Reference.class);
                if (reference != null) {
                    Object value = refer(reference, field.getType());
                    if (value != null) {
                        field.set(bean, value);
                    }
                }
            } catch (Exception e) {
                // modified by lishen
                throw new BeanInitializationException("Failed to init remote service reference at filed " + field.getName() + " in class " + bean.getClass().getName(), e);
//            	logger.error("Failed to init remote service reference at filed " + field.getName() + " in class " + bean.getClass().getName() + ", cause: " + e.getMessage(), e);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }


    private Object refer(Reference reference, Class<?> referenceClass) { //method.getParameterTypes()[0]

        try {
            return  Naming.lookup("rmi://127.0.0.1:9999/me.qinchao.api.service.HelloServiceImpl");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }


    private boolean isProxyBean(Object bean) {
        return AopUtils.isAopProxy(bean);
    }

}
