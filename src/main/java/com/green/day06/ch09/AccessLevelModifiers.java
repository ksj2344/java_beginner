package com.green.day06.ch09; //패키지명

public class AccessLevelModifiers {
    /*
       접근 수준 지시자: private, default, protected, public

       private: class내에서만 접근 가능.
       default(아무것도 안적음) : private + 같은 패키지면 접근 가능 >> 잘 안씀
       protected: default + 상속관계면 접근 가능
       public: 무조건 접근가능, 완전 오픈

       ※ 패키지는 부모자식 관계여도 달라지면 다른 패키지임.

       ☆★☆class에 public을 붙일 수 있는 경우★☆★
       java파일명과 class명이 일치할 때만 붙일 수 있다. 나머지는 불가능!!!!
       따라서 보통 1 파일 당 1 class가 붙는다.

       class는 보통 public 붙이고, 멤버필드는 대부분 private이다.
         - private를 붙이지 않는 경우가 있다. >> 상수는 오픈하여도 된다.
         - 변수는 무조건 private(은닉화/캡슐화)
         - private한 멤버필드를 읽기/쓰기 할 때 메소드를 통해서 한다.(getters/setters)
     */
}
