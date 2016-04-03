package me.qinchao.HelloService.impl;

import me.qinchao.HelloService.IHelloService;

/**
 * Created by SULVTO on 16-3-11.
 */
public class HelloService implements IHelloService {
    public String sayHello(String name) {
        return "hello: " + name;
    }
}
