package me.qinchao.demo;

import com.alibaba.fastjson.JSON;
import com.lmax.disruptor.WorkHandler;
import lombok.extern.slf4j.Slf4j;
import sun.awt.X11.XSystemTrayPeer;

import java.util.Random;

/**
 * Created by sulvto on 4/10/20.
 */
@Slf4j
public class TaskBHandler implements com.lmax.disruptor.EventHandler<Task>, WorkHandler<Task> {

    private String name;

    public TaskBHandler(String name) {
        this.name = name;
    }

    void handleB(Task task) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        if (StringUtils.isEmpty(task.getA())) {
            log.error("[TaskBHandler] task A is null");
            throw new RuntimeException("[TaskBHandler] task A is null");
        }
        Thread.sleep(new Random().nextInt(10) * 1000);
        task.setB("b");
        log.info("TaskBHandler name:{}, time: {}, task ->> {}", name, System.currentTimeMillis() - startTime, JSON.toJSONString(task));
    }

    public void onEvent(Task task, long l, boolean b) throws Exception {
        handleB(task);
    }

    public void onEvent(Task task) throws Exception {
        handleB(task);
    }
}
