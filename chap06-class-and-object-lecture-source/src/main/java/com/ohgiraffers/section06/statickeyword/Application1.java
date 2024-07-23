package com.ohgiraffers.section06.statickeyword;

/* 수업목표. static 키워드에 대해 이해할 수 있다. */
/* 필기.
*   static
*   : 프로그램이 실행될 때 정적 메모리 영역(static 영역 또는 클래스 영역)에 할당하는 키워드
*     여러 인스턴스가 공유해서 사용할 목적의 공간
*     대표적인 예로 싱글톤(Singleton)객체 */

public class Application1 {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();

        /* 설명. 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static field: " + st1.getNonStaticCount());
        System.out.println("static field: " + StaticTest.getStaticCount());

        /* 설명. 각 필드의 값들을 하나씩 증가 */
        st1.increaseNonStaticCount();
        StaticTest.increaseStaticCount();

        /* 설명. 두 필드 값 확인 */
        System.out.println("non-static field: " + st1.getNonStaticCount());
        System.out.println("static field: " + StaticTest.getStaticCount());

        /* 설명. 새로운 객체 생성 */
        StaticTest st2 = new StaticTest();
        System.out.println("non-static field: " + st2.getNonStaticCount());
        System.out.println("static field: " + StaticTest.getStaticCount());
    }
}
