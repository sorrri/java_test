package com.ohgiraffers.section04.wrapper;

/* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */

public class Application1 {
    public static void main(String[] args) {
        int intValue = 20;

        /* 설명. 기본 지료형을 Wrapper 클래스 자료형으로 변환할 수 있다. (boxing) */
        Integer boxingInt = (Integer)20;
        Integer boxingInt2 = Integer.valueOf(intValue);

        /* 설명. Wrapper 클래스 자료형을 기본 자료형으로 변환할 수 있다. (unboxing) */
        int unboxingValue = boxingInt.intValue();

        /* 설명. 기본 자료형과 Wrapper 클래스는 자동으로 박싱 및 언박싱이 일어난다. */
        Integer autoBoxingInt = intValue;                   // auto-boxing
        int autoUnboxingInt = autoBoxingInt;                // auto-unboxing

        anythingMethod(10);

        /* 설명. Wrapper 클래스 주소 값 비교 */
        Integer integerTest = 30;
        Integer integerTest2 = 30;
        System.out.println("==비교: " + (integerTest == integerTest2));
        System.out.println("equals() 비교: " + integerTest.equals(integerTest2));
        System.out.println("integerTest 주소: " + System.identityHashCode(integerTest));
        System.out.println("integerTest2 주소: " + System.identityHashCode(integerTest2));
    }

    /* 설명. 매개변수가 Object인 메소드 (어떤 자료형의 전달인자든 받아낼 수 있는 메소드) */
    public static void anythingMethod(Object obj) {
        /* 설명. 10 -> Integer (auto-boxing) -> Object (다형성) */
        /* 설명. 출력 -> Object의 toString()에서(정적 바인딩) Integer의 toString()이(동적 바인딩)이 실행 */
        System.out.println("obj = " + obj.toString());
    }
}
