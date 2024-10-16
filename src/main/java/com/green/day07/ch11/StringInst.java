package com.green.day07.ch11;

public class StringInst {
    public static void main(String[] args) {
        String str1= new String("Simple String");
        String str2= "The Best String";  //위의 형식(객체화) 생략된 형태. 완벽히 같진 않음. 그러나 보통 이렇게 쓴다.

        System.out.println(str1);
        System.out.println(str1.length()); //length()은 인스턴스 메소드
        System.out.println();

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny String");
    }

    public static void showString(String str){
        System.out.println(str);
        System.out.println(str.length());
    }
}


