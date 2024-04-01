package com.ohgiraffers.section01.uses;

public class MemberFinder {

    public Member[] findAllMember(){
        return MemberRepository.findAllMember();
    }

}
