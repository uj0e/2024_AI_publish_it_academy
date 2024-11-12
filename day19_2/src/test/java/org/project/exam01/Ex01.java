package org.project.exam01;

import org.junit.jupiter.api.Test;
import org.project.exam01.config.AppCtx;
import org.project.exam01.config.Message2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 객체 생성 -> 의존 설정 -> 초기화

        Message m1 = ctx.getBean(Message.class);
        m1.send("Hello!");

        Message m2 = ctx.getBean(Message.class);
        System.out.println(m1 == m2);

        ctx.close();
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message2 m1 = ctx.getBean(Message2.class);
        Message2 m2 = ctx.getBean(Message2.class);

        System.out.println(m1 == m2);
        m1.send("hello!");

        ctx.close();
    }
}
