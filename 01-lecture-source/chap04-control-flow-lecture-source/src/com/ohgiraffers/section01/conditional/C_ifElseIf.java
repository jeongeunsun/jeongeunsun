package com.ohgiraffers.section01.conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_ifElseIf {
    public void testSimpleIfElseIfStatement() {
        /* 수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
         * [if-else-if문 표현식]
         * if(조건식1){
         *       조건식1이 true일 때 실행할 명령문;
         * }else if(조건식2){
         *       조건식2이 true일 때 실행할 명령문;
         * }else{
         *       위의 두 개의 조건이 모두가 거짓일 경우 실행할 명령문;
         * */

        System.out.println("산 속에 나무를 하던 나무꾼이 연못에 도끼를 빠트리고 말았다!");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼한테 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.print("어느 도끼가 너의 도끼이냐? (1. 금도끼 2. 은도끼 3. 쇠도끼) : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        
        if(answer == 1){
            System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 욕심쟁이야!!");
        } else if (answer == 2) {
            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라!!");
        } else {
            System.out.println("오호 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼 모두 가져가거라!!");
        }
        System.out.println("그렇게 산신령은 다시 연못 속으로 사라졌다....");
    }

    public void testNestedIfElseIfStatemnent(){

        /* 수업목표. 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if-else-if문 실행 흐름 확인 */

        /*
         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        /* 설명. 학생의 이름과 점수 입력 */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        /*  학생의 등급을 저장하기 위한 변수 초기화 */
        String grade = "";

        /* 설명. 학점등급을 매기기 위해 점수를 확인 하기 위한 조건문 */
        if(point >= 90) {

            /*  점수가 90점 이상인 경우 */
            grade = "A";

            /*  등급은 A등급인데 그럼 +가 붙을 자격이 있는지(95점 이상인지) 다시 확인 */
            if(point >= 95) {

                /*  95점 이상인 경우 A등급에 +기호를 덧붙여 A+ 등급을 만들어준다. */
                grade += "+";
            }

        } else if(point >= 80) {

            /* 점수가 90점 미만, 80점 이상인 경우 */
            grade = "B";

            /*  등급은 B등급인데 그럼 +가 붙을 자격이 있는지(85점 이상인지) 다시 확인 */
            if(point >= 85) {

                /* 85점 이상인 경우 B등급에 +기호를 덧붙여 B+ 등급을 만들어준다. */
                grade += "+";
            }

        } else if(point >= 70) {

            /* 점수가 80점 미만, 70점 이상인 경우 */
            grade = "C";

            /* 등급은 C등급인데 그럼 +가 붙을 자격이 있는지(75점 이상인지) 다시 확인 */
            if(point >= 75) {

                /* 75점 이상인 경우 C등급에 +기호를 덧붙여 C+ 등급을 만들어준다. */
                grade += "+";
            }

        } else if(point >= 60) {

            /* 점수가 70점 미만, 60점 이상인 경우 */
            grade = "D";

            /*  등급은 D등급인데 그럼 +가 붙을 자격이 있는지(65점 이상인지) 다시 확인 */
            if(point >= 65) {

                /*  65점 이상인 경우 D등급에 +기호를 덧붙여 D+ 등급을 만들어준다. */
                grade += "+";
            }

        } else {

            /*  위 조건을 다 만족하지 못하는 점수가 60점 미만인 경우 */
            grade = "F";

            /*  등급이 F인 경우는 +를 붙이지 않는다. */

        }

        /* 설명. 위에서 결정된 등급을 점수와 함께 출력한다. */
        System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
        System.out.println("프로그램을 종료합니다.");
    }

    public void improveNestedIfElseIfStatement() {

        /* 필기.
         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        /* 학생의 이름과 점수 입력 */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        /*  학생의 등급을 저장하기 위한 변수 초기화 */
        String grade = "";

        /*  학점등급을 매기기 위해 점수를 확인 하기 위한 조건문 */
        if(point >= 90) {

            /*  점수가 90점 이상인 경우 */
            grade = "A";

        } else if(point >= 80) {

            /*  점수가 90점 미만, 80점 이상인 경우 */
            grade = "B";

        } else if(point >= 70) {

            /*  점수가 80점 미만, 70점 이상인 경우 */
            grade = "C";

        } else if(point >= 60) {

            /*  점수가 70점 미만, 60점 이상인 경우 */
            grade = "D";

        } else {

            /*  위 조건을 다 만족하지 못하는 점수가 60점 미만인 경우 */
            grade = "F";
        }

        /*  각 등급의 중간 점수 이상이면서 60점 이상인 경우인지 확인(즉, +를 붙이는 조건에 맞는지 확인) */
        if(point % 10 >= 5 && point >= 60 || point == 100) {

            /* 설명. 60점 이상이면서 10으로 나눈 나머지가 5보다 큰 경우 */
            grade += "+";
        }

        /*  위에서 결정된 등급을 점수와 함께 출력한다. */
        System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
        System.out.println("프로그램을 종료합니다.");
    }

}