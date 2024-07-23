package com.ohgiraffers.section03.stringbuilder;

/* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법 및 원리를 이해할 수 있다. */

public class Application2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();                 // 가변 객체: 16 * 2 + 2 ...
        System.out.println(sb.capacity());                      // 16byte의 용량

        /* 설명. StringBuilder는 가변객체(mutable object)로써 내부적으로 용량이 증가하는 방식을 취함*/
        for(int i = 0; i < 50; i++) {
            sb.append(i);

            /* 설명. 용량을 초과할 것 같으면 (* 2 + 2)만큼씩 증가 (주소 값 변동 X)*/
            System.out.println("sb:" +sb);
            System.out.println("capacity: " + sb.capacity());
            System.out.println("identityHashCode: " + System.identityHashCode(sb));
        }

//        StringBuilder sb2 = new StringBuilder("javamariaDB");   // 입력한 문자열 크기 + 16byte
        StringBuffer sb2 = new StringBuffer("javamariaDB");   // 입력한 문자열 크기 + 16byte
        System.out.println(sb2.capacity());

        /* 필기.
        *   delete(): 시작 인텍스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거
        *   deleteCharAt(): 문자열 인덱스를 이용해서 문자 하나를 제거
        * */
        System.out.println("delete(): " + sb2.delete(2, 5));
        System.out.println("deleteCharAt(): " + sb2.deleteCharAt(0));

        /* 필기. insert(): 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가 */
        System.out.println("insert(): " + sb2.insert(1, "vao"));
        System.out.println("insert(): " + sb2.insert(0, "j"));
        System.out.println("insert(): " + sb2.insert(sb2.length(), "jdbc"));

        /* 필기. reverse(): 문자열 인덱스 순번을 역순으로 재배열 */
        System.out.println("reverse(): " + sb2.reverse());
    }
}
