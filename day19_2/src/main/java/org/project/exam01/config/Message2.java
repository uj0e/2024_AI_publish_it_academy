package org.project.exam01.config;

// 변경 불가한 라이브러리 클래스로 가정
// InitializingBean, DisposableBean을 정의하지 못한다고 가정
public class Message2 {

    public void init() {
        System.out.println("init() 호출");
    }

    public void send(String message) {
        System.out.printf("메세지 : %s, 전송완료!\n",message);
    }

    public void close() {
        System.out.println("close() 호출");
    }
}
