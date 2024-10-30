package com.green.day15.ch21;
//제네릭 써서 타입안에 타입넣고 타입안에 타입넣기. 마치 마트료시카처럼

public class BoxInBox {
    public static void main(String[] args) {
        String str = "I am so happy.";
        BoxGeneric<String> sBox = new BoxGeneric<>(str);

        BoxGeneric<BoxGeneric<String>> wBox=new BoxGeneric<>(sBox);

        BoxGeneric<BoxGeneric<BoxGeneric<String>>> zBox=new BoxGeneric<>(wBox);

        BoxGeneric<BoxGeneric<String>> wBox2=zBox.getBox(); //대입연산자 아니고 같은거란 소리.

        BoxGeneric<String> sBox2 = wBox2.getBox();

        String str2 = sBox2.getBox();

        System.out.println("wBox == wBox2 : " + (wBox == wBox2)); //true
        System.out.println("str == str2 : " + (str == str2)); //true
    }
}
