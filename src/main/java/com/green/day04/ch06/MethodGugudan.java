package com.green.day04.ch06;

public class MethodGugudan {
    public static void main(String[] args) {
        gugudan(4);
        gugudan(6);

        gugudanFromTo(5,9); //5~9단까지
        System.out.println("=============");
        gugudanFromTo(2,4); //2~4단까지
    }
    static void gugudanFromTo(int dan,int n) {
        for (int i=dan; i <= n; i++) {
            for (int j = 1; j <10; j++) {
                System.out.printf("%d x %d = %d\n", i,j, (i*j));
            }
            System.out.println();
        }
    }
    static void gugudan(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
        System.out.println();
    }

}
