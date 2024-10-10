package com.green.day03.ch05;

public class BreakBasic {
    public static void main(String[] args) {
        int n = 1;
        boolean search = false;

        while(n<100){
            if((n%5)==0 && ((n%7)==0)){
                search = true;
                break;   //반복문 안에서 만나면 반복문을 즉시 빠져나온다. 따라서 BreakBasic70이 나오기 전에 35에서 n값이 그친다.
            }
            n++;
        }
        if(search){
            System.out.printf("찾는 정수: %d\n", n);
        }else {
            System.out.println("못 찾음");
        }
    }
}
