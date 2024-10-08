package com.green.day02;

public class UnderFlow {
    public static void main(String[] args) {
        byte var1=-128;
        System.out.printf("var1:%d\n",var1);

        byte var2=(byte)-129;
        System.out.printf("var2:%d\n",var2);
        //underflow가 실행되어서 +127으로 출력됨.
    }
}
