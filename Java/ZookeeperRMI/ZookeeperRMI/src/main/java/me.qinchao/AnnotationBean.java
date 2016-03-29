package me.qinchao;

import me.qinchao.annotation.Reference;
import me.qinchao.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by SULVTO on 16-3-28.
 */
@Component
public class AnnotationBean implements Serializable, BeanPostProcessor, ApplicationContextAware {

    private static final long serialVersionUID = -7582802454287589552L;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        Class<?> clazz = bean.getClass();
        if (isProxyBean(bean)) {
            clazz = AopUtils.getTargetClass(bean);
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Reference reference = field.getAnnotation(Reference.class);
                if (reference != null) {
                    Object value = refer(field.getType());
                    if (value != null) {
                        field.set(bean, value);
                    }
                }
            } catch (Exception e) {
                throw new BeanInitializationException("Failed to init remote service reference at filed " + field.getName() + " in class " + bean.getClass().getName(), e);
            }
        }
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();
        if (isProxyBean(bean)) {
            clazz = AopUtils.getTargetClass(bean);
        }
        Service service = clazz.getAnnotation(Service.class);
        if (service != null) {
            publish(service, bean);
        }
        return bean;
    }

    private void publish(Service service, Object bean) {
        ZooKeeperRegistry registry = applicationContext.getBean(ZooKeeperRegistry.class);
        Class<?>[] interfaces = bean.getClass().getInterfaces();
        String name = interfaces[0].getName();
        registry.doRegister(service.host(), service.port(), name, (Remote) bean);
    }

    private Object refer(Class<?> referenceClass) throws RemoteException, NotBoundException, MalformedURLException {
        ZooKeeperRegistry registry = applicationContext.getBean(ZooKeeperRegistry.class);
        String url = registry.lookup(referenceClass.getName());
        return url == null ? null : Naming.lookup("rmi://" + url);
    }


    private boolean isProxyBean(Object bean) {
        return AopUtils.isAopProxy(bean);
    }

}
