package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40};

        //배열 안에서 가장 큰 숫자 리턴
        //제네릭 방식은 <파라미터,리턴타입>
        Function<Integer[], Integer> fn = integers -> { //메소드가 하나라 중괄호 생략은 못해도 람다식 쓸 수는 있음.
                int mVal=integers[0];
                for(int item:integers){
                    mVal=mVal<item? item:mVal;  //삼항식 이용하기.
                    //삼항식은 무조건 대입하기때문에 속도면에서 if가 유리하긴 하나 큰 차이X
                }
                return mVal;
        };

        int maxValue=fn.apply(arr);
        System.out.println("maxValue: "+maxValue);
    }
}
