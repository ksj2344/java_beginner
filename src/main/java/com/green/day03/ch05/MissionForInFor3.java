package com.green.day03.ch05;

public class MissionForInFor3 {
    public static void main(String[] args) {
        int star=(int)(Math.random()*6.0)+3; //3~8사이의 랜덤 숫자

        for(int i=1;i<=star;i++){
            for(int n=1;n<=star;n++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        int len =star*star;              // 별의 총 갯수를 뜻하는 변수, 반복문 진입 전 고정값을 두는 것이 연산 속도에 유리하다.
        for(int i=1;i<=len;i++) {
           System.out.print("*");
           if(i%star==0){               // *의 개수가 star의 배수마다 개행이 요구되므로 if문으로 개행 실행
               System.out.println();
           }
        }

    }
}
