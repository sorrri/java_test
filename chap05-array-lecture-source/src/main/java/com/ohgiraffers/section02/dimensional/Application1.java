package com.ohgiraffers.section02.dimensional;

/* 수업목표. 다차원 배열의 구조를 이해하고 사용할 수 있다. */
/* 필기.
*   다차원 배열
*   다차원 배열은 2차원 이상의 배열을 의미
*   (일반적으로는 사람의 인지 범위에 맞게 최대 3차원 정도를 고려)
* */

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[][] iArr1;
        int[] iArr2[];                                          // 추천 X
        int iArr3[][];                                          // 추천 X

        iArr1 = new int[3][2];                                  // 정변 배열을 위한 선언 (관리하는 1차원 배열의 길이가 동일)
        iArr2 = new int[3][];                                   // 가변 배열을 위한 선언 (관리하는 1차원 배열의 길이가 다를 시)
//        iArr3 = new int[][];                                  // 컴파일 에러 발생

        int num = 0;
        for(int i = 0; i < iArr1.length; i++) {                 // 1차원 배열을 고르는 for문
            System.out.println("iArr[i]: " + iArr1[i]);
            for(int j = 0; j < iArr1[i].length; j++) {          // 선택된 1차원 배열을 다루는 for문
                iArr1[i][j] = num++;
            }
            System.out.println(Arrays.toString(iArr1[i]));
        }

        /* 설명. Arrays.toString()은 1차원 배열만 확인 가능 */
        System.out.println("2차원 배열도 한 번에 확인 될까? " + Arrays.toString(iArr1));
    }
}
