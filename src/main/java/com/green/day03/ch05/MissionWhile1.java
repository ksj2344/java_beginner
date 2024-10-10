package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {
        /*
        1~99의 합을 구하는 프로그램
        1. 1~99의 값을 만들 수 있어야한다.
        2. 만든 값을 중첩해서 저장할 수 있어야한다.
         */
        int n=1;
        int sum=0;
        while(n<=99){
            //sum=sum+(n++); 를 복합연산자로 줄일 수 있다.
            sum+=n++;
        }
        System.out.printf("1부터 %d까지의 합은: %d",n-1,sum);
    }
}
