package com.green.day03.ch05;

public class CountinueBasic {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;

        while((n++)<100){
            if(((n%5)!=0) || ((n%7)!=0)){
                continue;     // 해당 조건에 부합되면 아래의 코드를 무시하고 반복문으로 돌아가는 코드!!
            }
            count++;                            //7과 5의 배수일 때 continue를 거치지 않고 도달 할 수 있음
            System.out.println("n: "+n);        //continue를 거치지 않고 도달 할 수 있음
        }
        System.out.println("count: "+count);

    }
}
