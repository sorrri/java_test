package com.ohgiraffers.section01.array;

/* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다. */

import java.util.Arrays;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /* 설명. 5명의 자바 점수를 입력 받아서 합계와 평균을 실수(double)로 구하는 예제 작성 */
        int[] score = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번째 학생의 자바 점수를 입력해주세요: ");
            score[i] = sc.nextInt();
        }
        System.out.println("현재까지 입력된 값: " + Arrays.toString(score));

        /* 설명. 합계(sum) 구하기 */
        int sum = 0;
        for(int perScore:score) {
            sum += perScore;
        }
        System.out.println("합계: " + sum);

        /* 설명. 평균(avg) 구하기 */
        double avg = sum / score.length;
        System.out.println("평균: " + avg);
    }
}
