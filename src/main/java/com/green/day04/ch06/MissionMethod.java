package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        int star=(int)(Math.random()*1)+1;
        printstar(5);
        printstar(2);
    }

    static void printstar(int n){
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
