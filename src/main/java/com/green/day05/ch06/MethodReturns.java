package com.green.day05.ch06;

public class MethodReturns {
    public static void main(String[] args) {
        int result=adder(4,5);

        System.out.printf("%d+%d=%d\n",4,5,result);
        System.out.printf("%.1fx%.1f=%.2f\n",3.5,3.5,square(3.5));  //3.5는 뒤에 뭔가 안 적는 이상(3.5f) double타입이다.
        //아래 리턴 메소드에서 값이 반환되면서 float->double 자동형변환이 되지 않으므로 아래 메소드에선 double을 쓰는게 좋다.
        // 굳이 하려거든 명시적 형변환 사용
    }
    static int adder(int n1, int n2) {
        return n1+n2;
    }

    static double square(double num) {
        return num*num;
    }
}
