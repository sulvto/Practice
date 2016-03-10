package me.qinchao.CXFService;

import me.qinchao.service.HelloServiceImpl;
import org.apache.cxf.frontend.ServerFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * Created by SULVTO on 16-3-10.
 */
public class Publish {
    public static void main(String[] args) {
        // http://192.168.1.28:9999/ws?wsdl
        ServerFactoryBean server = new ServerFactoryBean();
        String address = "http://192.168.1.28:9999/ws";
        server.setAddress(address);
        server.setServiceClass(IHelloService.class);
        server.setServiceBean(new HelloServiceImpl());
        server.create();
        System.out.println("CXF 发布成功！！");

    }
}
