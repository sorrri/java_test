package com.ohgiraffers.section02.package_and_import;

/* 수업목표. import에 대해 이해할 수 있다. */

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {

        /* 설명. 다른 패키지의 클래스명(full 클래스명)을 줄여쓰고자 할 때 사용 가능 */
        /* 설명. non-static 메소드의 경우 */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(80, 22);
        System.out.println("result = " + result);

        /* 설명. static 메소드의 경우 */
        int result2 = Calculator.maxNumbersOf(40, 90);
        System.out.println("result2 = " + result2);
    }
}
