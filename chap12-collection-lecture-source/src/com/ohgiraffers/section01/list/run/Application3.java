package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        /*
        * LinkedList
        * ArrayList와 사용하는 방식은 유사한데 내부적으로 요소를 저장하는 방법에 차이가 있다.
        * 내부는 이중 연결 리스트로 구현되어 있다.
        *
        * 단일 연결 리스트 : 저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소 사이를 링크로 연결하여 구성하며
        * 마치 연결된 리스트 형태인거처럼 만든 자료구조이다.
        *
        * 이중 연결 리스트 : 단일 연결 리스트는 다음 요소만 링크하는 반명 이중 연결 리스트는 이전 요소도 링크하여
        * 이전 요소로 접근하기 쉽게 고안된 자료구조이다.
        * */

        List<String> linkedlist = new LinkedList<>();

        linkedlist.add("apple");
        linkedlist.add("banana");
        linkedlist.add("orange");
        linkedlist.add("mango");
        linkedlist.add("grape");

        System.out.println(linkedlist.size());

        for(int i = 0; i < linkedlist.size(); i++){
            System.out.println(i + " : " + linkedlist.get(i));
        }
        System.out.println("--------------------------------");
        linkedlist.remove(1);
        System.out.println(linkedlist);

        System.out.println(linkedlist.isEmpty());   //안에 비어있는가? false

        linkedlist.clear();
        System.out.println(linkedlist);

    }
}
