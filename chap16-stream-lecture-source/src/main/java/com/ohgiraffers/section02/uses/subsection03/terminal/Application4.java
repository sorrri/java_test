package com.ohgiraffers.section02.uses.subsection03.terminal;

/* 수업목표. 스트림의 최종 연산 중 하나인 match에 대해 이해하고 사용할 수 있다. */

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Spring", "SpringBoot");

        boolean anyMath = stringList.stream()
                                .anyMatch(str -> str.contains("p"));
        boolean allMatch = stringList.stream()
                                .allMatch(str -> str.length() > 4);
        boolean noneMatch = stringList.stream()
                                .noneMatch(str -> str.contains("c"));

        System.out.println("anyMath = " + anyMath);
        System.out.println("allMatch = " + allMatch);
        System.out.println("noneMatch = " + noneMatch);
    }
}
