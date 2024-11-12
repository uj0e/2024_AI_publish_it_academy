package org.project.global.configs;

import org.project.member.controller.MemberController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.project")
public class ControllerConfig {

    /*@Bean
    public MemberController memberController() {
        return new MemberController();
    }*/

}
