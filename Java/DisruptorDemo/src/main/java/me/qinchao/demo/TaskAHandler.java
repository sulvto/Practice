package me.qinchao.demo;

import com.alibaba.fastjson.JSON;
import com.lmax.disruptor.WorkHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * Created by sulvto on 4/10/20.
 */
@Slf4j
public class TaskAHandler implements com.lmax.disruptor.EventHandler<Task>, WorkHandler<Task> {

    void handleA(Task task) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread.sleep(new Random().nextInt(5) * 1000);
        task.setA("a");
        log.info("TaskAHandler time: {}, task ->> {}", System.currentTimeMillis() - startTime, JSON.toJSONString(task));

    }

    public void onEvent(Task task, long l, boolean b) throws Exception {
        handleA(task);
    }

    public void onEvent(Task task) throws Exception {
        handleA(task);
    }
}
