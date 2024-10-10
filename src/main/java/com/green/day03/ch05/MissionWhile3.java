package com.green.day03.ch05;

public class MissionWhile3 {
    public static void main(String[] args) {
        //1000이하 자연수 중 2의 배수이자 7의 배수인 수를 모두 출력, 그 수들의 합을 구하여 출력

        int n=1;
        int sum=0;
        while (n<=1000){
            if(n%2==0 && n%7==0){
                System.out.print(n+" ");
                sum+=n;
            }
            n++;    // n의 시작이 1이었기때문에 이 위치, n이 0으로 시작했다면 if질의 이전에 n++;이 있었어야 했을것.
        }
        System.out.println("");
        System.out.println("sum="+sum);

    }
}
