package com.green.day07.ch10;

import java.io.PrintStream;

public class SystemOutPrintln {
    public static void main(String[] args) {
        System.out.println();

        PrintStream out = System.out;     //System에 있는 out(주소값)을 PrintStream out에 복사한다.
        out.println();  //PrintStream out은 System.out과 같으니 System.out.println()으로 적을 수 있다.
        //System: 클래스
        //out: static 상수 멤버필드, 객체화된 PrintStream의 주소값이 저장이 된다.
        //println(): 메소드
        // PrintStream이라는 class를 기반으로 한 필드의 주소값이 System이라는 class안에 있는 참조변수 out에 저장되어 있고,
        // 참조변수 out을 통해 PrintStream에 있는 println 메소드를 불러온 것.

        /*
        PrintStream은 println(int i), println(char c), println(String r)등의 메소드를 가지고 있고
        이것을 오버로딩이라고 한다.
        만약 오버로딩이 없다면
        printlnInt(int i), printlnInt(char c) 이런식으로 메소드를 만들어야한다.
         */

        /*
        System.abc.kkk().ggg 이라는 코드를 쳤다고 가정!
        System: 클래스
        abc: 참조변수, 멤버필드
        kkk(): abc가 가리키고 있는 객체의 메소드, 리턴타입은 참조
        ggg: kkk()메소드가 리턴하는 객체의 멤버필드, 일반변수인지 참조변수인지는 알 수 없음.

        ※ ★☆★ 뒤에 .이 붙는다면 참조 타입이다.★☆★

        System.abc의 결과물을 "A"로 지칭할 때   A=System.abc;
        A.kkk().ggg
        A.kkk()의 결과물을 "B"로 지칭할 때     B=A.kkk();
        B.ggg

        그러니까 결과물이 저장된 주소값을 표하는 참조변수인 것
        */
    }
}
