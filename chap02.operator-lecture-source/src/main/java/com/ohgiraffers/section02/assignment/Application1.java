package com.ohgiraffers.section02.assignment;

/* 수업목표. 복합 대입 연산자를 이해하고 활용할 수 있다. */
/* 필기.
 *   대입연산자와 산술 복합 대입 연산자
 *   '=', '+=', '-=', '*=', '/=', '%='
 * */

public class Application1 {
    public static void main(String[] args) {
        int num = 12;
        System.out.println("num = " + num);

        num = num + 3;
        System.out.println("num = " + num);

        num += 3;
        System.out.println("num = " + num);

        num -= 5;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);

        /* 주의! */
        num =- 5;                                       // equal(=) 기호 오른쪽은 복합 대입 연산자가 아님
        System.out.println("num = " + num);
    }
}
