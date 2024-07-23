package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement() {

        /* 설명. 1부터 100까지에서 4와 5의 공배수만 출력 */
        for(int i = 1; i <= 100; i++) {
//            if(i % 4 == 0 && i % 5 == 0) {
//                System.out.println(i + "는 4와 5의 공배수");
//            }

            /* 설명. continue를 활용한 구문으로 변환 */
            if(!(i % 4 == 0 && i % 5 == 0)) {
                continue;                                       // continue 이후 반복문의 구간을 건너 뜀
            }
            System.out.println(i + "는 4와 5의 공배수");
        }
    }
}
