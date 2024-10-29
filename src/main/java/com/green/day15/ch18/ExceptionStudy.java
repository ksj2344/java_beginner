package com.green.day15.ch18;

public class ExceptionStudy {
    public static void main(String[] args){
        String str1="123";
        int intVal1=myParseInt(str1);
        System.out.println("intVal1: "+intVal1);

        String str2="12a3";
        //문제가 발생하면 예외 터트리지 않고 0을 리턴하는 메소드를 만들고 싶다.
        int intVal2=myParseInt(str2);
        System.out.println("intVal2: "+intVal2);
    }


    //myParseInt 정보
    //객체화를 하지 않았기 때문에 static
    //.을 붙이지 않았기에 같은 class안의 메소드
    //파라미터 타입은 str1을 따라서 String
    //반환 타입은 int, int intVal1에 저장되니까.
    public static int myParseInt(String str){
        try{
            return Integer.parseInt(str); //문자열을 정수로변환하는 메소드
        } catch (Exception e){
            return 0; //리턴을 못마주칠수도 있기 때문에 없다면 error. catch문 바깥에 써도 됨.
        }
    }
}
