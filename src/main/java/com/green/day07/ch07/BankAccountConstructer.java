package com.green.day07.ch07;
//생성자
class BankAccount2 {  //day06패키지에 같은 class명이 있지만 다른 패키지라 사용가능
    private String accNumber; //계좌번호
    private String ssNumber; //주민번호
    private int balance; //잔액

    //private 멤버필드 값 변환 하는 두가지 방법   1. setter   2.생성자 활용
    //※생성자는 있는데 setter 메소드가 없다면? 상수처럼 쓰겠다는 뜻이다.=값을 변경하지 않고 쓰겠다는 뜻이다.
    // 이것을 이뮤터블immutable object라고 한다. 변환 가능 객체는 뮤터블mutable object라고 함.

    /*
        생성자와 메소드는 한 종류
        정의했을 때, 메소드와 다른점은 2가지가 있다.
        1. 이름이 클래스 명과 같다.
        2. 반환명(리턴타입)을 작성하지 않는다.

        생성자의 특징! ※오로지 객체 생성할 때만 호출할 수 있다. 객체생성 이후에는 호출 불가.

        생성자를 작성하지 않으면 기본생성자가 자동으로 만들어진다.
        그러나 생성자를 하나라도 작성을 하게되면 기본 생성자를 자동으로 만들어주지 않는다.
        그럴때는 기본 생성자를 만들어줘야한다. (초기화를 위한 생성자와 기본 생성자 두개 다 필요시 둘다 만들어줘야함)
     */

    //기본 생성자의 모습
    BankAccount2() {
        super(); //생략 가능한 문장
    }

    BankAccount2(String acc, String ss, int bal){ //파라미터가 있는 생성자 or 오버로딩 된 생성자
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    //오버로딩(Overloading): 같은 이름의 메소드를 여러개 만들 수 있는 기법, 파라미터가 다르면 가능하다.
    void initAccount(String acc, String ss, int bal){   //메소드
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
    //일반타입 변수 기본 값.  String:null ,int나 double=0 , boolean=faulse
    }
}


public class BankAccountConstructer {
    public static void main(String[] args) {
        /*
        객체 생성된 new 키워드 우측에 적는 것은 생성자 호출이다.
        모든 객체지향언어는 객체를 생성할 때 생성자를 호출해야한다.
         */
        BankAccount2 ba1 = new BankAccount2(); //기본생성자 호출
        ba1.checkMyBalance();

        //파라미터가 있는 생성자 호출 or 오버로딩 된 생성자 호출
        BankAccount2 ba2 = new BankAccount2("111-222","990909-1778888",10000);
        ba2.checkMyBalance();

    }
}
