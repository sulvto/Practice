/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.qinchao;

import org.apache.zookeeper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * ZookeeperRegistry
 */
@Component
public class ZookeeperRegistry {

    private final static Logger LOGGER = LoggerFactory.getLogger(ZookeeperRegistry.class);

    private final static String ROOT = "/root";
    private ZooKeeper zkClient;

    public ZookeeperRegistry() {
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

    void registry(String serverAddress, String serviceName) {
        try {
            zkClient.create(ROOT+"/"+serviceName+"/"+serverAddress, "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                    CreateMode.EPHEMERAL);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


//    private void createNode(ZooKeeper zk, String data) {
//        try {
//            byte[] bytes = data.getBytes();
//            String path = zk.create(Constant.ZK_DATA_PATH, bytes, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
//            LOGGER.debug("create zookeeper node ({} => {})", path, data);
//        } catch (KeeperException | InterruptedException e) {
//            LOGGER.error("", e);
//        }
//    }
//    public void lookup() {
//
//        try {
//            List<String> providers = new ArrayList<String>();
//            for (String path : toCategoriesPath(url)) {
//                List<String> children = zkClient.getChildren(path);
//                if (children != null) {
//                    providers.addAll(children);
//                }
//            }
//            return toUrlsWithoutEmpty(url, providers);
//        } catch (Throwable e) {
//            throw new RpcException("Failed to lookup " + url + " from zookeeper " + getUrl() + ", cause: " + e.getMessage(), e);
//        }
//    }
//

}