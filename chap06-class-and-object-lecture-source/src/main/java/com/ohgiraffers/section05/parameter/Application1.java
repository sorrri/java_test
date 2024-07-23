package com.ohgiraffers.section05.parameter;

/* 수업목표. 메소드의 파라미터(매개변수)에 대해 이해하고 사용할 수 있다. */

/* 필기.
*   파라미터로 사용 가능한 자료형
*   1. 기본 자료형
*   2. 기본 자료형 배열
*   3. 클래스 자료형 (참조 자료형)
*   4. 클래스 자료형 배열 (객체 배열이지만 다음 챕터에서 다룰 예정)
*   5. 가변 인자
* */

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("프로그램 실행 시 던져진 값: " + Arrays.toString(args));
        ParameterTest pt = new ParameterTest();

        /* 목차. 1. 기본 자료형을 매개변수로 전달 받는 메소드 호출 */
        /* 설명. 리터럴 값(참조 주소값 X)을 전달해서 메소드를 호출 시에는 서로 다른 지역 변수는 서로 영향 X */
        int num = 20;
        System.out.println("call by value 전: " + num);
        pt.testPrimitiveTypeParameter(num);                                     // 리터럴 값에 의한 호출
        System.out.println("call by value 후: " + num);

        /* 목차. 2. 기본 자료형 배열을 매개변수로 전달 받는 메소드 호출 */
        int[] iArr = new int[] {1, 2, 3, 4, 5};
        System.out.println("call by reference 전: " + Arrays.toString(iArr));
        pt.testPrimitiveTypeArrayParameter(iArr);                               // 참조 값에 의한 호출
        System.out.println("call by reference 후: " + Arrays.toString(iArr));

        /* 목차. 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 */
        Rectangle r1 = new Rectangle(22, 12);
//        r1.calArea();
//        r1.calRound();
        pt.testClassTypeParameter(r1);

        /* 목차. 4. 아직 클래스 배열(객체 배열)은 배우지 않았으므로 건너 뜀 */

        /* 목차. 5. 가변 인자를 매개변수로 전달 받는 메소드 호출 (자바는 웬만하면 권장 X) */
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순", "볼링");
        pt.testVariableLengthArrayParameter(new String[]{"강감친", "낚시", "독서"});
    }
}
