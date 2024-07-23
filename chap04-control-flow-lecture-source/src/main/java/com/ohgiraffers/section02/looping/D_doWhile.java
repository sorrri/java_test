package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    public void testSimpleDoWhileStatement() {
        do {
            System.out.println("실행될까?");
        } while(false);

        System.out.println("반복 종료 이후");
    }

    public void testDoWhileExample() {
        int sumPrice = 0;
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("담을래 뺄래?");
            System.out.println("1. 담을래(+1000)");
            System.out.println("2. 뺄래(-1000)");
            System.out.println("3. 나갈래");
            choice = sc.nextInt();
            if(choice == 1) {
                sumPrice += 1000;
            } else if(choice == 2) {
                sumPrice -= 1000;
            }
            System.out.println("현재 합계는: " + sumPrice);
        } while(choice < 3);
    }
}
