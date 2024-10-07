package com.green.day01.ch02;

public class StudyDataType {
    public static void main(String[] args) {
        /*
            자료형: 정수형, 실수형, 불린형, 문자형 >>primitive type (기본 타입)

            특징: 타입 이름이 소문자로 되어있고, 총 8개
            8개의 기본 타입을 제외한 나머지는 reference type(참조 타입)이다.

            *타입명 옆의 (숫자)는 바이트(크기)를 의미
            #정수형 - byte(1), short(2), int(4), long(8)
            #실수형 - float(4), double(8)
            #불린형 - boolean(1)
            #문자형 - char(2)

            자동형변환 방향: byte > short(char) > int > long > float > double
         */

        byte var1 = 127;
        short var2 = 300;
        int var3 = var1+var2;  //같은 정수 타입끼리의 자동 형변환

        int var4 = 100;
        long var5=var4+var4; //int 타입이 long으로 들어가는건 문제되지 않음(자동 형변환)
        //int ver6=var5; 반대방향은 자동형변환이 되지 않음.
        int ver6=(int)var5; //강제형변환은 가능
    }
}
