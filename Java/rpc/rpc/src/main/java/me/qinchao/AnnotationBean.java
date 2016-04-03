package me.qinchao;

import me.qinchao.annotation.Reference;
import me.qinchao.annotation.RpcService;
import me.qinchao.api.ProtocolConfig;
import me.qinchao.api.RegistryConfig;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by SULVTO on 16-3-28.
 */
@Component
public class AnnotationBean implements BeanPostProcessor, ApplicationContextAware {


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
        RpcService service = clazz.getAnnotation(RpcService.class);
        if (service != null) {
            export(service, bean);
        }
        return bean;
    }

    private void export(RpcService service, Object serviceObject) {
        ServiceHandler serviceHandler = new ServiceHandler(new ProtocolConfig(service.host(), service.port()), new RegistryConfig(service.host(), service.port(), serviceObject.getClass().getName()));
        serviceHandler.export(serviceObject);
    }

    private Object refer(Class<?> referenceClass) throws RemoteException, NotBoundException, MalformedURLException {
        ServiceHandler serviceHandler = new ServiceHandler();
        RegistryConfig registryConfig = new RegistryConfig(referenceClass.getName());
        registryConfig.setReferenceClass(referenceClass);

        serviceHandler.setRegistryConfig(registryConfig);
        return serviceHandler.refer();
    }


    private boolean isProxyBean(Object bean) {
        return AopUtils.isAopProxy(bean);
    }

}
