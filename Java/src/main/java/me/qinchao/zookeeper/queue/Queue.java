package me.qinchao.zookeeper.queue;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.zookeeper.*;

import java.io.*;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

/**
 * producer-consumer queue
 * Created by sulvto on 16-5-8.
 */
public class Queue<T> implements Watcher {
    private final String root = "/root";
    static ZooKeeper zooKeeper;
    static Integer mutex;

    @Override
    public void process(WatchedEvent event) {
        synchronized (mutex) {
            mutex.notify();
        }
    }


    public Queue(String address) {
        if (zooKeeper == null) {
            try {
                zooKeeper = new ZooKeeper(address, 3000, this);

                if (zooKeeper.exists(root, false) == null) {
                    zooKeeper.create(root, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
                }

                mutex = new Integer(-1);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (KeeperException e) {
                e.printStackTrace();
            }
        }
    }

    public void clear() throws KeeperException, InterruptedException {
        List<String> children = zooKeeper.getChildren(root, true);
        children.stream()
                .filter(nodeName -> nodeName.startsWith("element"))
                .forEach(nodeName -> {
                    try {
                        zooKeeper.delete(root + "/" + nodeName, 0);
                    } catch (InterruptedException e) {
                        // TODO
                    } catch (KeeperException e) {
                        // TODO
                    }
                });
    }

    public boolean produce(T t) throws KeeperException, InterruptedException {
        try {
            ByteArrayOutputStream byteArrayOutputStream
                    = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(t);
            objectOutputStream.flush();

            byte[] bytes = byteArrayOutputStream.toByteArray();
            objectOutputStream.close();
            byteArrayOutputStream.close();

            zooKeeper.create(root + "/element", bytes, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }


    public T consume() throws KeeperException, InterruptedException {
        for (; ; ) {
            synchronized (mutex) {
                List<String> children = zooKeeper.getChildren(root, true);
                if (children.size() == 0) {
                    mutex.wait();
                } else {
                    Optional<String> min = children.stream()
                            .filter(s -> s.startsWith("element"))
                            .map(s -> s.substring(7))
                            .sorted((o1, o2) -> {
                                return new Integer(o1).compareTo(new Integer(o2));
                            })
                            .findFirst();
                    T result = null;

                    if (min.isPresent()) {
                        String consumeNode = root + "/element" + min.get();
                        byte[] data = zooKeeper.getData(consumeNode, false, null);
                        zooKeeper.delete(consumeNode, 0);

                        ByteArrayInputStream byteArrayInputStream
                                = new ByteArrayInputStream(data);

                        ObjectInputStream objectInputStream = null;
                        try {
                            objectInputStream = new ObjectInputStream(byteArrayInputStream);
                            result = (T) objectInputStream.readObject();
                        } catch (IOException e) {
                            // TODO
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            // TODO
                            e.printStackTrace();
                        }
                    }
                    return result;
                }
            }
        }
    }

}
