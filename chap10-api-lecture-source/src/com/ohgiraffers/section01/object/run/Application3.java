package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {
        /* Object클래스의 hashcode(메소드의 오버라이딩 목적을 이해하고 활용할 수 있다. */
        /*
        * equals() 메소드를 재정의하는 경우 반드시 hashcode()메소드도 재정의 하더럭 되어있다.
        * 만약에 hashcode()를 재정의하지 않으면 같은 값을 가지게 되는 동등객체는
        * 같은코드값을 가져야한다는 규약에 위반되게 된다(강제성은 없지만 규약대로 작성하는 게 좋음)
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());

        Map<Book, String> map = new HashMap<>();
        map.put((new Book(1, "홍길동전", "허균", 50000)),"Best");
        String str = map.get((new Book(1,"홍길동전","허균",50000)));
        System.out.println(str);
    }
}
