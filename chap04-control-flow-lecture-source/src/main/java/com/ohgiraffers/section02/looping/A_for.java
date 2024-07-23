package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public void testForExample1() {

        /* 설명. 변수들에 담긴 값들에 각각 2를 곱하고 1을 더하여 sum에 누적 */
//        int num1 = 1;
//        int num2 = 2;
//        int num3 = 3;
//        int num4 = 4;
//        int num5 = 5;
//
//        int sum = 0;
//
//        sum += 2 * num1 + 1;
//        sum += 2 * num1 + 1;
//        sum += 2 * num1 + 1;
//        sum += 2 * num1 + 1;
//        sum += 2 * num1 + 1;
//
//        System.out.println("sum = " + sum);

        /* 설명. for 문을 통해 개선 */
        int forSum = 0;

        /* 설명. 초기값 0부터일 때 */
//        for (int i = 0; i < 5; i++) {
//            forSum += 2 * (i + 1) + 1;
//        }

        /* 설명. 초기값 1부터일 때 */
        for (int i = 1; i <= 5; i++){
            forSum += 2 * i + 1;
        }

        System.out.println("forSum = " + forSum);
    }

    public void testForExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("limit 값 입력");
        int limit = sc.nextInt();

        int sum = 0;

        for (int i = 2; i < limit; i += 2) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
