package me.qinchao;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.zookeeper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.NotReadablePropertyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.List;

/**
 * Created by SULVTO on 16-3-29.
 */
@Component
public class ZooKeeperRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZooKeeperRegistry.class);

    private final static String ROOT = "/root";
    private ZooKeeper zkClient;
    private boolean isInit = false;
    private final String address;
    public ZooKeeperRegistry(){
        address = env.getProperty("registry.address");
        if (org.apache.commons.lang3.StringUtils.isBlank(address)) {
            throw new NotReadablePropertyException("registry address is blank");
        }
    }

    @Autowired
    private org.springframework.core.env.Environment env;


    private void init() {
        if (zkClient == null) {

            try {

                zkClient = new ZooKeeper("localhost:2182",
                        500000, new Watcher() {
                    public void process(WatchedEvent event) {
                        if (event.getState() == Event.KeeperState.SyncConnected) {
                            LOGGER.debug("已经触发了" + event.getType() + "事件！");
                        }
                    }
                });
                createNode(ROOT, CreateMode.PERSISTENT);
                isInit = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void createNode(String path, CreateMode mode) {
        if (!isInit) {
            init();
        }
        try {
            if (zkClient.exists(path, true) == null) {
                zkClient.create(path, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, mode);
            }
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void createRegistryNode(String serverAddress, String serviceName) {
        createNode(ROOT + "/" + serverAddress, CreateMode.PERSISTENT);
        createNode(ROOT + "/" + serverAddress + "/" + serviceName, CreateMode.EPHEMERAL);
    }

    void doRegister(String host, int port, String serviceName, Remote service) {
        try {
            // RMI
            LocateRegistry.createRegistry(port);
            String bindAddress = String.format("rmi://%s:%d/%s", host, port, serviceName);
            Naming.rebind(bindAddress, service);

            // zookeeper registry
            createRegistryNode(host + ":" + port, serviceName);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }


    public String lookup(String serviceName) {

        try {
            List<String> children = zkClient.getChildren(ROOT, true);
            for (int i = 0; i < children.size(); i++) {
                List<String> children2 = zkClient.getChildren(ROOT + "/" + children.get(i), true);
                if (children2.contains(serviceName)) {
                    return children.get(i) + "/" + serviceName;
                }
            }
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }


}
