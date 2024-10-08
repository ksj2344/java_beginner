package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        // 키평균 남성 172, 여성 159 cm
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (F/M)");
        String gender = scan.next();
        System.out.print("키는 정수값으로 입력해 주세요.(cm)");
        int height = scan.nextInt();

        // if문으로 했을 때
        if (gender.equals("F")) {
            if (height > 159) {
                System.out.println("당신은 평균보다 큽니다.");
            } else if (height < 159) {
                System.out.println("당신은 평균보다 작습니다.");
            } else {
                System.out.println("평균입니다.");
            }
        } else if (gender.equals("M")) {
            if (height > 172) {
                System.out.println("당신은 평균보다 큽니다.");
            } else if (height < 172) {
                System.out.println("당신은 평균보다 작습니다.");
            } else {
                System.out.println("평균입니다.");
            }
        }
        //switch문으로 했을 때
        switch (gender){
            case "F":
                if(height > 159){System.out.println("당신은 평균보다 큽니다.");
                } else if (height<159) {System.out.println("당신은 평균보다 작습니다.");
                } else {System.out.println("평균입니다.");}
                break;
            case "M":
                if(height > 172){System.out.println("당신은 평균보다 큽니다.");
                } else if (height<172) {System.out.println("당신은 평균보다 작습니다.");
                } else {System.out.println("평균입니다.");}
                break;
            default:
                System.out.println("non");
        }




    }
}



