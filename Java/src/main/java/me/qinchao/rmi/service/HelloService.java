package me.qinchao.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by SULVTO on 16-3-15.
 */
public interface HelloService extends Remote {
    String sayHello(String name)throws RemoteException;
}
