package com.green.day01.ch01;

public class SystemOutPrintln {
    public static void main(String[] args) {
        System.out.println(7);
        System.out.println(3.15);
        System.out.println("3+5="+8); //문자열+정수:정수가 자동형변환이 되어 문자열이 되다.
        System.out.println(3.15+"는 실수입니다."); //실수+문자열: 실수가 자동형변환되어 문자열이 된다.
        //문자열과 +가 만날 시 다른 항은 무조건 문자열로 자동형변환이 된다.
        //연산의 우선순위를 높이고 싶다면 ()소괄호를 사용하여 묶으면 연산 순위가 올라간다.
        System.out.println("8-7="+(8-7)); //8-7 괄호안 수식이 먼저 진행되고 형변환이 이루어져 println메소드로 전달된다.
        System.out.println("3+5"+"의 연산 결과는 8입니다.");
        System.out.println(3+5); //문자열+과는 다른 수식+
    }
}
