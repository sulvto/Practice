package me.qinchao.rmi;

import me.qinchao.rmi.service.HelloService;
import me.qinchao.rmi.service.HelloServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by SULVTO on 16-3-15.
 */
public class HelloServer {
    private final static Logger LOGGER = LoggerFactory.getLogger(HelloServer.class);
    public static void main(String args[]) {

        try {
            //创建一个远程对象
            HelloService helloService= new HelloServiceImpl();
            //本地主机上的远程对象注册表Registry的实例，并指定端口为8888，这一步必不可少（Java默认端口是1099），必不可缺的一步，缺少注册表创建，则无法绑定对象到远程注册表上
            LocateRegistry.createRegistry(8888);

            //把远程对象注册到RMI注册服务器上，并命名为Hello
            //绑定的URL标准格式为：rmi://host:port/name(其中协议名可以省略，下面两种写法都是正确的）
            Naming.bind("rmi://localhost:8888/Hello",helloService);
//            Naming.bind("//localhost:8888/Hello",helloService);

            LOGGER.debug(">>>>>INFO:远程HelloService对象绑定成功！");
        } catch (RemoteException e) {
            LOGGER.error("创建远程对象发生异常！",e);
        } catch (AlreadyBoundException e) {
            LOGGER.error("发生重复绑定对象异常！",e);
        } catch (MalformedURLException e) {
            LOGGER.error("发生URL畸形异常！",e);
        }
    }
}
