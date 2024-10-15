package com.green.day06.ch07;

import com.green.day05.ch07.BankAccountPoTest2;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.deposit(1000);
        //PassingRef의 객체화를 안했기 때문에 check메소드를 작성시 static 메소드를 써야한다.
        check(ba);

        PassingRef pf=new PassingRef();
        pf.check2(ba);  //check(ba);의 non-static방식

        //위에서 선언하는것과 같은 형태. 결국 주소값을 복사해서 주는 것과 같다.
        BankAccount ba2 = ba;
        ba2.checkMyBalance();
        ba.checkMyBalance();

        ba2=null;  //null의 의미는 객체를 가리키고 있지 않다.(주소값 없다.)
        //null은 리터럴이기 때문에 null이라는 공간에 값을 저장할 수 없다.
        //이후 ba2에 새로운 값을 저장할 수는 있다. 왜? 변수이기 때문에.
        //값을 새로 지정하기 전 메소드 호출 시 NullPointException(에러)가 발생한다.
        if(ba2!=null){   //null체크 예외처리
            ba2.checkMyBalance();
        }

    }
    static void check(BankAccount money) {  //여기서 money는 ba2의 주소값을 받아온다.
        money.checkMyBalance();
    }

    void check2(BankAccount money) {
        money.checkMyBalance();
    }
}
