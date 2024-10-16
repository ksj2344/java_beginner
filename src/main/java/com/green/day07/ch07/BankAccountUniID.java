package com.green.day07.ch07;
class BankAccount {  //day06패키지에 같은 class명이 있지만 다른 패키지라 사용가능
    private String accNumber; //계좌번호
    private String ssNumber; //주민번호
    private int balance; //잔액

    void initAccount(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    void deposit(int amount) {
        balance+=amount;
    }
    void withdraw(int amount) {
        balance-=amount;
    }
    void checkMyBalance() {
        System.out.println("계좌번호: "+accNumber);
        System.out.println("주민번호: "+ssNumber);
        System.out.println("잔   액: "+balance);
    }
}
//일반타입 변수 기본 값.  String:null ,int나 double=0 , boolean=faulse


public class BankAccountUniID {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.initAccount("12-34-89", "990909-9090990", 10000); //메소드 호출로서 값을 지정하는방법

        BankAccount ba2 = new BankAccount();
        ba2.initAccount("33-44-09", "770808-5959007", 20000);

        ba1.checkMyBalance();
        ba2.checkMyBalance();
    }
}
