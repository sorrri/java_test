package com.ohgiraffers.section05.typecasting;

/* 수업목표. 자동 형변환(Implicit Coercion) 규칙에 대해 이해할 수 있다. */

public class Application1 {
    public static void main(String[] args) {
        byte bNum = 1;
        
        short sNum = bNum;                                  // short sNum = (short)bNum
        int iNum = sNum;
        
        /* 설명. 연산 시에도 자동으로 큰 자료형에 맞춰서 낮은 자료형이 자동형변환 */
        int num1 = 10;
        long num2 = 20L;
        
        long result1 = num1 + num2;                         // long result1 = (long)num1 + num2;
        System.out.println("result1 = " + result1);
        
        /* 설명. 문자형 int형으로 자동변환 가능 */
        int ch1 = 'a';
        System.out.println("ch1 = " + ch1);                 // 유니코드 번호 확인 가능

        /* 설명. int형에서 char형에 담기는건 작은 범위로 대입되지만 가능(예외) */
        char ch2 = 65;
    }
}
