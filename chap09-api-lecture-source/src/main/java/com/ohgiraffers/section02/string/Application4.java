package com.ohgiraffers.section02.string;

/* 수업목표. 이스케이스(escape)문자에 대해 이해하고 적용할 수 있다. */
/* 필기.
*   이스케이프(escape) 문자
*   문자열 내에서 사용하는 특수 기능을 위한 문자
*
*  필기.
*   \n: 개행
*   \t: 탭
*   \': 작은 따옴표
*   \": 큰 따옴표
*   \\: 역슬래쉬 표기
* */

import com.sun.security.jgss.GSSUtil;

public class Application4 {
    public static void main(String[] args) {
        System.out.println("안녕하세요. \n저는 홍길동입니다.");
        System.out.println("안녕하세요. \t저는 홍길동입니다.");

        System.out.println("안녕하세요. 저는 '홍길동'입니다.");
        System.out.println("안녕하세요. 저는 \"홍길동\"입니다.");

        System.out.println("역슬래쉬(\\)입니다.");

        /* 설명. 이스케이프 문자 외에도 printf관련 문법도 있으니 참고 */
        /* 설명. %.2f: 소수점 둘 째 자리까지 실수를 표현하며, 셋 째 자리에서 반올림
        *       %d: 정수형 표현 */
        System.out.printf("원주율은 %.2f입니다. 우린 %d로 하죠", 2.141592, 3);          // (print)f: format
    }
}
