package com.green.day05.ch07;

public class BankAccountPO {
    //아래는 데이터 저장
    static int balance=0; //static 전역변수    //static이 붙을 시 객체화 작업이 필요없음(그냥 실체가 된다.)
    //static 멤버필드는 static 메소드에서만 사용가능하다.
    //static이 붙지 않은 객체는 객체화하여 주소값을 지정해야한다.

    //아래는 기능(메소드)
    static int deposit(int amount) { //입금을 담당하는 메소드
        //호출할 때 보내는 값이 곧 값이 될 것.
        balance+=amount;
        return balance;
    }

    static int withdraw(int amount) {
        balance-=amount;
        return balance;
    }

    static int checkMyBalance() {
        System.out.println("잔액: "+balance);
        return balance;
    }
}
