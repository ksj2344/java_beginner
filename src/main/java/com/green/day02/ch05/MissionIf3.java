package com.green.day02.ch05;

import java.util.Scanner;  //scanner alt enter해서 나오는것. 직접 쳐서 해도 됨.
//원래 class를 쓰려면 같은 패키지에서 불러오듯 import를 써야함. 나머지는 생략이 되는것임.

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner까지 치면 alt+enter치라고 하는데 그걸 치면 ↑의 import가 작성됨
                                                 // 객체화 작업
        System.out.print("숫자를 하나 입력하세요>>");
        int input = scan.nextInt();    //scan.nextInt를 선언하면 선언된 변수에 숫자(정수)가 입력될 때까지 연산이 일시정지됨.
        //String 변수=scan.next 혹은 nextLine를 선언하여 문자열로도 할 수 있음.
        //nextLine이 오류가 많은 대신 스페이스바도 인식을 한다. scanner도 인식하지만 오류가 있음.
        System.out.printf("input: %d\n", input);
        System.out.println("--끝--");

        if (input % 2 == 0) {
            System.out.printf("%d는(은) 짝수입니다.", input);
        } else {
            System.out.printf("%d는(은) 홀수입니다.", input);
        }
        //위와 같은 역할을 하는 삼항 연산자.
        System.out.printf("%d는(은) %c수입니다.\n", input, (input % 2 == 0 ? '짝':'홀'));

        char result=(input % 2==0? '짝':'홀');
        System.out.printf("%d는(은) %c수입니다.\n", input, result);

        String result2=(input % 2==0? "짝":"홀");
        System.out.printf("%d는(은) %s수입니다.\n", input, result2);
    }
}