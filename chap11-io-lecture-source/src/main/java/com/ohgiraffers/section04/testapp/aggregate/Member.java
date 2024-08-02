package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Member implements Serializable {
    private int memNo;                          // 회원 번호
    private String id;                          // 회원 아이디
    private String pwd;                         // 회원 비밀번호
    private String email;
    private int age;                            // 회원 나이
    private String[] hobbies;                   // 회원 취미들
    private BloodType bloodType;                // 회원 혈액형

    public Member() {
    }

    public Member(String id, String pwd, String email, int age, String[] hobbies) {
        this.id = id;
        this.pwd = pwd;
        this.email = email;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int memNo, String id, String pwd, String email, int age, String[] hobbies, BloodType bloodType) {
        this.memNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.email = email;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public int getMemNo() {
        return memNo;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memNo=" + memNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memNo == member.memNo && age == member.age &&
                Objects.equals(id, member.id) && Objects.equals(pwd, member.pwd) && Objects.equals(email, member.email) &&
                Objects.deepEquals(hobbies, member.hobbies) && bloodType == member.bloodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memNo, id, pwd, email, age, Arrays.hashCode(hobbies), bloodType);
    }
}
