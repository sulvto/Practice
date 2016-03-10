package me.qinchao.hessian.service.impl;

import me.qinchao.hessian.service.HessianService;

/**
 * Created by SULVTO on 16-3-9.
 */
public class HessianServiceImpl implements HessianService {
    public String sayHello(String name) {
        System.out.println("sayHello:" + name);
        return "hello: " + name;
    }
}
