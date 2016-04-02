package me.qinchao.annotation;

import java.lang.annotation.*;

/**
 * Reference
 * 
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Reference {

}
