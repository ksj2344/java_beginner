package com.green.day02;

public class OverFlow {
    public static void main(String[] args){
        /*
        5리터 컵에 5리터 이상의 물을 넣었을 때, 물이 넘친다.
        이 현상을 오버플로우라고 한다.
        100까지 저장할 수 있는 곳에 101 이상을 저장하게 되면 오버플로우
        현상이 나타난다. 다만 현실과는 다르다.
        현실에서는 한계 용량만큼 저장되지만, 코딩에서는 넘친 분량이 저장된다.

        byte: -128~127 범위의 값을 저장 가능하다.
         */

        byte var1 =127;
        System.out.printf("var1: %d\n", var1);

        byte var2 = (byte)128;
        byte var3 = (byte)129;
        System.out.printf("var2: %d\n", var2);
        System.out.printf("var3: %d\n", var3);
    }
}
