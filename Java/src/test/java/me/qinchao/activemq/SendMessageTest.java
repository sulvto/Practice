package me.qinchao.activemq;

import org.junit.Test;

import javax.jms.JMSException;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * Created by sulvto on 16-5-22.
 */
public class SendMessageTest {
    @Test
    public void test() throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(() -> {
            try {
                new SendMessage().sendMessage();
            } catch (JMSException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }

        }).start();

        new Thread(() -> {
            try {
                new SendMessage().receiveMessage();
            } catch (JMSException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }

        }).start();
        countDownLatch.await();
    }

    @Test
    public void sendMessage() throws Exception {
        new SendMessage().sendMessage();
    }

    @Test
    public void receiveMessage() throws Exception {
        new SendMessage().receiveMessage();
    }

}