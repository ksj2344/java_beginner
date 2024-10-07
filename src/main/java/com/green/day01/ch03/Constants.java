package com.green.day01.ch03;

public class Constants {
    public static void main(String[] args) {
        final int MAX_SIZE=100;  //대문자_대문자 스네이크 케이스 기법
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;

        CONST_ASSIGNED = 12;
        // CONST_ASSIGNED = 15;  는 이미 상수값으로 지정이 되었으므로 후에 선언을 해도 바뀌지 않음.

        System.out.printf("상수1: %d\n",MAX_SIZE);
        System.out.printf("상수2: %c\n",CONST_CHAR);
        System.out.printf("상수3: %d\n",CONST_ASSIGNED);

        
    }
}
