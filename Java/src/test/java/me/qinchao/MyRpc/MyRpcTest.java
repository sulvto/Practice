package me.qinchao.MyRpc;

import me.qinchao.HelloService.IHelloService;
import me.qinchao.HelloService.impl.HelloService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SULVTO on 16-3-16.
 */
public class MyRpcTest {

    @Test
    public void testRefer() throws Exception {
        IHelloService refer = MyRpc.refer(IHelloService.class, 9999);
        refer.sayHello("World");

    }
}