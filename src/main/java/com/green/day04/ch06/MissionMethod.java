package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        int star=(int)(Math.random()*6)+3;
        printstar(5);
        printstar(2);
        System.out.println("-----------------");
        printstarSquare(4);
        System.out.println("-----------------");
        printstarTriangle(4);
    }

    static void printstar(int n){
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    static void printstarSquare(int Square){
        for(int i=0; i<Square; i++){
            printstar(Square);
        }
    }
    static void printstarTriangle(int Triangle) {
        for (int i = 1; i <= Triangle; i++) {
            printstar(i);
        }
    }

}
