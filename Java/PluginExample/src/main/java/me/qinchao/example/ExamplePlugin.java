package me.qinchao.example;

import me.qinchao.example.calc.Add;
import me.qinchao.example.calc.Calc;
import me.qinchao.example.plugin.*;

import java.util.Properties;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: ExamplePlugin.java, v0.1 02/09/2020 18:02 sulvto Exp$$
 */
@Intercepts({
        @Signature(
                type = Calc.class,
                method = "calc",
                args = {Object.class, Object.class}
        ),
        @Signature(
                type = Add.class,
                method = "op",
                args = {int.class, int.class}
        )
})
public class ExamplePlugin implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("ExamplePlugin#intercept " + invocation.getTarget().getClass().getName());
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        System.out.println("ExamplePlugin#plugin " + target.getClass().getName());
        return Plugin.warp(target, this);
    }
}
