package me.qinchao.MyRpc.zookeeperRpc.Provider;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

/**
 * Created by SULVTO on 16-3-25.
 */
public class Registry {
    RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);

    CuratorFramework zkClient = CuratorFrameworkFactory
            .builder()
            .connectString("127.0.0.1:2181")
            .sessionTimeoutMs(5000)
            .retryPolicy(retryPolicy)
            .build();
    public Registry(){
        zkClient.start();
    }

    protected void doRegister(String path) {
        try {
            zkClient.create()
                    .creatingParentsIfNeeded()
                    .withMode(CreateMode.EPHEMERAL)
                    .forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
