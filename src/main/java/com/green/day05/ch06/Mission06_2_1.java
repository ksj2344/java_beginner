package com.green.day05.ch06;

public class Mission06_2_1 {
    public static void main(String[] args) {
        /*
            인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산하여 반환하는 메소드와
            원의 둘레를 계산하여 반환하는 메소드를 각각 정의하고,
            이 둘을 호출 하는 main메소드를 정의하자.
         */
        int radius=5;
        System.out.println("원의 넓이는 "+ Area(radius));
        System.out.println("원의 둘레는 "+ Circumference(radius));

    }
    static double Area(int radius){ //패러미터를 double로 둬도 문제없음 int>double 자동형변환 가능
        return radius*radius*3.14;
    }
    static double Circumference(int radius){
        return 2*radius*3.14;
    }
}
