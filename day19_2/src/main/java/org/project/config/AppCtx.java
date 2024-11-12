package org.project.config;

import org.project.exam04.Calculator;
import org.project.exam04.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
/**
 * 서브클래스 기반의 프록시 변환
 * 자바 표준은 인터페이스 기반의 프록시
 * 스프링쪽에는 기능을 확장해서 서브클래스 기반 프록시도 구현
 */
//@EnableAspectJAutoProxy
@EnableAspectJAutoProxy
public class AppCtx {

    @Bean
    public SpringProxyCalculator springProxyCalculator() {
        return new SpringProxyCalculator();
    }
    @Bean
    public SpringCachedCalculator springCachedCalculator() {
        return new SpringCachedCalculator();
    }

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
