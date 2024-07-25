package com.ohgiraffers.section01.intenum;

/* 수업목표. 정수 열거 패턴과 이의 단점을 이해할 수 있다. (enum이 아닐 때) */

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        /* 설명. 1. 둘 다 같은 상수이자 숫자일 뿐 구분할 수 없다. (런타임 시점) */
        if(subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다. ");
        }

        /* 설명. 2. 이름 충돌 방지를 위해서는 접두어를 써서 구분해야 한다. (이름과 번호가 같을 때) */

        /* 설명. 3. 변수명에 쓰인 이름 (문자열을 출력하기 어렵다. (feat.switch)) */
        Scanner sc = new Scanner(System.in);
        System.out.println("과목 번호를 눌러주세요(0~2): ");
        int fieldNo = sc.nextInt();

        String subName = "";
        switch(fieldNo) {
            case Subjects.JAVA:
                subName = "JAVA";
                break;
            case Subjects.MARIADB:
                subName = "MARIADB";
                break;
            case Subjects.JDBC:
                subName = "JDBC";
        }

        System.out.println("선택한 과목명은: " + subName + "입니다.");

        /* 설명. 4. 같은 클래스에 속한 상수들을 순회(반복자/반복문) 할 수 없다. (필드가 총 몇 개고 어떤 필드들이 있는지) */

        /* 설명. 5. 타입 안정성을 보장할 수 없다. */
        printSubject(Subjects.JAVA);
        printSubject(0);                        // 그냥 숫자의 개념도 허용
    }

    /* 설명. 매개변수의 의미는 단순히 정수가 넘어온다 밖에 없다. (Subjects라는 개념이 문법적으로 적용되지 않음) */
    private static void printSubject(int subjectName) {}
}
