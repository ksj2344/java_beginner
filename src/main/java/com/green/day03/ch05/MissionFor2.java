package com.green.day03.ch05;

public class MissionFor2 {
    public static void main(String[] args) {
        /*
        구구단 5단 작성
         */
        int dan=5;  //의미가 있는 숫자를 매직넘버라고 한다.
        for(int i=1; i<10; i++){
            System.out.printf("%d x %d = %d \n",dan,i,dan*i);
        }
    }
}
