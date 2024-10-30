package com.green.day15.ch18;

public class ExceptionStudy {
    public static void main(String[] args){
        String str1="123";
        int intVal1=myParseInt(str1);
        System.out.println("intVal1: "+intVal1);

        String str2="12a3";
        //문제가 발생하면 에러 발생하지 않고 0을 리턴하는 메소드를 만들고 싶다. <-try-catch를 쓴다.
        int intVal2=myParseInt(str2);
        System.out.println("intVal2: "+intVal2);
    }

    //문자열 정수를 int타입으로 바꾸는 메소드 myParseInt
    public static int myParseInt(String str){
        try{
            return Integer.parseInt(str); //문자열을 정수로변환하는 메소드
        } catch (Exception e){
            return 0; //리턴을 못마주칠수도 있기 때문에 없다면 error. catch문 바깥에 써도 됨.
        }
    }
}
