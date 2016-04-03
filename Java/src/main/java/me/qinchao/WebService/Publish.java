package me.qinchao.WebService;

import javax.xml.ws.Endpoint;

/**
 * Created by SULVTO on 16-3-10.
 */
public class Publish {
    public static void main(String[] args) {
        // http://192.168.1.28:9999/hello?wsdl

        // client
        // wsimport -s . http://192.168.1.28:9999/hello?wsdl

        String address = "http://192.168.1.28:9999/hello";
        Object implementor = new HelloServiceImpl();

        Endpoint.publish(address, implementor);
        System.out.println("发布成功！！");

    }
}
