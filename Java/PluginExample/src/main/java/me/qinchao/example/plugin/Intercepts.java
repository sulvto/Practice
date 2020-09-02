package me.qinchao.example.plugin;

import java.lang.annotation.*;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: Intercepts.java, v0.1 02/09/2020 17:36 sulvto Exp$$
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Intercepts {
    Signature[] value();
}
