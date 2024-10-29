package com.green.day15.ch21;
//제너럴 써서 타입안에 타입넣고 타입안에 타입넣기

public class BoxInBox {
    public static void main(String[] args) {
        BoxGeneric<String> sBox=new BoxGeneric<>("I am so happe!");

        BoxGeneric<BoxGeneric<String>> wBox=new BoxGeneric<>(sBox);
        BoxGeneric<BoxGeneric<BoxGeneric<String>>> zBox=new BoxGeneric<>(wBox);

        BoxGeneric<BoxGeneric<String>> wBox2=zBox.getBox(); //대입연산자 아니고 같은거란 소리.

        BoxGeneric<String> sBox2=wBox2.getBox();
        System.out.println("wBox==wBox2: "+(wBox==wBox2));
    }
}
