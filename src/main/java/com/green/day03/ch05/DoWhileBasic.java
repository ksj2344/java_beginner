package com.green.day03.ch05;

public class DoWhileBasic {
    public static void main(String[] atgs){
        /*
        While문은 ()안의 결과가 true인지 먼저 체크 한다.
        체크 후에 true면 반복 시작

        do-while문은 실행 1번 먼저하고 ()안의 결과가 true인지 체크한다.
        체크 후에 true면 반복시작.
         */

        int n=6;
        while(n<5){
            System.out.println("I like JAVA "+n++);
        }


        System.out.println("-----------------");

        int n2=6;
        do{
            System.out.println("I like JAVA "+n2++);
        }while(n2<5);
    }
}
