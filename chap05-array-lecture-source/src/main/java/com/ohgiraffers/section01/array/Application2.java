package com.ohgiraffers.section01.array;

/* 수업목표. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
/* 필기.
*   배열의 사용 방법
*   1. 배열의 선언
*   2. 배열의 크기 할당
*   3. 배열의 인덱스 공간에 값 대입
* */

public class Application2 {
    public static void main(String[] args) {
        int[] iArr;
//        char cArr[];                                    // 대괄호가 뒤에 붙어도 돌아가지만 권장 X

        iArr = new int[10];                               // 배열은 반드시 크기를 할당해 주어야 함

        char[] cArr = new char[5];

        /* 설명. 참조 자료형 변수 출력 결과 = toString()의 결과 -> 자료형 @ 16진수 주소값 */
        System.out.println("iArr = " + iArr.toString());
        System.out.println("cArr = " + cArr);

        System.out.println("iArr의 10진수 주소: " + iArr.hashCode());
        System.out.println("cArr의 10진수 주소: " + cArr.hashCode());

        cArr = null;
        System.out.println("null을 참조할 시: " + cArr.hashCode());
    }
}
