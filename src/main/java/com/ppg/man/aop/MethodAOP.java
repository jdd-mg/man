package com.ppg.man.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodAOP {

    @Pointcut("execution(void com.ppg.man.service.*.refreshCache())")
    public void point() {
    }

    @AfterReturning(value = "point()")
    public void after() {
        System.out.println(" after ing.....");
    }
}
