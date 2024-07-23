package com.ohgiraffers.section04.constructor;

/* 수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */
/* 필기.
*   생성자란?
*   인스턴스를 생성할 때 호출하는 반환형이 없는 함수로, 기본생성자와 매개변수가 있는 생성자로 나눌 수 있다.
* */

public class Application1 {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.information());

        User user2 = new User("user01", "pass01", "피카츄", new java.util.Date());
        System.out.println(user2.information());
    }
}
