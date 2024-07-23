package com.ohgiraffers.section05.typecasting;

/* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
/* 필기.
 *   강제형변환
 *   바꾸려는 자료형으로 캐스트 연산자((자료형))를 이용하여 형변환
 * */

public class Application2 {
    public static void main(String[] args) {
        long lNum = 80000000000L;
        int iNUm = (int)lNum;
        System.out.println("iNUm = " + iNUm);

        float avg = 31.23f;
        int floorNum = (int)avg;
        System.out.println("floorNum = " + floorNum);
    }
}
