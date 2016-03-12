package me.qinchao.proxy.aop;

import me.qinchao.proxy.cglib.AroundAdvice;
import me.qinchao.proxy.jdk.TransactionManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by SULVTO on 16-3-11.
 */
@Component
@Aspect
public class AspectProxy {
    private static final Logger LOGGER = LoggerFactory.getLogger(AspectProxy.class);

    @Pointcut("execution(* me.qinchao.proxy.Person.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before() {
        LOGGER.debug("Before");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.debug("Around Before");
        proceedingJoinPoint.proceed();
        LOGGER.debug("Around After");
    }

    @After("pointcut()")
    public void after() {
        LOGGER.debug("After");
    }

}
