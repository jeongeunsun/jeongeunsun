package com.ohgiraffers.section01.extend;

public class Car extends Object{    //object 클래스는 굳이 쓰지않아도 상속되어 있음.

    private boolean runningStatus;  //자동차의 상태를 확인하는 변수 선언
    public Car(){
        System.out.println("Car 클래스 기본 생성자 호출됨...");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다~~");
    }

    public void soundHorn(){    //자동차 경적 울리는 메소드
        if(isRunning()){
            System.out.println("빵!빵!");
        }else{
            System.out.println("주행 중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }
    }
    //private boolean isRunning(){
    protected boolean isRunning(){  //protected는 상속받을수 있다
        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }


}
