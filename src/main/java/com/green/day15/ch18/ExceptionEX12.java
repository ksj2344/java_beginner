package com.green.day15.ch18;

import com.green.personal.Hypen;

//throws 책임전가에 대한 설명

//메소드를 실행했을 때 오류가 뜬다면 메소드가 존재하지 않거나 메소드 자체에 오류가 있거나
//둘다 해당 없음에도 오류가 있다면? throws Exception된 상태이다. 따라서 해당 메소드 실행 부분을 try-catch로 감싸야한다. (혹은 같이 던지거나)

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
    static void method2() throws Exception{ //얘도 던지면 누구하나는 try-catch를 감싸야함. 그게 보통 main 메소드. 그래서 main은 throws하면 안됨.
        throw new Exception("하하"); //throw는 리턴처럼 예외를 되돌려준다. //getMessage()시 안의 "하하" 가져옴
        //throws 메소드에서만 사용할 수 있는 것이 아니고 예외를 일부러 발생시키고 싶을 때 사용한다.
    }
}
