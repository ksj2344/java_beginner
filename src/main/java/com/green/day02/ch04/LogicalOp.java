package com.green.day02.ch04;

import com.green.day01.ch01.SystemOutPrintln;

public class LogicalOp {
    public static void main(String[] args){
        /*
            논리 연산사: &&, ||, !
         */

        int n1=11, n2=22;
        boolean result;
        result= (1<n1)&&(n1<100); //true, n1이 1초과 100미만인지  //false가 나올 가능성이 높은게 앞으로 가야 연산속도에 유리함
        System.out.printf("%d은 1초과 100미만인가? %b\n",n1,result);
        result=((n2%2)==0)||((n2%3)==0); //true, n2가 2 혹은 3의 배수인지? //true일 가능성 높은게 앞으로 가야 연산속도에 유리함
        System.out.printf("%d는 2의 배수 혹은 3의 배수인가? %b\n",n2,result);

        result=!(n1 != 0);
        System.out.printf("%d는 0인가? %b\n",n1,result);
        System.out.printf("%d는 0인가? %b\n",n1,n1==0);
    }
}
