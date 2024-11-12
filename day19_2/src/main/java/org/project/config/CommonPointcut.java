package org.project.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {
    @Pointcut("execution(* org.project.exam04..*(..))")
    public void publicTarget() {

    }
}
