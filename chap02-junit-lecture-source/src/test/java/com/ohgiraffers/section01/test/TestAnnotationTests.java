package com.ohgiraffers.section01.test;

/* 수업목표. Junit5의 기본 어노테이션을 사용할 수 있다. */
/* 필기.
*   단위 테스트: layered architecture에서 각 계층마다 단위 메소드를 테스트하는 것
*   통합 테스트: layer 단위가 아닌 전체 기능 동작에 대해 테스트하는 것
*   테스트 케이스: 테스트 대상이 되는 기능에 대해 시나리오 별로 어떤 것을 테스트 하는지에 대해 정의한 것
* */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAnnotationTests {
    @Test
    @DisplayName("테스트 메소드가 통과 되는지 확인")
    public void testMethod1() {

    }

    @Test
    public void 테스트_메소드가_통과_되는지_확인() {

    }
}
