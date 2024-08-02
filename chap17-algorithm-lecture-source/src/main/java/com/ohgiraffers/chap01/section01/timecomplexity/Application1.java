package com.ohgiraffers.chap01.section01.timecomplexity;

/* 수업목표. 시간복잡도를 이해할 수 있다. */
/* 설명. 알고리즘 실행 시 입력 값이 증가함에 따라 연산이 걸리는 시간의 증가도를 나타낸다. */

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 15, 4, 9, 10, 7};
        System.out.println(getFirst(arr));
        System.out.println(binarySearch(arr, 9));
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(fibonacci(5));
    }

    /* 설명. 상수 시간 O(1) */
    private static int getFirst(int[] arr) {
        return arr[0];
    }

    /* 설명. 로그 시간 O(log n) */
    private static int binarySearch(int[] arr, int target) {

        /* 설명. 초기 세팅 (배열을 오름차순 정렬 하고 시작) */
        Arrays.sort(arr);                                   // 내부적으로 nlogn만큼의 시간이 걸림 (고려 X)

        /* 설명. 배열의 처음과 끝을 지칭하는 위치(인덱스)를 담은 변수 두 개 (두 개의 포인터) */
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid]  < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        /* 설명. 찾고자 하는 값이 배열에 없다면 -1을 반환 */
        return -1;
    }

    /* 설명. 선형 시간 O(n) */
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversed[arr.length - i - 1] = arr[i];
        }
        return reversed;
    }

    /* 설명. 지수 시간 O(2^n) */
    public static int fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
