package com.green.day02.ch05;

public class MissionIf4ITryed {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        if (score >= 90) {
            char grade = 'A';
            int min =90;
            if (score >= (min+8)) {
                System.out.printf("%c+\n", grade);
            } else if (score >= (min+4)) {
                System.out.printf("%c0\n", grade);
           } else if (score >= min) {
                System.out.printf(("%c-\n"), grade);
             }
        }else if(score >= 80){
            char grade = 'B';
            int min =80;
            if (score >= (min+8)) {
                System.out.printf("%c+\n", grade);
            } else if (score >= (min+4)) {
                System.out.printf("%c0\n", grade);
            } else if (score >= min) {
                System.out.printf(("%c-\n"), grade);
            }
        }else if(score >= 70){
            char grade = 'C';
            int min =70;
            if (score >= (min+8)) {
                System.out.printf("%c+\n", grade);
            } else if (score >= (min+4)) {
                System.out.printf("%c0\n", grade);
            } else if (score >= min) {
                System.out.printf(("%c-\n"), grade);
            }
        }else {System.out.println("D");}

        }
        }