package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        /*
        1-100까지 출력
        100-1까지 출력
         */

        int n=1;
        while(n<100){
            System.out.print(n+++" ");
        }
        System.out.println(n);
        do{
            System.out.print(n--+" ");
        }while(n>0);
        System.out.println();

        while(n<=100){
            System.out.println(n++);  //출력 후에 n에 1을 더한다.
        }
        System.out.println("----");
        do{
            System.out.println(--n);   //먼저 1을 빼고 난 뒤에 출력을 한다.
        }while(n>1);

    }
}
