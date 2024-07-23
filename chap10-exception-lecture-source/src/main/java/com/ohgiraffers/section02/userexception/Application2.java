package com.ohgiraffers.section02.userexception;

/* 수업목표. finally를 활용한 try-catch문 이해하고 활용하기 */

import com.ohgiraffers.section01.exception.ExceptionTest;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try{
//            et.checkEnoughMoney(20000, 50000);
            et.checkEnoughMoney(-20000, 50000);
        } catch (Exception e){
            System.out.println("유효성 검사 시 문제 발생: " + e.getMessage());
        } finally {

            /* 설명. try 구문에서 예외가 발생하든 하지 않든 반드시 실행해야 할 구문이 있다면 작성해야 하는 부분 */
            System.out.println("finally 블럭의 내용 동작함..");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
