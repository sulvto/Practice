package me.qinchao.proxy.jdk;


import me.qinchao.proxy.Chinese;
import me.qinchao.proxy.Person;
import org.junit.Test;

/**
 * Created by SULVTO on 16-3-11.
 */
public class JdkProxyTest {

    @Test
    public void testInvoke() throws Exception {
        TransactionManager transactionManager = new TransactionManager();
        JdkProxy jdkProxy = new JdkProxy(new Chinese(), transactionManager);
        Person proxyObject = (Person)jdkProxy.createProxyObject();
        proxyObject.hello("proxy");
    }
}