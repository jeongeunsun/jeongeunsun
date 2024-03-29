package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    //이른 초기화
    private static EagerSingleton eager = new EagerSingleton();
    //객체 생성, 클래스가 초기화하는 시점에서 인스턴스를 생성한다.

    private EagerSingleton(){}

    public  static EagerSingleton getInstance(){return eager;}
}

