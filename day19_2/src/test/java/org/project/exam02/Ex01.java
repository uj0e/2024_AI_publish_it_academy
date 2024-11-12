package org.project.exam02;

import org.junit.jupiter.api.Test;

public class Ex01 {
    @Test
    void test1() {
        long stime = System.nanoTime();
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10L);
        long etime = System.nanoTime();

        System.out.printf("1번 시간 %d\n", etime - stime);

        stime = System.nanoTime();
        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10L);
        etime = System.nanoTime();

        System.out.printf("2번 시간 %d\n", etime - stime);

        System.out.printf("1번 : %d\n2번 : %d\n", result1, result2);
    }

    @Test
    void test2() {
        ProxyCalculator cal1 = new ProxyCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1 : %d\n", result1);

        ProxyCalculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal1.factorial(10L);
        System.out.printf("cal2 : %d\n", result2);

    }
    @Test
    void test3() {
        CachedCalculator cal = new CachedCalculator(new ProxyCalculator(new RecCalculator()));

        long r1 = cal.factorial(10L);
        System.out.printf("r1 : %d\n", r1);
        long r2 = cal.factorial(10L);
        System.out.printf("r2 : %d\n", r2);
        long r3 = cal.factorial(10L);
        System.out.printf("r3 : %d\n", r3);
    }
}
