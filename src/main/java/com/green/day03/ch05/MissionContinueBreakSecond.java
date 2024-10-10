package com.green.day03.ch05;

public class MissionContinueBreakSecond {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다.
            그리고 그 합이 언제(몇을 더했을 때) 1,000을 넘어서는지,
            그리고 1,000을 넘어선 값은 얼마가 되는지 계산하여
            출력하는 프로그램을 작성해보자.
            최종 i 63
            최종 sum 1024
         */


        int sum = 0;
        int i = 1;

        for (i=0;true;i++){
            i++;     //i++가 아래로 가면 i를 1로 시작해야함. 또한 후에 출력된 i값이 원래 나와야 할 수 보다 1 많다.
            if((i%2)==0){
                i++;
                continue;
            }
            sum+=i;
            if(sum>1000){
                break;
            }
        }
        System.out.println(sum);
        System.out.println(i);
    }
}