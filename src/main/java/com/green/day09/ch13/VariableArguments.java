package com.green.day09.ch13;

public class VariableArguments {
    //가변인수(가변인자)
    public static void main(String[] args) {
        sum(1,2); //두개의 인자를 보낸다
        //객체생성을 하지 않았다! 인스턴스 메소드가 아니다=클래스(static) 메소드다.
        sum(10,22,33);  //세개의 인자를 보낸다

        //그렇다면 정해진 갯수가 없는 n개의 인자를 보낼때는? 가변인자
        //같은 타입의 인자를 무한으로 받을 수 있다.
        //인자를 자동으로 배열로 반환하여 파라미터로 받는다.
        sumVar(1); //[1]
        sumVar(1,2); //[1, 2]
        sumVar(1,2,3); //[1, 2, 3]
        sumVar(1,2,3,4); //[1, 2, 3, 4]
        sumVar(1,2,3,1,2,3); //[1, 2, 3, 1, 2, 3]
    }

    static void sumVar(int... values){   //int 타입 뿐만 아니라 다른 타입, 물론 레퍼런스 타입도 가능하다! //(타입... 파라미터) 같은식으로 씀
        int sum = 0;
        for(int i=0;i<values.length;i++){
            sum += values[i];
        }
        System.out.println(sum);
    }

    static void sum(int n1, int n2) {
        //System.out.println(n1 + n2);
        sum(n1,n2,0);
    }

    static void sum(int n1, int n2, int n3) {
        System.out.println(n1+n2+n3);
    }
}
