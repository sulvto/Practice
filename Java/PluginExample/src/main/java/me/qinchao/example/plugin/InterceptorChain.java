package me.qinchao.example.plugin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: InterceptorChain.java, v0.1 02/09/2020 17:50 sulvto Exp$$
 */
public class InterceptorChain {
    private final List<Interceptor> interceptors = new ArrayList<>();

    public Object pluginAll(Object target) {
        for (Interceptor interceptor : interceptors) {
            target = interceptor.plugin(target);
        }
        return target;
    }

    public void add(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    public List<Interceptor> getInterceptors() {
        return Collections.unmodifiableList(interceptors);
    }

}
