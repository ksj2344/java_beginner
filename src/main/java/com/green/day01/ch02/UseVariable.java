package com.green.day01.ch02;

public class UseVariable {
    public static void main(String[] args){
        int num1;  //변수 선언, 더 정확한 표현: num1이라는 정수형의 변수명을 선언
        // int 이 변수에 들어갈 수 있는 데이터 타입 한정(정수)
        // num1 변수명(사용할 이름)
        num1=10; //'=' 대입연산자, 오른쪽 항에 있는 값을 복사하여 왼쪽 항에 준다.
                 // 왼쪽 항은 값을 저장할 수 있어야 한다.
        // 데이터를 주입할 때는 대입 연산자를 사용한다.
        /*
        변수를 사용하기 위해서는? 선언을 해야한다.
        선언을 할 때 데이터 타입을 명시한다. 해당 데이터 타입만 저장이 될 수 있도록 한다.
        다른 타입의 데이터는 저장 불가. typed 언어의 특징, 신뢰.
        <변수 사용 이유>
        0번째 이유는 데이터를 저장하기 위해서.
        여러 코드에서 사용할 때 참조 할 수 있도록 한다.
        값이 변경되었을 때 변수값만 수정을 하면 모두 수정이 가능하기 때문.
         */

        int num2 =20; //선언과 초기화를 동시에 할 수 있음
        int num3 = num1+num2;
        //int num3=10+20; //num1변수에 들어있는 값 10, num2변수에 들어있는 값 20
        //int num3=30;
        System.out.printf("num1: %d, num2: %d, num3: %d\n", num1, num2, num3);
        //첫번째 %d에 num1값이, 두번째 %d값에 num2값이 들어가는식. num3대신 정수값을 넣으면 그걸로 들어감.
    }
}