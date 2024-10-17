package com.green.day08.ch13;

public class DataSwapping {
    public static void main(String[] args) {
        int n1=10, n2=20;
        //n1의 값과 n2의 값을 서로 자리를 바꿔보자.
        int temp;
        temp=n1;
        n1=n2;
        n2=temp;
        //이것을 스와핑이라고 한다.

        System.out.printf("n1: %d, n2: %d\n", n1, n2);
    }
}
