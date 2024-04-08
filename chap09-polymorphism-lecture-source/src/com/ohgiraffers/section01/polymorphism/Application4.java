package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 리턴타입을 활용할 수 있다. */
        /* 1. getRandomAnimal() 추가 */

        /* 2. getRandomAnimal() 호출 */
        Application4 app4 = new Application4();
        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
    }

    public Animal getRandomAnimal(){    //사용자 정의 타입
        int random = (int)(Math.random() * 2);
        System.out.println("random = " + random);
        return random == 0? new Rabbit() : new Tiger();
    }
}
