package me.qinchao;

import org.junit.Test;

import javax.jms.JMSException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by sulvto on 16-5-22.
 */
public class SendMessageTest {
    @Test
    public void test() throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(() -> {
            try {
                new SendAndReceive().sendMessage();
            } catch (JMSException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }).start();

        new Thread(() -> {
            try {
                new SendAndReceive().receiveMessage();
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
        new SendAndReceive().sendMessage();
    }

    @Test
    public void receiveMessage() throws Exception {
        new SendAndReceive().receiveMessage();
    }

}