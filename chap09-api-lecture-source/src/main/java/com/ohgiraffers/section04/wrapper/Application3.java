package com.ohgiraffers.section04.wrapper;

/* 수업목표. 다양한 기본 자료형을 문자열로 바꿀 수 있다. */

public class Application3 {
    public static void main(String[] args) {
        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(1L).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String isTrue = Boolean.valueOf(true).toString();
        String ch = Character.valueOf('a').toString();

        /* 설명. 기본 자료형을 문자열로 바꿀 때는 간단히 ""을 더해주면 쉬움 */
        String floatString = 4.0f + "";
    }
}
