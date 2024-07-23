package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요: ");
        int input = sc.nextInt();

        if(input % 2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            System.out.println("입력하신 정수는 짝수입니다.");
        }
    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요: ");

        /* 설명. 정수를 하나 입력받아 양수와 음수를 구분하고 양수일 때만 짝수인지 아닌지 판별 (각 상태 모두 출력) */
        int input = sc.nextInt();

        if(input >= 0) {
            if(input % 2 == 0) {
                System.out.println("양수이면서 짝수입니다.");
            } else {
                System.out.println("양수이면서 홀수입니다.");
            }
        } else {
            System.out.println("양수가 아닙니다.(음수인 경우)");
        }
    }
}
