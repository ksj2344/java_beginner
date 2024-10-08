package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitchSolution {
    public static void main(String[] args) {
        // 키평균 남성 172, 여성 159 cm
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (F/M)");
        String gender = scan.next();
        System.out.print("키는 정수값으로 입력해 주세요.(cm)");
        int height = scan.nextInt();

        System.out.printf("성별: %s, 키: %d\n", gender, height);

        int standHeight =159;     //디폴트를 여성으로하여 남성이면 조건이 변경되도록 변수 지정
        switch (gender) {
            case "M":
                standHeight = 172;
        }
        if (height > standHeight) {
            System.out.println("당신은 평균보다 큽니다.");
        }else if (height < standHeight) {
            System.out.println("당신은 평균보다 작습니다.");
        }else {
            System.out.println("당신은 평균입니다.");
        }
    }
}



