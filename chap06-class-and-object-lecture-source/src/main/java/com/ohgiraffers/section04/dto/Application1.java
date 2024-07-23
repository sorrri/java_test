package com.ohgiraffers.section04.dto;

/* 수업목표. 생성자를 이용한 객체 초기화와 설정자를 이용한 초기화의 장단점을 이해할 수 있다. (feat.자바 빈) */

public class Application1 {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO();
        System.out.println(user1.toString());
        user1.setId("user01");
        System.out.println(user1.getId());
        System.out.println(user1);
    }
}
