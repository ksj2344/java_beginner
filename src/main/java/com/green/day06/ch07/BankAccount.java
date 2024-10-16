package com.green.day06.ch07;

//main메소드가 없으므로 다른 class에서 객체화 해서 쓸 수 밖에 없다.
public class BankAccount {
    int balance=0;
    void deposit(int amount) {
        balance+=amount;
    }
    void withdraw(int amount) {
        balance-=amount;
    }
    void checkMyBalance() {
        System.out.println("balance: "+balance);
    }
}
