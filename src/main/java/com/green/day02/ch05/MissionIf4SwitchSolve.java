package com.green.day02.ch05;

public class MissionIf4SwitchSolve {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        String grade = "D", opt = "";
        int gradeScore = score / 10; //case에 들어갈 숫자 구하는중

        switch (gradeScore) {
            case 9, 10: grade = "A"; break;
            case 8: grade = "B"; break;
            case 7: grade = "C"; break;
        }

        int optScore = score % 10; //1의 자리 수 구하는 중

        if (gradeScore > 6) {
            if (optScore >= 8 || score ==100) {
                opt = "+";
            } else if (optScore >= 4) {
                opt = "0";
            } else {
                opt = "-";
            }
        }
    System.out.printf("grade: %s%s\n",grade,opt);
    }
}