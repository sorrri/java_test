package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    @Override
    public void run() {
        System.out.println("레이싱 지동차가 신나게 달립니다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적따위 울리지 않습니다.");
    }
}
