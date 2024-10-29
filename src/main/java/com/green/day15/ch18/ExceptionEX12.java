package com.green.day15.ch18;

import com.green.personal.Hypen;

//throws 책임전가에 대한 설명

public class ExceptionEX12 {
    public static void main(String[] args){
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Hypen.end();
    }
    static void method1() throws Exception{ //얘도 던지고
        method2();
    }
    static void method2() throws Exception{ //얘도 던지면 누구하나는 try-catch를 감싸야함. 그게 보통 main 메소드
        throw new Exception("하하");  //getMessage()시 안의 "하하" 가져옴
        //throws 메소드에서만 사용할 수 있는 것이 아니고 예외를 일부러 발생시키고 싶을 때 사용한다.
    }
}
