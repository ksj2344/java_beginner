package com.green.day03.ch05;

public class WhileBasic {
    public static void main(String[] args) {
        /*
        while문은 반복문, ()소괄호 안의 결과가 true인 동안 {}내용이 반복이 된다.
        ()안의 결과가 false가 되는 순간 while문을 빠져나온다.

        몇번 반복하고 싶다면 3가지 요소가 필요하다.
        1. 인덱스 초기화
        2. 비교문(식)
        3. 증감식
         */
        int n=0;  //인덱스 초기화

        while(n<5){     //비교문
            System.out.println((n++)+" I like Java");   //증감식
        }
    }
}
