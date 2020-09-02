package me.qinchao.example.plugin;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: Interceptor.java, v0.1 02/09/2020 17:29 sulvto Exp$$
 */
public interface Interceptor {
    Object intercept(Invocation invocation) throws Throwable;

    Object plugin(Object target);
}
