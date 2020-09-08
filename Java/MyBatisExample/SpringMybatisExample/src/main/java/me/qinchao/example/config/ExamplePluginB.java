package me.qinchao.example.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: ExamplePlugin.java, v0.1 02/09/2020 16:28 sulvto Exp$$
 */
@Slf4j
@Intercepts({
        @Signature(
                type = Executor.class,
                method = "commit",
                args = {boolean.class}),
        })
public class ExamplePluginB implements Interceptor {
    private Properties properties = new Properties();

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        log.info("ExamplePluginB#intercept {}", invocation.getTarget().getClass().getName());
        // implement pre processing if need
        Object returnObject = invocation.proceed();
        // implement post processing if need
        return returnObject;
    }

    @Override
    public Object plugin(Object target) {
        log.info("ExamplePluginB#plugin {}", target.getClass().getName());
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        log.info("ExamplePluginB#setProperties");
        this.properties = properties;
    }
}
