package me.qinchao;

import org.apache.zookeeper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.concurrent.TimeUnit;
import java.util.function.*;

/**
 * 暴露服务的服务提供方
 * Created by SULVTO on 16-3-25.
 */
@Component
public class Provider {
    private static final Logger LOGGER = LoggerFactory.getLogger(Provider.class);


    private final static String ROOT = "/root";
    private ZooKeeper zkClient;
    java.util.function.BiConsumer<String, CreateMode> createNode = (path, mode) -> {
        try {
            if (zkClient.exists(path, true) == null) {
                zkClient.create(path, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, mode);
            }
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public Provider() {
        try {
            zkClient = new ZooKeeper("localhost:2182",
                    500000, new Watcher() {
                public void process(WatchedEvent event) {
                    if (event.getState() == Event.KeeperState.SyncConnected) {
                        LOGGER.debug("已经触发了" + event.getType() + "事件！");
                    }
                }
            });
            createNode.accept(ROOT,CreateMode.PERSISTENT);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    void publish(String host, int port, Remote service) {
        try {
            // RMI
            LocateRegistry.createRegistry(port);
            String serviceName = service.getClass().getName();
            String bindAddress = String.format("rmi://%s:%d/%s", host, port, serviceName);
            Naming.rebind(bindAddress, service);

            // zookeeper registry
            registry(host + ":" + port, serviceName);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void registry(String serverAddress, String serviceName) {


        createNode.accept(ROOT + "/" + serverAddress, CreateMode.PERSISTENT);
        createNode.accept(ROOT + "/" + serverAddress + "/" + serverAddress, CreateMode.EPHEMERAL);
    }
}
