package com.green.personal;

import java.util.Arrays;
import java.time.LocalDate;
import java.util.Scanner;

public class CallRandom {
    final static int studenlan=20; //전체 학생 정원 수 지정
    private static final int[] students=new int[studenlan]; //배열 주소값 상수화
    private static int num; //몇번 호출하였는가를 저장할 변수
    private static LocalDate lastResetDate=LocalDate.now(); //마지막 초기화 날짜

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("학생번호를 확인하려면 Enter을 누르세요. 종료(q)");
        while (true) { //누를때마다 반복
            String input=scan.nextLine();
            if (input.equals("q")) {
                System.out.println("프로그램 종료.");
                break;
            }
            callRandom();
        }
        scan.close();
        System.out.println(Arrays.toString(students)); //호출된 학생 배열 확인
    }

    static void resetStudents() {
        Arrays.fill(students, 0); //배열을 0으로 초기화
        num=0; //호출횟수 초기화
        lastResetDate=LocalDate.now();
        System.out.println("학생배열 초기화");
    }


    static void callRandom() {
        if(!LocalDate.now().equals(lastResetDate)) {
            resetStudents(); //날짜가 바뀌면 배열 초기화
        }
        if (num >= studenlan) { //num수가 학생수를 넘긴 예외처리
            System.out.println("모든 학생이 호출되었습니다.");
            return;
        }
        int random;
        boolean unique;
        do {
            random = (int) (Math.random() * studenlan) + 1;
            unique = true;
            for (int i = 0; i < num; i++) { //꼭 다 돌필요 없이 추가된 곳까지 돌도록 수정
                if (students[i] == random) {
                    unique = false;  //중복발견
                    break;
                }
            }
        }while (!unique) ; //중복이 없을 때까지 반복
        students[num++] = random;
        System.out.println("호출된 학생 번호: " + random);

    }
}
