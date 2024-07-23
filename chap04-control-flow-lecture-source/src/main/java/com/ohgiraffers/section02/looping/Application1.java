package com.ohgiraffers.section02.looping;

public class Application1 {
    public static void main(String[] args) {

        A_for aClass = new A_for();

        /* 설명. 단독 for문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleForStatement();
//        aClass.testForExample1();
//        aClass.testForExample2();

        B_nestedFor bClass = new B_nestedFor();
//        bClass.printGugudanFromTowToNune();
//        bClass.printStars();
//        bClass.printStars2();

        C_while cClass = new C_while();
//        cClass.testSimpleWhileStatement();
//        cClass.testWhileExample();

        D_doWhile dClass = new D_doWhile();
//        dClass.testSimpleDoWhileStatement();
        dClass.testDoWhileExample();
    }
}
