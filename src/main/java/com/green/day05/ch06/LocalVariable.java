package com.green.day05.ch06;

//지역변수
public class LocalVariable {
    static int aaa=11; //전역변수

    /*
        scope(스코프): 변수가 살아있는 범위=변수의 접근 가능 영역=변수가 소멸되지 않고 존재할 수 있는 영역

        대전제!! ☆★선언된 변수에서 나를 감싸고 있고 가장 가까이 있는 {}안에서만 살아있다.
        (선언된 이후로)
     */
    public static void sum(int n1){
        int num1 = 11; //main메소드에서 사용한 명이지만 main메소드 중괄호를 벗어날시 main의 num1은 죽기 때문에
        // sum메소드에서 num1의 변수를 선언할 수 있다.
    }

    public static void main(String[] args) {
        boolean ste = true;
        int num1=11;

        if(ste){
            // int num1=22;  //같은 이름의 변수를 두번 이상 선언하는건 불가능하다.
            int num2=22;
            num1++;
            System.out.println(num1);
            System.out.println(num2); //여기서는 num2가 살아있지만
        }
        // System.out.println(num2); //여기서는 num2를 쓸 수 없다. num2의 스코프를 벗어났기 때문.

        for(int i=0;i<10;i++){
        }
        // System.out.println(i);  //i의 스코프는 for문 바깥에서 사라진다.
        // for문 초기화 공간에서 생성된 변수는 for문 안에서만 사용 가능하다.
        // 스코프는 좁을수록 버그 확률이 줄어든다.
    }
}
