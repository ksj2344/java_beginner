package com.green.day05.ch06;
//stack 메모리 형식을 이용한 재귀호출
//재귀호출 : 내가 나를 호출하다.
public class ReculFatorial {
    public static void main(String[] args) {
        //5! >> 5 x 4 x 3 x 2 x 1
        System.out.println(factorial(6));
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(3));
        System.out.println(factorial(2));
    }

    static int factorial(int n) {
        if(n==1){               // 재귀호출을 하려면 언젠가 호출이 끝날수는 있게 해야한다.
            return 1;
        } else {
            return n*factorial(n-1);  //재귀호출
            // f(1)=1
            // f(2)=2*f(1)=2*1
            // f(3)=3*f(2)=3*2*f(1)=3*2*1
            // f(4)=4*f(3)=4*3*f(2)=4*3*2*f(1)=4*3*2*1
        }
    }
    //재귀호출은 디렉토리 삭제할 때 쓰인다.
}
