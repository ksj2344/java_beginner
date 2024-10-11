package com.green.day04.ch05;

public class MissionForInFor5tryed {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;

        for (int i = 1; i <= star; i++) {
            for (int n = 1; n <= star - i; n++) {    //for(int n=star; n>i; n--)으로 대체 가능
                System.out.print("_");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("================");


        String comma = "_";     //if문을 활용하라기에 삼항식 말고 저번 if를 응용해서 풀어본 것
        int len = star * star;
        int a = 1;
        for (int i = 1; i <= len; i++) {
            if (((i%star) >= star-a)||(i % star == 0)) {
                comma = "*";
                System.out.print(comma);
                comma = "_";
            } else { System.out.print(comma);}

            if (i % star == 0) {
                a++;
                System.out.println();
            }
        }
    }
}
