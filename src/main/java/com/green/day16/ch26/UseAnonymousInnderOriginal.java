package com.green.day16.ch26;
//익명클래스를 사용하지 않고, FM대로 적는다면 이렇게 써야함.
public class UseAnonymousInnderOriginal {
    public static void main(String[] args) {
        Printable p=new PrintalbeImpl();
        p.print();
    }
}

class PrintalbeImpl implements Printable{  //UseAnonymousInnder에 있는 interface Printable 임플리먼트
    @Override
    public void print(){
        System.out.println("이름있는 클래스 print");
    }
}
