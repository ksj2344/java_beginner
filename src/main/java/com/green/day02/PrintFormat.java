package com.green.day02;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을 때 사용한다.

         */
        String name="홍길동";
        int age=22;
        float height=172.5f;
        char bloodType='O';
        boolean isMan=true;

        // 홍길동의 나이는 22살, 키는 172.5cm 혈액형은 O형. 그는 남자입니까? true
        System.out.println(name+"의 나이는 "+age+"살, 키는 "+height+"cm, 혈액형은 "+bloodType+"형입니다. 그는 남자입니까? "+isMan);
        System.out.printf("%s의 나이는 %d살, 키는 %fcm, 혈액형은 %c형입니다. 그는 남자입니까? %b\n", name, age, height, bloodType, isMan);
        System.out.printf("%s의 나이는 %s살, 키는 %scm, 혈액형은 %s형입니다. 그는 남자입니까? %s\n", name, age, height, bloodType, isMan);
        // 전부 %s를 써도 가능함. 대신 출력만이 있고 기능 자체는 없음
        System.out.printf("키는 %.2f\n",172.2844857);  //%.실수갯수f\n하면  실수자리 갯수만큼 출력할 수 있다. ☆★☆★ 많이 쓰이는 수식
        System.out.printf("키는 %012.1f\n",172.2844857);  // 총 칸은 12개, 소수 한칸(.뒤에 찍힌 숫자), 남은 빈칸은 0으로 채운다,
        System.out.printf("키는 %-12.1f\n",172.2844857);  // -는 왼쪽 정렬, 없는것은 오른쪽 정렬.
        System.out.printf("키는 %12.1f\n",172.2844857);  // -가 없는것은 오른쪽 정렬.
        // System.out.printf("키는 %-012.1f\n",172.2844857);  // 이런식으로는 안됨.


        int won = 230000000;
        System.out.printf("won:%d원\n", won);
        System.out.printf("won:%,d원\n", won); // 천단위콤마, 많이 쓰이는 수식 ☆★☆★
        System.out.printf("won:%12d원\n", won);
        System.out.printf("won:%-12d원\n", won);

        String result=String.format("%d",won);  // result 변수자리에 포메팅 함수로 값 지정. 위에서 사용한 포매팅 함수는 똑같이 사용할 수 있음.
        System.out.println("result:"+result);

        //원칙상으로는 비용문제로 서버(백엔드)보단 클라이언트(프론트)의 리소스를 사용하는게 맞음. 간혹 인력 불균형으로 인해 서버쪽에서 일을 하기도 함.
    }
}
