package com.green.day10.ch13;

public class MissionTwoDimenArraySolution {
    //절차지향적 해결
    public static void main(String[] args) {
        int[][] score={
               //국어, 영어, 수학, 사회
                {100,90,80,60}, //영수
                {90,90,80,50}, //상철
                {80,70,60,40}, //광수
                {100,50,70,70} //기영
        };
        String[] names = {"영수", "상철", "광수", "기영"};
        int[] namesScore = new int[names.length]; //사람 수만큼의 1차원 배열을 새로 정의함

        String[] subjects = {"국어", "영어", "수학", "사회"};
        int[] subjectsScore = new int[subjects.length];  //과목 수만큼의 1차원 배열을 새로 정의함.

        //각 이름별, 과목별 합계값
        //원래는 나눠서 for문 작성하는게 좋음.
        for(int i=0; i<score.length; i++) {
            for(int i2=0; i2<score[i].length; i2++) {
                namesScore[i] += score[i][i2]; //이름별 합계, 열 먼저 더함
                subjectsScore[i2] += score[i][i2]; //과목별, 행 끼리 더함
            }
        }

        int totalScore = 0;
        //학생 별 합계점수, 평균점수 출력
        for(int i=0; i<names.length; i++) {
            totalScore += namesScore[i];
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , names[i], namesScore[i], (float)namesScore[i] / subjects.length); //과목별로 나눠야하므로 subjects.length
        }

        //과목별 합계점수, 평균점수
        for(int i=0; i<subjectsScore.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , subjects[i], subjectsScore[i], (float)subjectsScore[i] / names.length); //학생 수로 나눠야하므로 names.length
        }
        System.out.printf("학급: 합계점수: %d, 평균점수: %.1f\n"
                , totalScore, (float)totalScore / (names.length * subjects.length));

        /*
            영수: 합계점수, 평균점수
            상철: 합계점수, 평균점수
            광수: 합계점수, 평균점수
            국어: 합계점수, 평균점수
            영어: 합계점수, 평균점수
            수학: 합계점수, 평균점수
            학급: 합계점수, 평균점수
         */
    }
}
