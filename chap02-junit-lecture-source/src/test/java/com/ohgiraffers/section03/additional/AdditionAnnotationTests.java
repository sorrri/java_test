package com.ohgiraffers.section03.additional;

/* 수업목표. Junit5에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다. */

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionAnnotationTests {

    @Disabled                                                   // 테스트하지 않음
    @Test
    public void testIgnore() {}

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)        // 시간 제한
    public void testTimeout() throws InterruptedException {
        Thread.sleep(900);      // 통과
//        Thread.sleep(1100);         // 예외 발생
    }

    @Test
    @Order(1)                                                   // 우선순위 (작을수록 우선순위가 높음)
    public void testFirst() {}

    @Test
    @Order(3)
    public void testThird() {}

    @Test
    @Order(2)
    public void testSecond() {}

    @RepeatedTest(10)
    public void testRepeat() {}
}
