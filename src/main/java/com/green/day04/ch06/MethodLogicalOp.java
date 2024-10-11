package com.green.day04.ch06;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1 = 110;
        boolean b = logicalOp1(n1);
        System.out.println(b);
        //값이 1이상 100이하라면 true, 아니라면 false
        boolean b2=logicalOp2(n1);
        System.out.println(b2);
        //2배수거나 3배수면 T, 아니면 F
    }
    static boolean logicalOp1(int n) {  //int n은 호출되는 순간 사라지는 변수. 위의 n1과 굳이 맞춰줄 필요는 없음.
        return 1<=n && n<=100;
    }
    static boolean logicalOp2(int n){
        return n%2==0||n%3==0;
    }
}
