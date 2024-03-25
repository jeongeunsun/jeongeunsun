package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){
        /* 수업목표. for 단독 사용에 대한 흐름 이해하고 적용할 수 있다. */
        /*
        * [for문 표현식]
        * for(초기식; 조건식; 증감식){
        *   조건을 만족하는 경우 수행할 구문(반복할 구문)
        * }
        * */

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        int j = 1;
        for(; j <= 15; j++){
            System.out.println(j);
        }
        /*for(;j <= 20;){
            System.out.println(j);
            j++;                    //밖에 써도 된다.
        }*/
    }

    public void testForExample1(){
        /* 우리가 뭘 반복하는지 확인하여 반복문으로 개선할 수 있다. */
        /* 10명의 학생의 이름을 입력 받아 이름을 출력해보자 */
        Scanner sc = new Scanner(System.in);

        System.out.println("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
    }
}
