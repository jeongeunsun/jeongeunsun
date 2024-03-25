package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNice(){

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */
        /* for문 안에 for문을 이용할 수 있다. */

        for(int dan = 2; dan < 10; dan++){ //초기식, 조건식, 증감식

            for(int su = 1; su < 10; su++){

                System.out.println(dan + " * " + su + " = " + (dan*su));
            }

            System.out.println();
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다.(2) */
        /* 단을 2단부터 9단까지 하나씩 증가시킨다. */
        for(int dan = 2; dan < 10; dan++) {

            /* 설명. 한 단씩 구구단을 출력하는 메소드를 호출하며 인자로 단을 전달한다. */
            printGugudanOf(dan);
            /* 설명. 한 단을 출력하고 한 줄을 띄운다. */
            System.out.println();
        }

    }

    public void printGugudanOf(int dan) {

        /* 설명. 매개변수로 전달받은 단을 1 ~ 10까지 곱한 내용을 출력해준다. */
        for(int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public  void printStarInputRowTimes(){

        /* 키보드로 정수 하나를 입력받아 해당 정수 만큼 한 행에 '*'을 5개씩 출력하세요 */
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for(int i = 1; i <=row; i++){

            /*for(int j = 1; j < 6; j++){
                System.out.print("*");
            }*/
            printStar(5);

            System.out.println();
        }
    }
    public void printStar(int times){
        for(int i = 1; i <= times; i++){
            System.out.print("*");
        }
    }
    public void printTriangleStars(){
        /*
        * 예시) 정수를 입력하세요 : 5
        *           *
        *           **
        *           ***
        *           ****
        *           *****
        * */
        System.out.println("출력할 줄 수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <=row; i++){
            printStar(i);
            System.out.println();
        }
    }
}
