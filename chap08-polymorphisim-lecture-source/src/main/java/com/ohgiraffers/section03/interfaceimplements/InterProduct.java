package com.ohgiraffers.section03.interfaceimplements;

public interface InterProduct extends ParentInterProduct, AnotherParentInterProduct{
//    public static final int MAX_NUM = 100;
    int MAX_NUM = 100;                                  // 상품 최대 100개만 저장 가능하고 이 값을 활용
//    private static final int MIN_NUM = 10;            // 다르게 변형해서 쓸 수 없다.

    /* 설명. 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct() {}

    /* 설명. 기본적으로 추상 메소드만 가능 */
//    private void nonStaticMethod();                   // public abstract만 가능
//    public abstract void nonStaticMethod();
    void nonStaticMethod();

    /* 설명. static 메소드는 바디부까지 작성을 허용 (JDK 1.8부터 추가된 기능) */
    public static void staticMethod() {}

    /* 설명. non-static 메소드라도 default 키워드를 추가하면 바디부까지 작성 허용 (JDK 1.8부터) */
    public default void defaultMethod() {}

    /* 설명. private도 abstract가 아닌 온전한 메소드로 사용 가능 (default도 없이) */
    private void privateMethod() {

        /* 설명. 다른 public default 메소드에서 활용할 수만 있는 기능 */
    }
}
