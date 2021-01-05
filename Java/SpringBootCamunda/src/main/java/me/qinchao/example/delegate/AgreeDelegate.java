package me.qinchao.example.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sulvto on 26/11/2020.
 *
 * @author sulvto
 * @version $Id: AgreeDelegate.java, v0.1 26/11/2020 00:00 sulvto Exp$$
 */
public class AgreeDelegate implements JavaDelegate {
    public final static Logger LOGGER = LoggerFactory.getLogger(AgreeDelegate.class);
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("审批『金额：" + delegateExecution.getVariables().get("amount") + "』已被同意");
    }
}
