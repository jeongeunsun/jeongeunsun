package com.ohgiraffers.section06.statickeword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest(){} //기본생성자 생성

    public int getNonStaticCount() {
        return this.nonStaticCount;
    }

    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }
    public void increaseNonStaticCount(){this.nonStaticCount++;}
    public void increaseStaticCount(){StaticFieldTest.staticCount++;}
}
