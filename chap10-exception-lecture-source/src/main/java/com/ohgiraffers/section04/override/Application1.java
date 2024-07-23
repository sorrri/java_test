package com.ohgiraffers.section04.override;

import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
//        SuperClass sc = new SuperClass();

        /* 설명. 다형성 적용 시 */
        SuperClass sc = new SubClass();
        try {

            /* 설명. 동적 바인딩에 의해 자식의 오버라이딩한 메소드가 실행된다면 (동적 바인딩) */
            sc.method();
        } catch (IOException e) {               // 부모의 method()만 고려해 처리한 예외처리가 문제가 될 수 있음
            throw new RuntimeException(e);
        }
    }
}
