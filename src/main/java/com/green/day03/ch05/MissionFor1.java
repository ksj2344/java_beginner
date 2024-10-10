package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        /*
        1~10까지의 곱의 결과를 출력
         */
        int n = 1;
        for(int i=2;i<=10;i++){
            n *=i;
        }
        System.out.printf("%,d\n",n);

        System.out.println("-----------------"); //위는 선생님이 푼 것, 아래가 직접 풀이한 것.

        String sentence="1";
        int sum = 1;
        for(int i=2;i<=10;i++){
            sentence=(sentence+"*"+i);
            sum*=i;
        }
        System.out.printf("%s = %,d",sentence,sum);
    }
}
