package com.green.day16.ch26;

import com.green.personal.Hypen;

//p.646 멤버 클래스
public class MemberInner {
    public static void main(String[] args) {
        Outer2 o1=new Outer2();
        Outer2 o2=new Outer2();

        Outer2.Member o1m1 = o1.new Member();  //객체 주소값.멤버.. 이렇게 쓰는경우가 잘 없긴 하다.
        Outer2.Member o2m2 = o2.new Member();
        o1m1.add(10);
        o2m2.add(30);

        System.out.println(o1m1.get());
        System.out.println(o1.parentGet());  //o1m1.get()과 같은 값이 나온다.
        Hypen.line();
        System.out.println(o2m2.get());
        System.out.println(o2.parentGet());  //o2m2.get()과 같은 값이 나온다.
    }
}


class Outer2{
    private int num=0;

    class Member{
        void add(int val){
            num+=val;
        }
        int get(){
            return num;
        }
    }

    int parentGet(){
        return num;
    }
}
