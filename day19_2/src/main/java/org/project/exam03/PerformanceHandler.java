package org.project.exam03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {

    private final Class<?> clz;

    public PerformanceHandler(Class<?> clz){
        this.clz = clz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.nanoTime();
        try {
            Object obj = clz.getDeclaredConstructor().newInstance();

            Object result = method.invoke(obj, args); // 핵심기능 대신 수횅

            return result;
        }finally {
            long etime = System.nanoTime();
            System.out.printf("running time : %d\n", etime - stime);
        }
    }
}
