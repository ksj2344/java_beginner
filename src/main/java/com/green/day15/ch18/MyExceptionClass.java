package com.green.day15.ch18;

import com.green.personal.Hypen;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이 입력: ");
        try {
            int age= readAge();
            System.out.printf("입력된 나이: %d\n",age);
        } catch (ReadAgeException e) {
            System.out.println(e.getMessage());
        }
        Hypen.end();
    }
    public static int readAge() throws ReadAgeException{
        Scanner scan = new Scanner(System.in);
        int age=scan.nextInt();
        if(age<0){
            scan.close();  //throw시 scan 종료
            throw new ReadAgeException();
            //ReadAgeException는 Throwable(을 상속받은 Exception)을 상속받았음. Throwable을 상속받았다면 그걸로 대체 가능함
        }
        Hypen.line("if문 이후"); //if 예외처리를 거치지 않으면 출력됨
        scan.close();
        return age;
    }
}

class ReadAgeException extends Exception {
    ReadAgeException(){
        super("유효하지 않은 나이가 입력되었습니다."); //직속부모 생성자 호출
    }
}
