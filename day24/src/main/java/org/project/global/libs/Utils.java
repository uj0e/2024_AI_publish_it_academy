package org.project.global.libs;

import org.springframework.stereotype.Component;

@Component("ut")
public class Utils {
    public String hello(String name) {
        return String.format("%s님 반갑습니다....", name);
    }
}
