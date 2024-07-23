package com.ohgiraffers.section01.exception;

/* 수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
/* 필기.
 *   1. throws를 통한 위임
 *   2. try-catch를 통한 처리
 * */

public class Application1 {
    /* 설명. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
//    public static void main(String[] args) throws Exception {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        /* 설명. try-catch를 통해 예외 상황을 원하는 의도대로 처리할 수 있다. */
        try {

            /* 설명. 우리가 처리할 예외가 발생할 수 있는 적당한 범위를 try 블럭으로 감싼다. */
            et.checkEnoughMoney(10000, 50000);
//            et.checkEnoughMoney(50000, 10000);
            System.out.println("이전에 문제가 없었으면 실행 될 출력 구문");
        } catch (Exception e) {

            /* 설명. 우리가 원하는 방식대로 try블럭에서 발생한 예외 타입 객체를 활용해서 처리 */
            /* 설명. try블럭에서 예외가 발생하지 않으면 실행되지 않는 블럭 */
            System.out.println("뭔가 예외가 발생했나 보네?");
            System.out.println("그 예외는 " + e.getMessage() + "!!!");

            /* 설명. 내가 원하는 시점에 프로그램을 종료할 수 있음 */
            System.exit(0);                                       // 프로그램 종료

            /* 설명. JVM처럼 우리도 예외가 각각 어떤 흐름으로 발생하는지 처리 가능 */
//            e.printStackTrace();                                      // 프로그램을 종료하는 기능은 없음
        }

//        et.checkEnoughMoney(50000, 10000);                            // throws 할 때 잠깐 활용한 구문
        try {
            int num = 10;
            System.out.println(num / 0);
        } catch (ArithmeticException e) {

            /* 설명. unchecked exception도 우리가 처리할 수 있고 exception 객체까지 활용할 수 있다. */
            System.out.println("잘 좀 나누지 0이 뭐냐?");
            System.out.println(e.getMessage() + "라잖아");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
