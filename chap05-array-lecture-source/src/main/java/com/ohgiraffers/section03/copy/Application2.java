package com.ohgiraffers.section03.copy;

/* 수업목표. 깊은 복사에 대해 이해할 수 있다. */
/* 필기.
*   1. for문을 이용한 동일한 인덱스 값을 일일이 복사
*   2. Object의 clone()을 이용한 복사 (사용 빈도 높음)
*   3. System의 arraycopy()를 이용한 복사
*   4. Arrays의 copyOf()를 이용한 복사
* */

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        int[] originArr = new int[]{1, 2, 3, 4};
        print(originArr, "원본");

        /* 목차. 1. for문을 활용 */
        int[] copyArr1 = new int[originArr.length];
        for(int i = 0; i < copyArr1.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1, "for문을 활용한 사본");

        /* 목차. 2. clone() 활용 */
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()을 활용한 사본");

        /* 목차. 3. arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[originArr.length + 3];                         // 원본보다 3크기가 더 큰 배열 할당
        System.arraycopy(originArr, 0, copyArr3, 3, 3);
        print(copyArr3, "arraycopy()를 활용한 사본");

        /* 목차. 4. copyOf()를 이용한 복사 (원본의 처음부터만 가능) */
        int[] copyArr4 = Arrays.copyOf(originArr, 2);
        print(copyArr4, "copyOf()를 활용한 사본");
    }

    public static void print(int[] arr, String desc) {
        System.out.println("======== " + desc + " ========");
        System.out.println("넘어온 배열의 hashCode: " + arr.hashCode());
        System.out.println(Arrays.toString(arr));
    }
}
