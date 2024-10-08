package com.green.day02;

public class Mission1 {
    public static void main(String[] args) {
        int n1= 10;
        int n2= 3;

        System.out.println((double)(n1/n2));
        // int나누기 int 결과 타입도 int기 때문에 실수 값이 날아간다.
        // 먼저 실수가 날아간 후에 결과값이 double에 저장되어 실수형으로 바뀌므로 결과는 3.0이 된다.
        System.out.println(n1/(double)n2);
        //n1이든 n2든 명시적형변환을 하나만 시켜주면 자동형변환이 이루어져 double/double이 된다.

    }
}
