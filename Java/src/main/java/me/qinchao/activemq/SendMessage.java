package me.qinchao.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by sulvto on 16-5-22.
 */
public class SendMessage {
    private final String QUEUE_NAME = "FirstQueue";


    void sendMessage() throws JMSException {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        Connection connection = activeMQConnectionFactory.createConnection("admin", "admin");
        connection.start();
        Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
        Queue firstQueue = session.createQueue(QUEUE_NAME);

        MessageProducer producer = session.createProducer(firstQueue);
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

        for (int i = 0; i < 10; i++) {
            String text = "Message " + i;
            System.out.println("send :: " + text);
            TextMessage textMessage = session.createTextMessage(text);
            producer.send(textMessage);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
            }
        }

        session.commit();
        connection.close();
    }

    void receiveMessage() throws JMSException {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        Connection connection = activeMQConnectionFactory.createConnection("admin", "admin");
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Queue firstQueue = session.createQueue(QUEUE_NAME);
        MessageConsumer consumer = session.createConsumer(firstQueue);

        for (; ; ) {
            TextMessage receive = (TextMessage) consumer.receive(10000);
            if (receive == null) {
                break;
            } else {
                System.out.println("receive :: " + receive.getText());
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                }
            }

        }

        connection.close();
    }


}
