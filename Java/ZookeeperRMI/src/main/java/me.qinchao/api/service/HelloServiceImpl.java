package me.qinchao.api.service;

import me.qinchao.annotation.RpcRegistry;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by SULVTO on 16-3-15.
 */
//@RpcRegistry(host = "127.0.0.1",port = 9999)
public class HelloServiceImpl  extends UnicastRemoteObject implements HelloService {

    public HelloServiceImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "hello: " + name;
    }
}
