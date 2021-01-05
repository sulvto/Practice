package me.qinchao.example.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sulvto on 24/11/2020.
 *
 * @author sulvto
 * @version $Id: AuditDelegate.java, v0.1 24/11/2020 23:56 sulvto Exp$$
 */
public class AuditDelegate implements JavaDelegate {
    public final static Logger LOGGER = LoggerFactory.getLogger(AuditDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("审核流程 - SERVICE TASK Callback");
    }
}
