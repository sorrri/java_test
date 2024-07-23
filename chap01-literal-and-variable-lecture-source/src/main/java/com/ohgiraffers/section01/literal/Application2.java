package com.ohgiraffers.section01.literal;
import com.sun.security.jgss.GSSUtil;

/* 수업목표. 값을 직접 연산하여 출력할 수 있다. */

public class Application2 {
    public static void main(String[] args) {
        System.out.println("======== 정수와 정수의 연산 ========");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("======== 실수와 실수의 연산 ========");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);                                // 소수점 이하를 보고 싶으면 실수를 활용한 나눗셈 사용
        System.out.println(1.23 % 1.0);                                 // 실수는 정확하지 않고 근사한 값

        System.out.println("======== 정수와 실수의 연산 ========");
        System.out.println(123 / 0.5);                                  // 실수 값이 나옴

        System.out.println("======== 문자와 정수의 연산 ========");
        System.out.println('a' + 1);                                    // a = 97
        System.out.println('a' % 2);

        System.out.println("======== 문자열와 문자열의 연산 ========");

        /* 문자열과 문자열의 연산은 '+'만 가능하며 이어붙이기 효과가 발생 */
        System.out.println("hello " + "world!");                        // hello world!
//        System.out.println("hello " * "world!");

        System.out.println("======== 문자열와 다른 형태의 연산 ========");

        /* 문자열과 연산 시 다른 형태도 문자열로 변환 */
        System.out.println("hello " + 123);
        System.out.println("hello " + true);
        System.out.println(123 + 1 + "hello " + 123.0 + 2);             // 문자열 연산 이전에 다른 형태의 연산이 나오면 연산 후 문자열로 변환
        System.out.println(123 + 1 + "hello" + (123.0 + 2));            // 괄호 연산 후 문자열로 변환

        System.out.println("======== 논리 값과 문자열의 연산 ========");
        System.out.println(true + "문자열");

    }
}
