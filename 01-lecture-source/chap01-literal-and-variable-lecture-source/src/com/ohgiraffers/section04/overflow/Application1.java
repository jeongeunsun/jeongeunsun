package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args){

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 자료형의 값의 최대 범위를 벗어나는 경우
        *  발생한 carry를 버림 처리하고 sign bit를 반전시켜 최소값으로 순환시킴
        *  */

        /* 1. 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 : " + num1);

        num1++; //1이 증가

        System.out.println("num1 오버플로우 : " + num1);

        /* 2. 언더플로우 */
        /* 오버플로우와 반대의 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
        *  최대값으로 순환시킴 */
        byte num2 = -128;

        System.out.println("num2 : " + num2);

        num2--; //1이 증가

        System.out.println("num2 언더플로우 : " + num2);




    }
}
