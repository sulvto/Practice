package me.qinchao.demo;

import com.alibaba.fastjson.JSON;
import com.lmax.disruptor.WorkHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * Created by sulvto on 4/10/20.
 */
@Slf4j
public class TaskC2Handler implements com.lmax.disruptor.EventHandler<Task>, WorkHandler<Task> {

    void handleC(Task task) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        if (StringUtils.isEmpty(task.getA()) || StringUtils.isEmpty(task.getB())) {
            log.error("[TaskC2Handler] task A or B is null");
            throw new RuntimeException("[TaskC2Handler] task A or B is null");
        }
        Thread.sleep(new Random().nextInt(3) * 1000);
        task.setC2("c2");
        log.info("TaskC2Handler time: {}, task ->> {}", System.currentTimeMillis() - startTime, JSON.toJSONString(task));
    }

    public void onEvent(Task task, long l, boolean b) throws Exception {
        handleC(task);
    }

    public void onEvent(Task task) throws Exception {
        handleC(task);
    }
}
