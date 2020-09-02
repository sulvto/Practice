package me.qinchao.demo;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.util.DaemonThreadFactory;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sulvto on 4/10/20.
 */
@Slf4j
public class Application {
    public static void main(String[] args) throws InterruptedException {
        // The factory for the event
        TaskFactory factory = new TaskFactory();

        // Specify the size of the ring buffer, must be power of 2.
        int bufferSize = 8;

        // Construct the Disruptor
        Disruptor<Task> disruptor = new Disruptor<>(factory, bufferSize, DaemonThreadFactory.INSTANCE);

        AtomicLong counter = new AtomicLong();

        // Connect the handler
        disruptor.handleEventsWith((event, sequence, endOfBatch) -> log.info("task count: {}", counter.incrementAndGet()))
                .then(new TaskAHandler())
                .thenHandleEventsWithWorkerPool(new TaskBHandler("1"), new TaskBHandler("2"))
                .then(new TaskC1Handler(), new TaskC2Handler())
                .then(new TaskDHandler())
                .then((event, sequence, endOfBatch) -> log.info("task count: {}", counter.decrementAndGet()));

        // Start the Disruptor, starts all threads running
        disruptor.start();

        // Get the ring buffer from the Disruptor to be used for publishing.
        RingBuffer<Task> ringBuffer = disruptor.getRingBuffer();

        TaskProducer producer = new TaskProducer(ringBuffer);

        for (long l = 0; true; l++)
        {
            producer.onData(l + "");
            Thread.sleep(500);
        }
    }

}
