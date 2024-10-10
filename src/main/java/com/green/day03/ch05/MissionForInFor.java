package com.green.day03.ch05;

public class MissionForInFor {
    public static void main(String[] args) {
        /*
        중첩 for문을 이용하여 구구단 출력
         */

        for(int dan=2; dan<10; dan++) {
            for(int n=1; n<10; n++) {
                System.out.printf("%d x %d = %d\n", dan, n, dan*n);
            }
            System.out.println("");
        }
    }
}
