package com.green.day02.ch05;

public class IEBasic {
    public static void main(String[] atgs){
        int n1=5, n2=7;
        //if문, 분기문 >> 갈림길을 만들 수 있다.
        //if 소괄호 안에는 boolean 문만 올 수 있음.
        if(n1<n2) {   //if(true) 일 때 중괄호 사이의 코드들이 실행된다.
            System.out.printf("%d<%d is %b\n", n1, n2, (n1 < n2));
        }
        if(n1>n2){   //if(false) 일 때는 {} 안의 코드는 실행되지 않는다.
            System.out.printf("%d>%d is %b\n", n1, n2, (n1>n2));
        }
        System.out.println("------------------------");

        // if-else문은 그룹이 되고 둘 중 하나만 반드시 실행이 된다.
        // if(true) if(){}안의 내용이 실행이 되고, if(false)의 경우 else{}안의 내용이 실행된다.
        if(n1==n2){
            System.out.printf("%d==%d is %b\n", n1, n2, (n1==n2));
        }else{
            System.out.printf("%d!=%d is %b\n", n1, n2, (n1==n2));
        }
    }
}
