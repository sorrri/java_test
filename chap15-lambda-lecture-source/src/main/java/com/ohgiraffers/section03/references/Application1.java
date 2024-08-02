package com.ohgiraffers.section03.references;

/* 수업목표. 기존에 존재하는 메소드를 참조해 람다식을 적용할 수 있다. */

import java.util.function.BiFunction;

public class Application1 {
    public static void main(String[] args) {
          BiFunction<String, String, Boolean> biFunction;
          String str1 = "METHOD";
          String str2 = "METHOD";

          boolean result = false;

          biFunction = (x, y) -> x.equals(y);
//          biFunction = String::equals;

          result = biFunction.apply(str1, str2);            // str1.equals(str2);

        System.out.println("result: " + result);
    }
}
