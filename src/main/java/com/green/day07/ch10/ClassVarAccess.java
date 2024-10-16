package com.green.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay();
        aw.increaseCnt(); //이렇게도 되고
        aw.num++; //이렇게도 가능하지만
        AccessWay.num++;  //이렇게 객체화 하지 않고 사용하려고 static을 쓴다.
        System.out.printf("num: %d\n", AccessWay.num); //클래스명.static변수 or 메소드, 이렇게 사용하는 것이 맞다.
        System.out.printf("num: %d\n", aw.num); //가능은 하지만 static때문에 객체화를 하지 않기 때문에 쓸 일이 없다.
    }
}

class AccessWay{
    static int num=0;
    AccessWay(){
        increaseCnt();
    }
    void increaseCnt(){
        num++;
    }  //static이 붙지 않은 메소드에도 static 멤버필드를 호출할 수 있다.
    //반면 non-static 멤버필드는 static 메소드에서 호출 불가하다.
}
