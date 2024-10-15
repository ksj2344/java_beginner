package com.green.day05.ch06;
//Parameter //매개변수  //줄여서 Param
public class Method2Param {
    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12, 12.5);  //메소드를 호출하다. call method
        /*
            제 나이는 12세 입니다.
            저의 키는 12.5cm입니다.
         */
        hiEveryone(13, myHeight);  //인자, argument

        byEveryone();
        // 다음에 뵙겠습니다.
        // 데이터를 메소드에 특별히 수신할 필요 없는 경우.

    }

    static void hiEveryone(int age, double height) { //파라미터의 갯수 제한은 없다.
        System.out.printf("제 나이는 %d입니다.\n저의 키는 %.1f입니다.\n",age,height);
    }
    static void byEveryone() {  //메소드를 정의하다. //인자를 받지 않는 메소드
        System.out.println("다음에 뵙겠습니다.");
    }
}
