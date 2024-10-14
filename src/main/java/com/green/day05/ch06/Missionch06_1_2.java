package com.green.day05.ch06;

public class Missionch06_1_2 {
    /*
        정수 둘을 인자로 전달 받아서, 두 수 의 '차의 절대값'을 계산하여 출력하는 메소드와
        이 메소드를 호출하는 main 메소드를 정의해보자.
        단, 메소드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되고 출력되어야 한다.
     */
    public static void main(String[] args){
        result(-56,2);
    }
    static void result(int i, int j){
        System.out.printf("%d와 %d의 차이는: ",i,j);
        System.out.println(i>j? i-j:j-i);
    }

}
