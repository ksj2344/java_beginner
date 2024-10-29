package com.green.day15.ch18;

import com.green.personal.Hypen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();        //에러는 n1에서도 n2에서도 System.에서도 발생할 수 있음.
            System.out.print("a/b ... b?"); //먼저 에러가 발생하면 아래부분 스킵하고 바로 catch실행
            int n2 = scan.nextInt();
            System.out.printf("%d/%d=%d\n",n1,n2,n1/n2);        //만약 system.out.print가 try-catch문 바깥에 있다면 어떨까?
        }catch(InputMismatchException e){//문자열오류예외처리      //스코프 바깥이라 오류발생!
            e.printStackTrace();                                //스코프를 늘려줄 필요가 있으므로 try-catch 위에 int n1=0 정의가 필요하다.
            System.out.println(e.getMessage());                 // 혹은 지금처럼 필요한 스코프 내로 몰아넣어주거나.
        }catch(ArithmeticException e){ //혹시 n2가 0이라면 System.out.에서 발생하는 에러 (수학적) 예외처리
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        Hypen.line();

        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... b?");
            int n2 = scan.nextInt();
            System.out.printf("%d/%d=%d\n",n1,n2,n1/n2);
        }catch(InputMismatchException|ArithmeticException e){ //문자열 오류처리와 수학적 오류처리가 같다면 이런식으로 같이 할 수 있음
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        Hypen.line();

        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... b?");
            int n2 = scan.nextInt();
            System.out.printf("%d/%d=%d\n",n1,n2,n1/n2);
        }catch(Exception e){ //모든 예외처리를 다 잡는다. 모든 exception의 부모 class  //Throwable: error와 exception의 부모, 얘써도 상관없긴함.
            //Exception은 모든 예외처리를 다 잡기 때문에 catch문의 가장 아래에 작성하도록 한다.
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
