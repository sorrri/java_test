package com.ohgiraffers.section05.overloading;

/* 수업목표. 오버로딩(Overloading)에 대해 이해할 수 있다. */

/* 필기.
*   메소드의 시그니처?
*   public void method(int num) {} 이라면, 메소드의 메소드명과 파라미터 선언부 부분을
*   메소드의 시그니처(signature)라고 한다. (즉, method(int num))
*
*  필기.
*   동일한 메소드 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 경우 적용하는 기술을 오버로딩이라고 한다.
*
*  필기.
*   오버로딩의 조건?
*   매개변수 타입, 개수, 순서를 다르게 작성하여 하나의 클래스 내에 동일한 이름의 메소드를 여러개 작성할 수 있다.
*   메소드의 헤드부에 있어 시그니처를 제외한 부분이 다르게 작성되는 것은 인정 X
* */

public class OverloadingTest {
    public void test() {}

    /* 설명. 매개변수의 개수가 달라짐 */
    public void test(int num) {}

    public void test(int num1, int num2) {}

//    public void test(int num2, int num1) {}                   // 매개 변수명이 다른 것은 무관

    /* 설명. 매개변수의 타입이 달라짐 */
    public void test(int num1, String str) {}

    /* 설명. 매개변수의 순서가 달라짐 (타입만 고려) */
    public void test(String str, int num1) {}
}
