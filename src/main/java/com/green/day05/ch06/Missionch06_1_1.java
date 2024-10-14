package com.green.day05.ch06;

public class Missionch06_1_1 {
    public static void main(String[] args) {
        calc(10,4);

    }

    static void calc(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d / %d = %.4f\n", a, b, ((float)a/b));
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d %% %d = %d\n", a, b, a%b);
    }
}
