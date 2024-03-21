package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args){

        /* 수업 목표. 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */
        /* 논리 연산자의 우선순위와 활용
        *   논리 and 연산자와 논리 or 연산자의 우선순위
        *   && : 11순위
        *   || : 12순위
        *   논리 and 연산자 우선순위가 논리 or 우선순위보다 높다
        *   */

        /* 1. 1부터 100 사이의 값인지 확인 */
        /* 1 <= 변수 <= 100 이렇게는 사용 못함 --> 변수 >=1 && 변수 <=100 이렇게 사용해야 한다. */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));


    }
}
