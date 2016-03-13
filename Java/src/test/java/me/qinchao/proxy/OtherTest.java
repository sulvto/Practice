package me.qinchao.proxy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.util.concurrent.ListenableFutureTask;
import org.springframework.util.concurrent.SuccessCallback;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by SULVTO on 16-3-14.
 */
public class OtherTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(OtherTest.class);

    @Test
    public void testListenableFutureTask() {
        LOGGER.debug("testA");
        ListenableFutureTask<String> listenableFutureTask = new ListenableFutureTask(new Callable<String>() {
            @Override
            public String call() throws Exception {
                LOGGER.debug("call");
                Thread.sleep(3000);
                return "return";
            }
        });

        listenableFutureTask.addCallback(new SuccessCallback() {
            @Override
            public void onSuccess(Object result) {
                LOGGER.debug("onSuccess");
            }
        }, new FailureCallback() {
            @Override
            public void onFailure(Throwable ex) {
                LOGGER.debug("onFailure");
            }
        });


        try {
            listenableFutureTask.run();
            LOGGER.debug("futureTask.run");
            String s = listenableFutureTask.get();

            LOGGER.debug("futureTask.get");
            LOGGER.debug(s);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testThreadPoolExecutor() {

        int nThreads = 10;
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(nThreads);


        while (true) {
            while (executorService.getActiveCount() >= nThreads) {
                LOGGER.debug(executorService.getActiveCount() + "     sleep");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
            }
            LOGGER.debug(executorService.getActiveCount() + "");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    LOGGER.debug("submit ::" + new Date().getTime());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                    }
                }
            });
        }

    }
}
