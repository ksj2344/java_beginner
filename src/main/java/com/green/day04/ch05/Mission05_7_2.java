package com.green.day04.ch05;

public class Mission05_7_2 {
    public static void main(String[] args) {
    /*
        다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하기.

          A B
        + B A
        ------
         9 9
     */

        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if((10*i+j)+(10*j+i)==99){
                    System.out.printf("%d, %d",i,j);
                    System.out.println();
                }
            }
        }

    }

}
