package com.green.day05.ch07;

public class BankAccountPoTest2 {
    public static void main(String[] args) {
        BankAccountPO po1=new BankAccountPO();
        po1.deposit(1000);
        po1.checkMyBalance();

        BankAccountPO po2=new BankAccountPO();
        po2.checkMyBalance();  //po1과 같은 값이 나온다.

        //static이 붙은 class는 객체화를 안한다.
        //static이 붙는 순간은 결국 메모리가 붙기 때문에 객체화를 하나 안하나 똑같다.

        BankAccountPO.checkMyBalance();
        //클래스명으로도 객체명 없이 호출이 가능하다.
    }
}
