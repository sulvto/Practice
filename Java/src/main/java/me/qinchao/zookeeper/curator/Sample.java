package me.qinchao.zookeeper.curator;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.ExistsBuilder;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

import java.util.concurrent.TimeUnit;

/**
 * Created by SULVTO on 16-3-23.
 */
public class Sample {
    public static void main(String[] args) throws Exception {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);

        //Fluent Style
        CuratorFramework client = CuratorFrameworkFactory
                .builder()
                .connectString("127.0.0.1:2181")
                .sessionTimeoutMs(5000)
                .retryPolicy(retryPolicy)
                .build();
        client.start();

        //  NodeCache

        String path = "/zk-root/c1";
        client.create()
                //creating Parents(/zk-root) If Needed
                .creatingParentsIfNeeded()
                //just /c1
                .withMode(CreateMode.EPHEMERAL)
                .forPath(path, "data".getBytes());

        ExistsBuilder existsBuilder = client.checkExists();

//        Stat stat = existsBuilder.forPath(path);
        System.out.println("stat :" + existsBuilder.forPath(path));
        TimeUnit.SECONDS.sleep(1);
        System.out.println("path:" + path + "  data:" + new String(client.getData().forPath(path)));
        TimeUnit.SECONDS.sleep(1);
        client.setData().forPath(path, "data2".getBytes());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("path:" + path + "  data:" + new String(client.getData().forPath(path)));
        TimeUnit.SECONDS.sleep(1);
        client.delete().guaranteed().forPath(path);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("stat :" + existsBuilder.forPath(path));

        client.close();
    }
}
