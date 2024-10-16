package com.green.day06.ch07;

public class BankAccountTest {
    public static void main(String[] args) {
        //BankAccount.deposit(4000);
        BankAccount ba = new BankAccount(); //class는 변수 타입으로도 쓸 수 있고 객체화도 가능하다.
        //new 클래스명()은 객체 생성이 된다. //메모리 주소값이 생긴다. 객체 주소값이 변수에 저장된다.
        //BankAccount는 대문자로 시작하는 참조타입(레퍼런스타입). 소문자로 시작하는(예시 int)는 기본타입.
        //레퍼런스 타입은 객체의 주소값을 가진다. 기본타입은 day01.ch02.StudyDataType참조
        //ba는 BankAccount의 객체 주소값만 담을 수 있는 참조변수이다.

        //BankAccount ba2=new Strint("안녕"); //따라서 ba2는 String주소를 담을 수 없다.

        ba.deposit(1000);
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();

        BankAccount ba3 = new BankAccount(); //똑같은 규격의 공간이 새로 생성
        ba3.checkMyBalance(); //ba와 ba3의 공간은 각각 별개의 주소값을 가지므로 값이 따로 저장된다.
        ba3.deposit(40000);
        ba3.withdraw(1000);
        ba3.checkMyBalance();


    }
}
