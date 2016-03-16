package me.qinchao.MyRpc;

import me.qinchao.HelloService.IHelloService;
import me.qinchao.HelloService.impl.HelloService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Created by SULVTO on 16-3-16.
 */
public class MyRpcTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyRpcTest.class);
    @Test
    public void testRefer() throws Exception {
        IHelloService refer = MyRpc.call(IHelloService.class,"127.0.0.1", 9999);
        LOGGER.debug("invoke result---> " + refer.sayHello("World"));

    }
}