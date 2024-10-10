package com.green.day03.ch05;

public class InfinityLoop {
    public static void main(String[] args) {
        int n =1;
        while (true) {  //항상 긍정, 무한하게 반복됨.
            if((n%6)==0 && (n%14)==0){    //if와 while(true)를 쓰면 원하는 조건하 반복할 수 있다.
                break;
            }
            n++;
        }
        System.out.printf("n: %d\n", n);
    }
}
