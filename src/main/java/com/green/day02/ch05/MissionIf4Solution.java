package com.green.day02.ch05;

public class MissionIf4Solution {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101.0);
        System.out.printf("score: %d\n", score);
        char grade= 'D';
        String opt= "0";
        int min;
        if (score >= 90) {
            grade= 'A';
            min =90;
            if (score >= (min+8)) {
                opt= "+";
            } else if (score<(min+4)) {
                opt= "-";
             }
        }else if(score >= 80){
            grade = 'B';
            min =80;
            if (score >= (min+8)) {
                opt= "+";
            } else if (score<(min+4)) {
                opt= "-";
            }
        }else if(score >= 70){
            grade = 'C';
            min =70;
            if (score >= (min+8)) {
                opt= "+";
            } else if (score<(min+4)) {
                opt= "-";
            }
        }else{
            opt="";
        }
        System.out.printf("grade: %s%s\n",grade,opt);

        }
        }