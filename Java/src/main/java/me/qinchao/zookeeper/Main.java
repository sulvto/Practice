package me.qinchao.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by SULVTO on 16-3-19.
 */
public class Main {
    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        new Thread(() -> {

            try {
                TimeUnit.SECONDS.sleep(2);

                // 创建一个与服务器的连接
                ZooKeeper zk = new ZooKeeper("localhost:2182",
                        500000, new Watcher() {
                    // 监控所有被触发的事件
                    public void process(WatchedEvent event) {
                        LOGGER.debug("已经触发了" + event.getType() + "事件！");
                    }
                });
                // 创建一个目录节点
                zk.create("/testRootPath", "testRootData".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                        CreateMode.PERSISTENT);
                // 创建一个子目录节点
                zk.create("/testRootPath/testChildPathOne", "testChildDataOne".getBytes(),
                        ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
                LOGGER.debug(new String(zk.getData("/testRootPath", false, null)));
                // 取出子目录节点列表
                LOGGER.debug(zk.getChildren("/testRootPath", true).toString());
                // 修改子目录节点数据
                zk.setData("/testRootPath/testChildPathOne", "modifyChildDataOne".getBytes(), -1);
                // 创建另外一个子目录节点
                zk.create("/testRootPath/testChildPathTwo", "testChildDataTwo".getBytes(),
                        ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
                LOGGER.debug(new String(zk.getData("/testRootPath/testChildPathTwo", true, null)));
                TimeUnit.SECONDS.sleep(2);

                // 删除子目录节点
                zk.delete("/testRootPath/testChildPathTwo", -1);
                zk.delete("/testRootPath/testChildPathOne", -1);
                // 删除父目录节点
                zk.delete("/testRootPath", -1);

                // 关闭连接
                zk.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        test();
    }

    public static void test() throws IOException, KeeperException, InterruptedException {

        // 创建一个与服务器的连接
        ZooKeeper zk = new ZooKeeper("localhost:2181", 500000, null);

        for (int i = 0; i < 40; i++) {
            Stat exists = zk.exists("/testRootPath", true);
            LOGGER.debug("目录节点状态：[" + exists + "]");
            if (exists != null) {
                List<String> children = zk.getChildren("/testRootPath", false);
                System.out.println("------------------------------------------------");
                children.forEach(System.out::println);
                System.out.println("------------------------------------------------");
            }
            TimeUnit.SECONDS.sleep(1);
        }
        zk.close();
    }
}