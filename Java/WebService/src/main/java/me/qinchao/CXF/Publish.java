package me.qinchao.CXF;

import me.qinchao.CXF.interceptor.AuthInterceptor;
import me.qinchao.CXF.service.IHelloService;
import me.qinchao.service.HelloServiceImpl;
import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Created by SULVTO on 16-3-10.
 */
public class Publish {
    public static void main(String[] args) {
        // TODO Client
        // http://192.168.1.28:9999/ws?wsdl
        ServerFactoryBean server = new ServerFactoryBean();
        String address = "http://192.168.1.28:9999/ws";
        server.setAddress(address);
        server.setServiceClass(IHelloService.class);
        server.setServiceBean(new HelloServiceImpl());
        server.getOutInterceptors().add(new AuthInterceptor());
        server.create();
        System.out.println("CXF 发布成功！！");

    }
}
