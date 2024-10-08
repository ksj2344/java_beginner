package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {
        int score =(int)(Math.random()*101.0); //Math.random은 double의 값이고 101이 double로 형변환이 되어 곱해진 후 int로 다시 형변환 된다.
        // 따라서 곱하는 값을 double로 바꿔주면 형변환 리소스를 줄일 수 있다.
        System.out.printf("score:%d\n",score);

        if(score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
