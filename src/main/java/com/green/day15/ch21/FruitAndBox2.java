package com.green.day15.ch21;

public class FruitAndBox2 {
    public static void main(String[] args){
        FruitBox appleBox=new FruitBox(new Apple());  //같은 패키지 다른 클래스의 Apple 가져오기
        FruitBox orangeBox=new FruitBox(new Orange());
        //이렇게하면 사과가 새로 생기든 오렌지가 새로 생기든 같은 규격의 박스를 만들면 된다.
        //그러나 매번 object검증이 필요하다.

        Apple apple=(Apple)appleBox.getFruit();
        Orange orange=(Orange)orangeBox.getFruit(); //object로 리턴되므로 형변환 필요

        FruitBox orangeBox2=new FruitBox("오렌지");
        Orange orange2=(Orange)orangeBox2.getFruit(); // 형변환 불가하다.
    }
}

class FruitBox{
    private Object fruit; //전역변수에 값을 넣어주는 이유: 외부에서 접근하여 값을 알아낼 때 전달을 위해서

    FruitBox(Object fruit){
        if(fruit instanceof Apple||fruit instanceof Orange) {
            this.fruit = fruit;
        }
    }

    Object getFruit(){
        return fruit;
    }
}
