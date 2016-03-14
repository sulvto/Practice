package me.qinchao.rmi;

import me.qinchao.rmi.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by SULVTO on 16-3-15.
 */
public class HelloClient {
    private final static Logger LOGGER = LoggerFactory.getLogger(HelloClient.class);

    public static void main(String args[]) {
        try {
            //在RMI服务注册表中查找名称为Hello的对象，并调用其上的方法
            HelloService helloService = (HelloService) Naming.lookup("rmi://localhost:8888/Hello");
            LOGGER.debug(helloService.sayHello("zhangsan"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
