package com.ohgiraffers.section04.constructor;

public class User {
    private String id = "user888";
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 설명. 기본 생성자(매개변수가 없는)를 활용한 객체 생성 (반드시 명시적으로 작성할 것) */
    public User() {
        System.out.println("User 객체 생성 됩니다.");
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    /* 설명. 원하는 필드를 초기화하는 매개변수가 있는 생성자를 활용한 객체 생성 */
    public User(String id, String pwd, String name, java.util.Date enrollDate) {

        /* 설명. 생성자 내부의 this.은 이 생성자로 생성될 객체를 뜻함 */
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;

        /* 설명. this()를 통해 다른 생성자를 활용하여 코드의 줄 수를 줄일 수 있다. */
        /* 설명. this()를 통해 다른 생성자를 활용할 때는 한 번만 코드 첫 줄에서 활용할 수 있다. */
        this(id, pwd, name);
        this.enrollDate = enrollDate;
    }

    public String information() {
        return "id: " + this.id + ", pwd: " + this.pwd + ", name: " + this.name + ", enrollDate: " + this.enrollDate;
    }
}
