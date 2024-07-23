package com.ohgiraffers.section03.stringbuilder;

/* 수업목표. String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */

public class Application1 {
    public static void main(String[] args) {
//        StringBuilder sb = "java"                                     // 리터럴 형태로 초기화 불가능
        StringBuilder sb = new StringBuilder("java");

        /* 설명. String과 StringBuilder로 수정 시 객체 주소 값 변화 확인 */
        String testStr = "java";
        StringBuilder testSb = new StringBuilder("kotlin");

        for(int i = 0; i < 9; i++) {
            testStr += i;
            testSb.append(i);                                           // append 메소드로 문자열 이어붙임

            System.out.println("String의 경우: " + System.identityHashCode(testStr));
            System.out.println("StringBuilder의 경우: " + System.identityHashCode(testSb));
        }

        System.out.println("String의 결과: " + testStr);
        System.out.println("StringBuilder의 결과: " + testSb);
    }
}
