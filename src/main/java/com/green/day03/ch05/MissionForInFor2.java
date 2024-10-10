package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int dan = 2; dan < 10; dan++) {
                System.out.printf("%d x %d = %d\t", dan, i, dan * i);
            }
            System.out.println();

        }
    }
}
