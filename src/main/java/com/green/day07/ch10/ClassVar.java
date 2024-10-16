package com.green.day07.ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt.instNum=10;
        InstCnt ic1 = new InstCnt();
        InstCnt.instNum=5;
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }
}

class InstCnt{
    static int instNum; //static 메모리(하나의 공간)에 존재하여 참조해서 사용됨.
    //static이 없다면 value처럼 새로 생성되었을 것.
    //이것을 클래스 멤버필드라고 한다.
    int value;  // 객체생성때마다 value라는 값이 생김
    InstCnt(){ //기본 생성자
        System.out.println("인스턴스 생성: "+(++instNum));   //원래 클래스 멤버필드는 InstCnt.instNum이라고 씀. 같은 공간에 있어 생략됨.
        System.out.println("value: "+value);
    }
}
