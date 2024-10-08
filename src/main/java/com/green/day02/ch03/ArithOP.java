package com.green.day02.ch03;

public class ArithOP {
    public static void main(String[] args) {
        int n1 =7;
        int n2 =3;

        System.out.printf("%d + %d=%d\n",n1,n2,(n1+n2));
        System.out.printf("%d - %d=%d\n",n1,n2,(n1-n2));
        System.out.printf("%d * %d=%d\n",n1,n2,(n1*n2));
        System.out.printf("%d / %d=%d\n",n1,n2,(n1/n2));
        System.out.printf("%d %% %d=%d\n",n1,n2,(n1%n2));  //문자열 안의 %는 단일로 쓰면 포메팅으로 인식하므로 두번써야함

        // %(모드)는 홀짝을 구할 때도 쓰고, 배수 구할 때도 쓴다.
        // 2로 나눴을 때 나머지값이 0이면 짝수, 1이면 홀수.
        // n의 값으로 나눴을 때 모드값이 0면 n의 배수이다.
    }
}
