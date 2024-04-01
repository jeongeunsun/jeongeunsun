package com.ohgiraffers.section01.uses;

public class MemberRepository {
    private final static Member[] member;   //final 키워드 사용  > 초기화 해줘야 에러안남
    private  static int count;

    static {    //static 초기화 블럭 이용하여 초기화
        member = new Member[10];
    }

    public static boolean store(Member[] members) {

        for(int i = 0; i < members.length;  i++){
            member[count++] = members[i];   //count++ > 10까지 인덱스에 하나씩 넣어주겠다
        }
        return true;    //true로 받아야 while문 작동
    }

    public static Member[] findAllMember() {
        return member;
    }
}
