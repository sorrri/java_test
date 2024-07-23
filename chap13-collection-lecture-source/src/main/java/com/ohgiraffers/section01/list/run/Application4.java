package com.ohgiraffers.section01.list.run;

/* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
/* 필기.
*   Stack이란?
*   후입선출(LIFO) 또는 선입후출(FILO)의 자료 구조로
*   push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리
* */

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack();

        /* 설명. Stack 인스턴스 생성 후 데이터 추가 */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        System.out.println("peek(): " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("search(): " + integerStack.search(2));      // 위에서부터의 거리

        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println(integerStack);
    }
}
