package me.qinchao.demo;

import com.alibaba.fastjson.JSON;
import com.lmax.disruptor.EventTranslator;
import com.lmax.disruptor.RingBuffer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by sulvto on 4/10/20.
 */
@Slf4j
public class TaskProducer {

    private RingBuffer<Task> ringBuffer;
    private Task emptyTask = new Task();

    public TaskProducer(RingBuffer<Task> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }


    public void onData(final String id) {
        this.ringBuffer.publishEvent((task, l) -> {
            try {
                BeanUtils.copyProperties(task, emptyTask);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            log.info("task before ->> {}", JSON.toJSONString(task));
            task.setId(id);
            task.setStartTime(System.currentTimeMillis());
        });
    }
}
