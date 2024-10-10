package com.green.day03.ch05;

public class ForInFor {
    public static void main(String[] args) {
        //중첩 for문
        for(int i=0; i<5; i++){
            System.out.println("------------------------------");
            for(int z=0; z<5; z++){             //해당 for문이 먼저 다 실행되어야 바깥의 for문이 다시 실행된다.(이후 또 반복)
                System.out.printf("[%d, %d]",i,z);
            }
            System.out.println();
        }
    }
}
