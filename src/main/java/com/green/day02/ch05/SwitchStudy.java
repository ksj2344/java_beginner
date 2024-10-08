package com.green.day02.ch05;

import java.util.Scanner;

public class SwitchStudy {
    public static void main(String[] args) {
        String name = new String("홍길동");
        String name2 = new String("홍길동");

        System.out.printf("name: %s\n", name);
        System.out.printf("name: %s\n", name2);
        System.out.printf("name==name2: %b\n", name==name2); //객체의 존재자체가 같은가에 대한 질문
        System.out.printf("name.equals(name2): %b\n", name2.equals(name)); //문자열 내부의 값이 같은지 비교하는 연산
        //☆★☆문자열이 같은가 비교할 때 ==이 아니라 equals를 사용함☆★☆

        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요.: \n");
        String input = scan.next();
        if("abc".equals(input)){
            System.out.println("def");
        }

        switch(input){
            case "abc":                         //switch문은 .equals()을 쓸 필요 없어서 편하다.
                System.out.println("switch-def");
            break;
        }

    }
}
