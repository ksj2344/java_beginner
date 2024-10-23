package com.green.personal;

import java.util.Arrays;
import java.util.Random;
import java.time.LocalDate;

public class CallRandom {
    private static final int studentlan=20;
    private static int[] students;
    private static LocalDate lastCalledDate;
    public static void main(String[] args) {
        lastCalledDate = LocalDate.now();
        students= new int [studentlan];
        Arrays.fill(students, -1);
        callStudent();

    }
    public static void callStudent() {
        LocalDate today = LocalDate.now(); //오늘 날짜와 마지막 호출 날짜를 비교
        if(!today.equals(lastCalledDate)) {
            students = new int [studentlan]; //날짜가 바뀌었다면 배열 초기화
            Arrays.fill(students, -1);
            lastCalledDate = today; //오늘 날짜로 업데이트
        }
        Random random = new Random();
        int n=0;

        while(n<studentlan) {
            int randomStudent = random.nextInt(studentlan)+1;
            boolean alreadyCalled = false;
            for(int item:students) {
                if(item==randomStudent) {
                    alreadyCalled = true;
                    break;
                }
            }//중복이 아니면 출력하고 배열에 추가
            if(!alreadyCalled) {
                System.out.println(randomStudent);
                students[n++] = randomStudent;
            }
        }
    }
}
