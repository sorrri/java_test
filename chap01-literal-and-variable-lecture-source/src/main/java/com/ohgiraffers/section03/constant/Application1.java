package com.ohgiraffers.section03.constant;

/* 수업목표. 상수에 대해 이해하고 사용할 수 있다. */

public class Application1 {
    public static void main(String[] args) {
        final int AGE;

        AGE = 19;
//        AGE = 20;                                 // 한 번 저장한 데이터를 바꿀 수 없음 (대입이 한 번밖에 안됨)

        System.out.println("AGE = " + AGE);
        int myAge = AGE;
    }
}
