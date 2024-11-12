package org.project.exam01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

public class Message implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiseSet() 호출");
    }

    @Bean
    public void send(String message) {
        System.out.printf("메세지 : %s, 전송완료!\n",message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy() 호출!");
    }

}