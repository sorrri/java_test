package com.ohgiraffers.section01.intro;

/* 수업목표. stream의 병렬처리에 대해 이해할 수 있다. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mariadb", "jdbc", "html", "css"));

        /* 설명. main Thread 상에서 스트림을 사용하지 않고 확인 */
        System.out.println("======== foreach");
        for(String s : stringList)  {
            System.out.println(s + ": " + Thread.currentThread().getName());
        }

        /* 설명. main Thread 상에서 단순 스트림을 사용하고 확인 */
        System.out.println("======== normal stream");
//        stringList.stream().forEach(x -> Application2.print(x));
        stringList.stream().forEach(Application2::print);

        /* 설명. main Thread 상에서 병렬 스트림을 사용하고 확인 (main Thread 외의 다른 Thread를 활용) */
        System.out.println("======== parallel stream");
        stringList.parallelStream().forEach(Application2::print);
    }

    private static void print(String s) {
        System.out.println(s +  ": " + Thread.currentThread().getName());
    }
}
