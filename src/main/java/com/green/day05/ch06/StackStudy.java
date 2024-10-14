package com.green.day05.ch06;

//Stack메모리 영역 소개
public class StackStudy {
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
