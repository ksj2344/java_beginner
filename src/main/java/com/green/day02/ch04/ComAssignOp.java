package com.green.day02.ch04;

public class ComAssignOp {
    public static void main(String[] args) {
        /*
            복합 대입 연산자
         */
        int n1=10;
        //n1이 가지고 있는 값에 +2를 하고 싶을 때
        n1=n1+2;
        System.out.printf("n1: %d\n",n1);

        int n2=10;
        n2+=2; //복합대입연산자를 활용  +-/*% 다 사용 가능함.
        System.out.printf("n2: %d\n",n2);

        int n3=5;
        n3=n3*3;
        System.out.printf("n3: %d\n",n3);

        int n4=5;
        n4 *=3;
        System.out.printf("n4: %d\n",n4);
    }
}