package com.green.day06.ch07;

//import com.green.day06.ch09.Circle2; //디폴트 지시어는 다른패키지에서 접근 불가
import com.green.day06.ch09.InforHideCircle; //다른 패키지에 있는 클래스면 import하여 사용한다.

public class AccessLevelTest {
    public static void main(String[] args) {
        InforHideCircle ihc=new InforHideCircle();
        //InforHideCircle은 public이기 때문에 다른 패키지에서 접근 가능하다.

        //String은 워낙 자주 사용하기 때문에 자동으로 import가 된다.
        String str = "문자열을 지정하는 class";

//        Circle2 c=new Circle2();
        //public을 붙이지 않은 class라 가져올 수 없다.
        //public을 붙이는 조건: 파일명과 class명이 같음

        // ch09 AccessLevelModifiers 내용입니다.
    }
}
