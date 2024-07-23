package com.ohgiraffers.section03.constant;

/* 수업목표. 상수의 명명 규칙에 대해 이해할 수 있다. */

public class Application2 {
    public static void main(String[] args) {

        /* 목차. 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용 (특수기호 X) */
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40;                                            // 소문자로 작성하는건 관례상 좋지 않음

        /* 목차. 2. 단어와 단어 연결은 언더스코어(_)를 사용 */
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAGE = 30;                                          // 낙타봉 표기법도 관례상 좋지 않음
    }
}
