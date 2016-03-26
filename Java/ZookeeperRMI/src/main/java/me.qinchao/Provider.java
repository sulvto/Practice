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

/**
 * 暴露服务的服务提供方
 * Created by SULVTO on 16-3-25.
 */
@Component
public class Provider {
    private static final Logger LOGGER = LoggerFactory.getLogger(Provider.class);


    private final static String ROOT = "/root";
    private ZooKeeper zkClient;

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
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    void publish(String host, int port, Remote service) throws IOException {
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

    private void registry(String serviceName, String serverAddress) {
        try {
            String path = String.format("%s/%s/%s", ROOT, serviceName, serverAddress);
            zkClient.create(path, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE,
                    CreateMode.EPHEMERAL);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
