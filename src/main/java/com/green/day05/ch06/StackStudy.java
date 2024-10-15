package com.green.day05.ch06;

//Stack메모리 영역 소개
public class StackStudy {
    /*
        stack: FILO(First In Last Out)
                가장 먼저 들어온 것이 가장 늦게 나간다. 비유하자면 바구니형 구조
        heap: FIFO(First In First Out)
                가장 먼저 들어온 것이 가장 빨리 나간다. 비유하자면 터널형 구조
     */
    public static void main(String[] args) {
        System.out.println("--main [start] --"); //1번째
        methodA();
        System.out.println("--main [end] --"); //6번째
    }
    static void methodA(){
        System.out.println("---methodA [start] ---"); //2번째
        methodB();
        System.out.println("---methodA [end] ---"); //5번째
    }
    static void methodB(){
        System.out.println("----methodB [start] ----"); //3번째
        System.out.println("----methodB [end] ----"); //4번째
    }

}
