package me.qinchao.service.impl;

import me.qinchao.service.ClueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

/**
 * Created by sulvto on 9/19/19.
 */
@Service
public class ClueServiceImpl implements ClueService {
    private final static Logger logger = LoggerFactory.getLogger(ClueServiceImpl.class);

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private TransactionDefinition transactionDefinition;

    private void transaction(Runnable runnable) {
        logger.debug("transaction start");
        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
        try {
            runnable.run();
            transactionManager.commit(transactionStatus);
            logger.debug("transaction commit");
        } catch (Exception e) {
            transactionManager.rollback(transactionStatus);
            logger.debug("transaction rollback");
            throw e;
        }
    }

    @Override
    public void add() {
        transaction(()->{});
    }
}
