package com.ohgiraffers.section04.comparison;

/* 수업목표. 비교 연산자에 대해 이해하고 활용할 수 있다. */

public class Application1 {
    public static void main(String[] args) {

        /* 목차. 1. 숫자값 비교 */
        int iNum1 = 10;
        int iNum2 = 20;
        System.out.println(iNum1 == iNum2);
        System.out.println(iNum1 != iNum2);
        System.out.println(iNum1 >= iNum2);
        System.out.println(iNum1 > iNum2);
        System.out.println(iNum1 <= iNum2);
        System.out.println(iNum1 < iNum2);

        /* 목차. 2. 문자값 비교(A=>65, a=>97)(결국 숫자값 비교와 동일) */

        /* 목차. 3. 논리값 비교 */
        boolean isNumber1 = true;
        boolean isNumber2 = false;
        System.out.println(isNumber1 == isNumber2);
        System.out.println(isNumber1 != isNumber2);
//        System.out.println(isNumber1 >= isNumber2);
//        System.out.println(isNumber1 > isNumber2);
//        System.out.println(isNumber1 <= isisNumber1Number2);
//        System.out.println(isNumber1 < isNumber2);

        /* 목차. 4. 문자열 값 비교 */
        String str3 = "java";
        String str4 = "java";
        System.out.println(str3 == str4);
        System.out.println(str3 != str4);
//        System.out.println(str3 >= str4);
//        System.out.println(str3 > str4);
//        System.out.println(str3 <= str4);
//        System.out.println(str3 < str4);

    }
}
