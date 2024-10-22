package com.green.day11.ch16;

public class OverridingThString {
    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println(cake);
        CheeseCake jerry = new CheeseCake();
        System.out.println(jerry);

        Cake c2=jerry; //Cake타입에 CheeseCake 타입을 저장할 수 있다. //c2와 jerry는 같은 객체를 가리킨다.
        System.out.println(c2); //실행이 된다면 cheeesCake나 c2나 똑같다.
    }
}

class Cake extends Object {
@Override //오버라이딩 실수 방지용, 오버라이딩이 아닐 시 컴파일 에러
    public String toString(){
        return "My birthday cake";
    }

    final void blowCandle(){  //final을 붙인 메소드는 오버라이딩 할 수 없다.
        System.out.println("I am blowing candle");
    }
}

//class 앞에 final 키워드가 있다면 상속할 수 없다!!!!
//대표적으로 String 클래스는 상속이 불가능하다.
final class CheeseCake extends Cake{
@Override   //부모가 오버라이드 하더라도 자식도 오버라드 할 수 있다.
    public String toString(){
        return "My birthday cheese cake";
    }
//    void blowCandle(){
//    System.out.println("I am blowing little candle");
//    }
    //자식 클래스에서 blowCandle 오버라이딩 할 수 없다. 부모 메소드에서 final키워드가 있기 때문에.
}

//class ChocolateCake extends CheeseCake{}
//상속을 받을 수 없다!