package me.qinchao.zookeeper.queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sulvto on 16-5-8.
 */
public class QueueTest {

    @Test
    public void testProduce() throws Exception {
        Queue<String> stringQueue = new Queue<>("localhost:2182");
        stringQueue.clear();
        stringQueue.produce("aaa");
        stringQueue.produce("ccc");
        stringQueue.produce("bbb");
        assertEquals(stringQueue.consume(), "aaa");
        assertEquals(stringQueue.consume(), "ccc");
        stringQueue.produce("ddd");
        assertEquals(stringQueue.consume(), "bbb");
        stringQueue.produce("eee");
        assertEquals(stringQueue.consume(), "ddd");
        assertEquals(stringQueue.consume(), "eee");

    }

    @Test
    public void testConsume() throws Exception {

    }
}