package com.green.day10.ch13;

public class MissionTwoDimenArrayToObject {
    //객체지향적으로 해결해보자!
    public static void main(String[] args) {
        Student[] arr=new Student[3];
        arr[0]=new Student("영수",100,90,80);
        arr[1]=new Student("상철",90,90,80);
        arr[2]=new Student("광수",80,70,60);

        //영수의 합계점수 알기
        System.out.println("영수의 합계: "+(arr[0].getKorScore()+arr[0].getEngScore()+arr[0].getMathScore()));
        //그러나 굳이 이렇게 하지 않는다!
        System.out.println("영수의 합계: "+arr[0].getAllScore());
        //이렇게 한다.
        System.out.println("-----------");

        printStudentsInfo(arr);
        printTotalKorScores(arr); // 국어-합계점수?, 평균점수-?
        //같은 class에 있는 메소드, static, return없으므로 void, 파라미터 타입 Student[]
        printTotalEngScores(arr);
        printTotalMathScores(arr);
        printTotalSubjectScore(arr); //학급- 합계:?, 평균-?

    }
    public static void printStudentsInfo(Student[] students) {
        for(Student item:students){
            System.out.println(item);
        }
    }
//    public static void printTotalKorScores(Student[] students) {
//        int sum=0;
//        for(Student item:students){
//            sum+=item.getKorScore();
//        }
//        System.out.printf("국어- 합계점수: %d, 평균점수: %.1f\n", sum, (double)sum/students.length);
//    }
    public static void printTotalSubjectScore(Student[] students) {
        int totalSubjectScore = 0;
        for(Student item:students){
             //int totalScore=item.getKorScore()+item.getEngScore()+item.getMathScore();
             int totalScore=item.getAllScore();
             totalSubjectScore+=totalScore;
        }
        float avgtotalScore=(float)totalSubjectScore/(students.length*Student.SUBJECT_CNT);
        System.out.printf("총합- 합계점수: %d, 평균점수: %.1f\n", totalSubjectScore, avgtotalScore);
    }

    public static void printTotalKorScores(Student[] students) {
        int totalKorScore = 0;
        for (Student item : students) {
            totalKorScore += item.getKorScore();
        }
        float avgKorScore = (float) totalKorScore / students.length;
        System.out.printf("국어- 합계점수: %d, 평균점수: %.1f\n", totalKorScore, avgKorScore);
    }
    public static void printTotalEngScores(Student[] students) {
        int totalEngScore=0;
        for(Student item:students){
            totalEngScore+=item.getEngScore();
        }
        float avgEngScore=(float)totalEngScore/students.length;
        System.out.printf("국어- 합계점수: %d, 평균점수: %.1f\n", totalEngScore, avgEngScore);
    }
    public static void printTotalMathScores(Student[] students) {
        int totalMathScore=0;
        for(Student item:students){
            totalMathScore+=item.getMathScore();
        }
        float avgMathScore=(float)totalMathScore/students.length;
        System.out.printf("국어- 합계점수: %d, 평균점수: %.1f\n", totalMathScore, avgMathScore);
    }

}

class Student{ //이뮤터블 객체
    public static final int SUBJECT_CNT=3; //과목수, 변하지 않을 수라면 상수지정해서 쓰는게 좋음.
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;
    //이렇게 하면 객체 아래에 데이터를 묶어 저장 가능!

    Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }
    String getName() {
        return name;
    }
    int getKorScore() {
        return korScore;
    }
    int getEngScore() {
        return engScore;
    }
    int getMathScore() {
        return mathScore;
    }

    public int getAllScore(){ //기능 추가를 하여 사용한다.
        return korScore + engScore + mathScore;
    }

    @Override //toString은 꼭 public 붙여야함
    public String toString() {
        int totalScore = getAllScore();
        return String.format("%s - 국어: %d, 영어: %d, 수학: %d | 합계점수: %d, 평균점수 %.1f"
                , name, korScore, engScore, mathScore, totalScore, (float)totalScore / SUBJECT_CNT);
    }
}
