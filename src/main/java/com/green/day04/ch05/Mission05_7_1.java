package com.green.day04.ch05;

public class Mission05_7_1 {
    public static void main(String[] args) {
        /*
            구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되
            2단은 2x2까지
            4단은 4x4까지
                ...
            8단은 8x8까지 출력.
         */

        for(int dan=2;dan<=8; dan+=2){
            for(int e=1;e<=dan;e++){          //변수 이름을 바꾸고 싶다면 우클릭 리팩토링으로 변수명 변경이 가능하다.
                System.out.printf("%d x %d= %d \n", dan, e, dan*e);
            }
            System.out.println();
        }

    }
}
