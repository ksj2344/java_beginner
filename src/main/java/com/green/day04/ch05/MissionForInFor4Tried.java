package com.green.day04.ch05;

public class MissionForInFor4Tried {
    public static void main(String[] args) {
        int star=(int)(Math.random()*6.0)+3;

        int n= star-1;
        for(int i=1;i<=star;i++){
            for(int j=1;j<=star-n;j++){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}
