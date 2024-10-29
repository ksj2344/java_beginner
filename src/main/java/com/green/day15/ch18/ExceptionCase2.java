package com.green.day15.ch18;

import com.green.personal.Hypen;

public class ExceptionCase2 {
    /*
    try-catch문(예외처리)
    try문에 에러가 날 가능성이 있는 코드를 위치한다.
    만약에 예외가 발생이 된다면 catch부분이 실행된다!
    예외가 발생이 되지 않는다면 catch부분이 실행이 되지 않는다.
    if문과 유사하다.
     */

    public static void main(String[] args) {
        int n1=10;
        int n2=0; //0으로 나누려면 항상 수학적 에러가 발생
        try{
            System.out.printf("%d/%d=%d\n",n1,n1,(n1/n2));
        } catch (ArithmeticException e){
            e.printStackTrace(); //try-catch문이 없었다면 콘솔에서 봤을 내용을 찍는다.
            System.out.println(e.getMessage());
        }
        //catch() 메소드, ArithmeticException 에러에 관련한 객체(클래스), e 객체주소
        //catch문에서 또 에러가 발생할 수 있으므로 catch문 안에 catch문을 넣을 수 있다. 그러나 안하도록 하는게 좋음.
        Hypen.end();
    }
}
