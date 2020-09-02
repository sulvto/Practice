package me.qinchao.demo;

import com.alibaba.fastjson.JSON;
import com.lmax.disruptor.WorkHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * Created by sulvto on 4/12/20.
 */
@Slf4j
public class TaskDHandler implements com.lmax.disruptor.EventHandler<Task>, WorkHandler<Task> {

    void handleC(Task task) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        if (StringUtils.isEmpty(task.getA()) || StringUtils.isEmpty(task.getB()) || StringUtils.isEmpty(task.getC1()) || StringUtils.isEmpty(task.getC2())) {
            log.error("[TaskDHandler] task A or B or C is null, task: {}", JSON.toJSONString(task));
            throw new RuntimeException("[TaskDHandler] task A or B or C is null");
        }
        Thread.sleep(new Random().nextInt(3) * 1000);
        task.setEndTime(System.currentTimeMillis());
        task.setRuningTime(task.getEndTime() - task.getStartTime());
        log.info("TaskDHandler time: {}, task ->> {}", System.currentTimeMillis() - startTime, JSON.toJSONString(task));
    }

    public void onEvent(Task task, long l, boolean b) throws Exception {
        handleC(task);
    }

    public void onEvent(Task task) throws Exception {
        handleC(task);
    }
}
