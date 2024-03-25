package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
        /* 단독 if문 흐름 확인용 메소드 출력 */
        //a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 출력 */
        //a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        /* 단독 if-else문 흐름 확인용 메소드 호출 */
        //b.simpleIfElseStatement();

        /* 중첩 if-else문 흐름 확인용 메소드 호출*/
        //b.testNeatedIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
        //c.testSimpleIfElseIfStatement();
        //c.testNestedIfElseIfStatemnent();

        D_switch d = new D_switch();
        //d.testSimpleSwitchStatement();
        d.testSwitchVendingMachine();

    }
}
