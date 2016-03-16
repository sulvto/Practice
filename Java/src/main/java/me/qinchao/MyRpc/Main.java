package me.qinchao.MyRpc;

import me.qinchao.HelloService.IHelloService;
import me.qinchao.HelloService.impl.HelloService;

/**
 * Created by SULVTO on 16-3-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MyRpc.publish(new HelloService(), 9999);
    }
}
