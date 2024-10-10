package com.green.day03.ch05;

public class MissionContinueBreakSolved1 {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다.
            그리고 그 합이 언제(몇을 더했을 때) 1,000을 넘어서는지,
            그리고 1,000을 넘어선 값은 얼마가 되는지 계산하여
            출력하는 프로그램을 작성해보자.
            최종 i 63
            최종 sum 1024
         */

        int i=0;
        int odd=0;
        while(odd<1000){
            i++;
            if((i%2)==1){ // i값을 2로 나눳을때 나머지 값 1>>홀수
                odd+=i;
            }
        }
        System.out.println("마지막 더한 값: "+i);
        System.out.println("1000을 넘은 합계: "+odd);
    }
}