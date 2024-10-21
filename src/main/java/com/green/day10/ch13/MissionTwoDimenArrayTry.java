package com.green.day10.ch13;

public class MissionTwoDimenArrayTry {
    public static void main(String[] args) {
        int[][] score={
               //국어, 영어, 수학, 사회
                {100,90,80}, //영수
                {90,90,80}, //상철
                {80,70,60} //광수
        };
        /*
            영수: 합계점수, 평균점수
            상철: 합계점수, 평균점수
            광수: 합계점수, 평균점수
            국어: 합계점수, 평균점수
            영어: 합계점수, 평균점수
            수학: 합계점수, 평균점수
            학급: 합계점수, 평균점수
         */

        for(int i=0; i<score.length; i++){
            int sum=0;
            double averege=0;
            for(int j=0; j<score[i].length; j++){
                sum+=score[i][j];

            }
            averege=(double)sum/score[i].length;
            System.out.printf("합계점수: %d, 평균점수: %.1f\n",sum,averege);
        }

        for(int i=0; i<score[0].length; i++){
            int sum=0;
            double averege=0;
            for(int j=0; j<score.length; j++){
                sum+=score[j][i];

            }
            averege=(double)sum/score[i].length;
            System.out.printf("합계점수: %d, 평균점수: %.1f\n",sum,averege);
        }

            int sum=0;
            double averege=0;
        for (int i=0; i<score.length; i++){
            for(int j=0; j<score.length; j++){
                sum+=score[i][j];
            }
        }
            averege=(double)sum/(score[0].length*score.length);
            System.out.printf("합계점수: %d, 평균점수: %.1f\n",sum,averege);


    }
}
