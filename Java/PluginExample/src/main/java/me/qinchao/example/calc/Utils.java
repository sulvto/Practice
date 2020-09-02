package me.qinchao.example.calc;

import me.qinchao.example.plugin.Interceptor;
import me.qinchao.example.plugin.InterceptorChain;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: Utils.java, v0.1 02/09/2020 17:58 sulvto Exp$$
 */
public class Utils {
    private static final InterceptorChain chain = new InterceptorChain();

    public static Calc newAddCalc() {
        Calc calc = new Calc(newAddOp());
        chain.pluginAll(calc);
        return calc;
    }

    public static Op newAddOp() {
        Add add = new Add();
        chain.pluginAll(add);
        return add;
    }

    public static void addInterceptor(Interceptor interceptor) {
        chain.add(interceptor);
    }
}
