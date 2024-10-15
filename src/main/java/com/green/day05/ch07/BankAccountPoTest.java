package com.green.day05.ch07;

public class BankAccountPoTest {
    public static void main(String[] args) {
        System.out.println("balance: "+BankAccountPO.balance);  //balance가 다른 클래스에 있으므로 클래스 명을 붙여야함

        int deposit=BankAccountPO.deposit(4000);//아래에 있는 코드랑 결국 같은 소리임
        deposit=BankAccountPO.deposit(4000);//부를때마다 값을 집어넣는다.
        System.out.println("balance: "+BankAccountPO.balance);
        System.out.println("balance: "+deposit);


        deposit=BankAccountPO.withdraw(4000);  //감소 메소드를 스쳐가서 amount만큼 줄어듦
        System.out.println("balance: "+deposit);

        BankAccountPO.checkMyBalance(); //굳이 return할 필요 없는 메소드. 별로 좋은 예시는 아님.

    }

    //전역변수에 있는 값을 변경도 가능하고 return을 통해 가져오는 것도 가능하다.
}
