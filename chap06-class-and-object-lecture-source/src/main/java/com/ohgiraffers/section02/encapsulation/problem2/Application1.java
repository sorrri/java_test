package com.ohgiraffers.section02.encapsulation.problem2;

/* 수업목표. 필드값 수정 시 발생할 수 있는 문제점을 이해할 수 있다. */

public class Application1 {
    public static void main(String[] args) {
        Monster monster1 =  new Monster();
//        monster1.name = "드라큘라";
//        monster1.hp = 200;
//        System.out.println("monster1 name: " + monster1.name);
//        System.out.println("monster1 hp: " + monster1.hp);

        monster1.setInfo1("프랑켄 슈타인");
        monster1.setInfo2(200);

        /* 설명. 하지만 여전히 직접 접근은 가능한 상태 */
        System.out.println(monster1.kinds);

    }
}
