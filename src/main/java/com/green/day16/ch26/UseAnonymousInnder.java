package com.green.day16.ch26;

import com.green.personal.Hypen;

//p.653
//익명클래스, 이름이 없는 클래스를 뜻한다.
//람다식도 함께 배워보자.
public class UseAnonymousInnder {
    public static void main(String[] args) {
        //익명클래스
        Printable pr = new Printable() {  //인터페이스가 객체화가 된게 아니라 임플리먼트 class가 이름없이 생략된것임. 구현부터 객체화까지 바로 실행.
            @Override
            public void print() {
                System.out.println("익명클래스 print");
            }
        };
        pr.print();

        Hypen.line();

        //만약 interface에 추상메소드를 하나만 가지고 있다면?
        //이런식으로 익명 클래스를 ->으로 더 줄일수도 있다! 이것을 람다식이라고 한다.
        Printable p2 = () -> {      // 여기서의 ()는 오버라이드로 구현된 print()을 뜻한다. 파라미터가 있다면 넣어줘야한다.
            System.out.println("람다 print");
        };
        p2.print();

        Printable p3 = () -> System.out.println("람다 print2");   //구현부가 한줄이면 이렇게 줄일수도 있음.
        p3.print();


        /*
            정리!
            익명 클래스는 interface를 implements한 클래스를 만들지 않고 다이렉트로 interface를 implement한 클래스를 객체화 할 때
            사용할 수 있다.
            즉, 코드 작성을 많이 생략할 수 있다.
            익명클래스 작성보다 더 많이 생략할 수 있는 것이 람다식이다. 얘는 메소드도 생략시키니까.
            람다식을 작성할 수 있는 interface는 오로지 추상메소드 하나만 가지고 있는 경우만 가능하다.
            그래서 보통 람다식을 사용하는 interface는 @FunctionalInterface이 붙어있다.
            @FunctionalInterface는 2개의 추상 메소드가 있으면 컴파일 에러를 발생시킨다.

            람다식의 설명!
            ()  파라미터 부분
            ->  람다식 시작부분
            {}  중괄호 생략이 가능한 경우는 명령이 한줄인 경우 생략 가능하다.
         */
    }
}


@FunctionalInterface //람다식을 쓰고싶을때, 추상 메소드가 둘이면 불가하므로 추상메소드를 하나만 갖도록하는 어노테이션이다.
interface Printable {
    void print();
    //인터페이스는 객체화 불가능. 왜? 추상메소드(구현부 없음)만을 가지기 때문임
}