package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        /*
        continueBasic에 존재하는 while문을 for문으로 변경해보자
         */

        int count = 0;

        for( int n = 1; n <= 100; n++ ){
            if(((n%5)!=0) || ((n%7)!=0)){
                continue;
            }
            count++;
            System.out.println("n: "+n);
        }
        System.out.println("count: "+count);

    }
}
