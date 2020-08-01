package com.example.spring8;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerAspect {

//    @Around("execution(* com.example..*.EventService.*(..))")
//    @Around("@annotation(PerLogging)")
    @Around("bean(simpleEventService)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retval = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retval;
    }
    @Before("bean(simpleEventService)")
    public void hello(){
        System.out.println("hello");
    }
}
