package me.qinchao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by sulvto on 9/19/19.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public TransactionDefinition transactionDefinition() {

        DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
        definition.setIsolationLevel(TransactionDefinition.ISOLATION_SERIALIZABLE);
        definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        definition.setTimeout(15);
        return definition;
    }

}
