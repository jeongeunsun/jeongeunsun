package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args){

        /* 수업목표 문자열 합치기 결과를 예측하고 사용할 수 있다. */
        /* 목차 1. 두 개의 문자열 합치기 */
        System.out.println("===========두 개의 문자열 합치기============");
        System.out.println( 9 + 9 ); //18
        System.out.println( "9" + "9" ); //99
        System.out.println( "9" + 9 ); //99
        System.out.println( 9 + "9" ); //99
        /* 문자열은 하나만 있어도 문자열이 나온다 */

        /* 목차 2. 세 개의 문자열 합치기 */
        System.out.println("===========세 개의 문자열 합치기============");
        System.out.println("9" + 9 + 9); //999
        System.out.println(9 + "9" + 9); //999 //왼쪽의 연산부터 수행하고 수행결과를 오른쪽과 연사함
        System.out.println(9 + 9 + "9"); //189 // + 연산방향은 왼쪽에서 오른쪽이다 (숫자부터 합쳐짐)
        System.out.println("9" + (9 + 9)); //918

        /* 목차 3. 문자열 합치기 응용 */
        /* 10과 20의 사칙연산 결과를 출력하세요 */
        System.out.println("===========10과 20의 사칙연산 결과============");
        System.out.println(10 + 20); //30
        System.out.println(10 - 20); // -10
        System.out.println(10 * 20); //200
        System.out.println(10 / 20); //0
        System.out.println(10 % 20); //10

        System.out.println("===========10과 20의 사칙연산 결과를 보기 좋게 출력============");
        System.out.println("10과 20의 합 : " +(10+20)); // 괄호를 묶지않으면 문자열 합치기가 되어서 1020이 된다
        System.out.println("10과 20의 차 : " + (10-20)); // 문자열은 -연산이 불가능하기에 문자열과 -는 연산이 불가능하다(반드시 괄호 사용)
        System.out.println("10과 20의 곱 : " + (10*20));
        System.out.println("10과 20의 몫 : " + (10/20));
        System.out.println("10과 20의 나머지 : " + (10%20));

        System.out.println("기차"); //기차
        System.out.println("기차" + "칙칙폭폭"); //기차칙칙폭폭
        System.out.println("기차" + 123 + 45 + "칙칙폭폭"); //기차12345칙칙폭폭
        System.out.println(123 + 45 + "기차" + "출발"); //168기차출발 //


    }
}
