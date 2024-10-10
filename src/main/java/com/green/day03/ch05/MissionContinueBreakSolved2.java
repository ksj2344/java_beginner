package com.green.day03.ch05;

public class MissionContinueBreakSolved2 {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다.
            그리고 그 합이 언제(몇을 더했을 때) 1,000을 넘어서는지,
            그리고 1,000을 넘어선 값은 얼마가 되는지 계산하여
            출력하는 프로그램을 작성해보자.
            최종 i 63
            최종 sum 1024
         */

        int i=1;
        int odd=0;
        while(true){
            odd +=i;
            if(odd>=1000){
                break;
            }
            i+=2;
        }
        System.out.println("마지막 더한 값: "+i);
        System.out.println("1000을 넘은 합계: "+odd);
    }
}