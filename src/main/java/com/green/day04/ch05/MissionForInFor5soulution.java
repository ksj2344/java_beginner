package com.green.day04.ch05;

public class MissionForInFor5soulution {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;

        for (int i = star; i >0; i--) {
            for(int z=1; z<=star; z++) {
                System.out.print(z<i ? "_" : "*");  //삼항연산자 이용한 풀이
            }
            System.out.println();
        }

    }
}
