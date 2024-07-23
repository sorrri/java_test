package com.ohgiraffers.section01.method;

/* 수업목표. 반환값이 있는 메소드를 작성할 수 있다. */

public class Application6 {
    public static void main(String[] args) {
        String result = testMethod();
        System.out.println("result = " + result);

        /* 설명. 따로 굳이 변수에 담을 필요가 없다면 반환값을 바로 활용하는 것도 가능 */
        System.out.println("result2 = " + testMethod());
    }

    public static String testMethod() {
        System.out.println("test() 메소드 실행함...");
        return "test";                                  // 메소드를 호출한 곳에 String 리터럴 값 반환
    }
}
