package me.qinchao.demo;

import com.lmax.disruptor.EventFactory;

/**
 * Created by sulvto on 4/10/20.
 */
public class TaskFactory implements EventFactory<Task> {
    public Task newInstance() {
        return new Task();
    }
}
