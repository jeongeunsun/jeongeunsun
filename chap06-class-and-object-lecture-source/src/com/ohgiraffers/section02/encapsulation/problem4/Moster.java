package com.ohgiraffers.section02.encapsulation.problem4;

public class Moster {

    /* 접근 제한자란?
    * 클래스 혹은 클래스 멤버에 참조연산자로 접근할 수 있는 범위를 제한시키기 위한 키워드이다.
    * 1. public : 모든 패키지에 접근 허용
    * 2. protected : 동일 패키지 접근 허용. 단, 상속관계에 있는 경우 다른 패키지에서도 접근 가능
    * 3. default : 동일 패키지에만 접근 허용 (작성하지 않은 default)
    * 4. private : 해당 클래스 내부에만 접근 가능.
    * */

    /* 위에 네가지 접근제한자는 클래스 멤버(필드, 메소드)에 모두 가능하다
    * 하지만 클래스는 public, default만 사용 가능하다.
    * */
    private String kinds;
    private int hp;

    //멤버변수의 값을 설정하는 메서드
    public void setKinds(String kinds){
        this.kinds = kinds;
    }
    public void setHp(int hp){
        if(hp > 0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }

    //멤버변수의 값을 반환하는 메서드
    public String getInfo(){
        return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }
}
