package com.green.day02.ch05;

public class SwitchBasic {
    public static void main(String[] args) {
        int n=3;
        switch(n) {

            case 1:
                System.out.println("Simple Java");
               break;                               // switch문은 해당하는 case를 만난 후 break를 마주칠때까지 계속 출력함.
                                                    // break가 없다면 해당되는 case부터 전부 실행 됨.
            case 2:
                System.out.println("Funny Java");
               break;
            case 3:
                System.out.println("Fantastic Java");
                break;
            default:                                //default는 case사이에 낄 수 있음
                System.out.println("The best programming Language");
        }
    }
}
