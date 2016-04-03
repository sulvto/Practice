package me.qinchao.proxy.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by SULVTO on 16-3-11.
 */
public class TransactionManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionManager.class);

    public void begin() {
        LOGGER.debug("begin");
    }

    public void commit() {
        LOGGER.debug("commit");

    }

    public void rollback() {
        LOGGER.debug("rollback");

    }

    public void close() {
        LOGGER.debug("close");
    }

}
