package me.qinchao.example.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sulvto on 26/11/2020.
 *
 * @author sulvto
 * @version $Id: RejectDelegate.java, v0.1 26/11/2020 00:03 sulvto Exp$$
 */
public class RejectDelegate implements JavaDelegate {
    public final static Logger LOGGER = LoggerFactory.getLogger(RejectDelegate.class);
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("审批『金额：" + delegateExecution.getVariables().get("amount") +
                ", 角色：" + delegateExecution.getVariables().get("role") +
                ", 资金方向：" + delegateExecution.getVariables().get("userFoe") + "』已被拒绝");
    }
}
