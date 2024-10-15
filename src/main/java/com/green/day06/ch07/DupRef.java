package com.green.day06.ch07;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba1=new BankAccount();
        //위 코드의 의미: 참조변수, 변수명 ba1, 주소값 저장 //BankAccount 객체 주소값만★!☆!! 저장 가능

        BankAccount ba2=ba1;  //객체의 주소값을 복사한다.==얕은 복사==shallow copy라고 한다.
        // 깊은 복사도 존재한다. deep copy. 작업물 자체를 복사할때 쓴다.
        // 레퍼런스 변수는 8byte이다.

        ba1.deposit(1000);
        ba2.checkMyBalance();
    }
}
