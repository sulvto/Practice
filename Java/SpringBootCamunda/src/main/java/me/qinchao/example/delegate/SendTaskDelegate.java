package me.qinchao.example.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Created by sulvto on 25/11/2020.
 *
 * @author sulvto
 * @version $Id: SendTaskDelegate.java, v0.1 25/11/2020 00:15 sulvto Exp$$
 */
public class SendTaskDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.getProcessEngineServices()
                .getRuntimeService()
                .createMessageCorrelation("hello")
                .processInstanceBusinessKey("messageBusinessKey")
                .correlate();
    }
}
