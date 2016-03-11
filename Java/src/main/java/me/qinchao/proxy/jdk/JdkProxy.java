package me.qinchao.proxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by SULVTO on 16-3-11.
 */
public class JdkProxy implements InvocationHandler {
    private Object target;

    private TransactionManager transactionManager;

    public JdkProxy(Object target, TransactionManager transactionManager) {
        super();
        this.target = target;
        this.transactionManager = transactionManager;
    }

    public Object createProxyObject() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnObject = null;
        try {
            transactionManager.begin();
            returnObject = method.invoke(target, args);
            transactionManager.commit();
        } catch (Exception e) {
            transactionManager.rollback();
        } finally {
            transactionManager.close();
        }
        return returnObject;
    }


}
