package com.green.day03.ch05;

public class CountinueBasic2 {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;

        while((n++)<100){
            if(((n%5)==0) && ((n%7)==0)){
                count++;
                System.out.println("n: "+n);
            }
            continue; //원래 반목문 아래에는 컨티뉴가 있으나 코드에선 있어봤자 쓸모없음
        }
        System.out.println("count: "+count);

    }
}
