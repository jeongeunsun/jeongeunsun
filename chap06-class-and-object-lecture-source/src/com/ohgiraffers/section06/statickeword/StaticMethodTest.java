package com.ohgiraffers.section06.statickeword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("nonStaticMethod 호출함...");
    }

    public static void staticMethod(){
        //this.count++; // static메소드는 new를 사용하지 않아서 this사용 불가 //에러 발생
        System.out.println("StaticMethod 호출함...");
    }
}
