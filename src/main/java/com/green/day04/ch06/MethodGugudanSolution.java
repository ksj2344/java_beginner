package com.green.day04.ch06;

public class MethodGugudanSolution {
    public static void main(String[] args) {
        gugudan(4);
        gugudan(6);

        gugudanFromTo(5,9); //5~9단까지
        System.out.println("=============");
        gugudanFromTo(2,4); //2~4단까지
    }
    static void gugudanFromTo(int dan,int n) {
        for (int i=dan; i <= n; i++) {
            gugudan(i);    //원래라면 반복으로 적어야 했던 메소드를 void 메소드(gugudan) 호출로 해결
        }
    }
    static void gugudan(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
        System.out.println();
    }

}
