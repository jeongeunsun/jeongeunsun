package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 배열의 사용방법을 익혀 배열을 사용할 수 있다. */
        /*
        * 배열의 사용방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        * */

        /*1. 배열의 선언
        *   자료형[] 변수명;
        *   자료형 변수명[];
        *   */

        /* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
        int[] iarr;
        char carr[];

        /*
        * 선언한 레퍼런스 변수에 배열을 할당하고 대입할 수 있다
        * new 연산자는 heap영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하고 사용하기 때문에 참조자료형이라고 한다.
        * */

        /*
        * 배열을 할당 시에는 반드시 배열의 크기를 지정해주어야 한다.
        * */
        //iarr = new int[];       //크기를 지정해주지 않아서 에러 발생
        iarr = new int[5];      //
        carr = new char[10];

        /* 위의 선언이랑 할당을 동시에 할 수도 있다. */
        int[] arr2 = new int[5];
        char carr2[] = new char[10];

        /* heap메모리는 이름으로 접근하는 게 아니라 주소로 접근하는 영역이다.
        * stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
        * */

        System.out.println("iarr = " + arr2);   //16진수 주소값
        System.out.println("carr = " + carr2);  //16진수 주소값

        /*
        * hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성된 객체의 고유한 정수값을 반환한다.
        * 동일객체인지 비교할 때 사용할 목적으로 쓰이며 동등 객체를 동일 객체 취급하기 위해 오버라이딩해서 사용한다.
        * */

        System.out.println("arr2 = " + arr2.hashCode());
        System.out.println("carr2.hashCode() = " + carr2.hashCode());

        /* 배열의 길이 확인 */
        System.out.println("arr2의 길이 " + arr2.length);
        System.out.println("carr2의 길이 " + carr2.length);

        /* 스캐너를 이용해 배열의 길이를 입력 가능 */
        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 hasecode : " + darr.hashCode());  //51228289
        System.out.println("darr의 길이 : " + darr.length);

        /* 한번 지정한 배열의 크기는 변경 하지 못한다. */
        darr = new double[30];
        /* 배열의 사이즈를 변경한 것이 아니고, 새로운 배열을 생성한 것 */
        System.out.println("변경 후 darr의 hasecode : " + darr.hashCode());  //455896770
        System.out.println("변경 후 darr의 길이 : " + darr.length);

        /* 한번 할당된 배열은 지울 수 없다.
        * 단, 레퍼런스 변수를 null로 변경하여 더 이상 주소를 참조할 수 없게 할 수 있다. */
        darr = null;

        //System.out.println("darr.length = " + darr.length); //에러 발생
    }
}
