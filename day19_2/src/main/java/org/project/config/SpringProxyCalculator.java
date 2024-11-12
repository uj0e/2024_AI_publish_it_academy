package org.project.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect
public class SpringProxyCalculator {

    /*@Before("publicTarget()")
    public void beforeProcess(JoinPoint joinPoint) throws Throwable{
        System.out.println("@Before");
    }

    @After("publicTarget()")
    public void afterProcess(JoinPoint joinPoint) throws Throwable{
        System.out.println("@After");
    }*/


    //@Around("publicTarget()")
    @Around(" CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable{
        long stime = System.nanoTime();
        try {
            Object result = joinPoint.proceed();

            return result;
        }finally {
            long etime = System.nanoTime();
            System.out.printf("Running Time : %d\n", etime - stime);
        }
    }
}