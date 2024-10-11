package com.green.day04.ch06;

public class MethodArithOp {  //class아래에 메소드 개수 제한은 없음
    public static void main(String[] args) {
        int n1=7;
        int n2=3;
        subtract(n1,n2);
        subtract(10,2);
        multiply(4,5);
        float r= divide(10,3);
        System.out.println("r:"+r);
        int r2=modulo(10,4);
        System.out.println("r2:"+r2);
    }
    static void multiply(int n1, int n2) {
        System.out.printf("%d x %d=%d\n",n1,n2,(n1*n2));
    }
    static void subtract(int n1, int n2) {
        System.out.printf("%d-%d=%d\n",n1,n2,(n1-n2));
    }
    static float divide(int n1, int n2){ //divide값이 정수이기때문에 int로 지정
        return (float)n1/n2;  //r의 값이 float이기 때문에 명시형변환을 해줘야한다.
    }
    static int modulo(int n1, int n2){
        return n1%n2;
    }
}
