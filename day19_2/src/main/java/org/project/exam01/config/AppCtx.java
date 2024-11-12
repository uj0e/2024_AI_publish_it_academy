package org.project.exam01.config;

import org.project.exam01.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx {

    @Bean
    public Message message() {
        return new Message();
    }

    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "close")
    public Message2 message2() {
        return new Message2();
    }
}
