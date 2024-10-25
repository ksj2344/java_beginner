package com.green.day14.ch17;

import com.green.personal.Hypen;
import com.sun.tools.jconsole.JConsoleContext;

public class MakerInterface {
    public static void main(String[] args) {
        //Report0~3까지 객체화
        Report0 r0=new Report0("Simple Funny News~");
        Report1 r1=new Report1();
        Report2 r2=new Report2();
        Report3 r3=new Report3();

        //Printer 클래스 아래에 있는 printContents 메소드 호출하려면?
        //호출할 때 r0의 주소값을 보내주세요.
        Printer printer=new Printer();
        printer.printContents(r0);  //멤버필드를 return하였다.
        printer.printContents(r1);  //String 문자열을 return하였다.
        printer.printContents(r2);  //printContents에서 이미 getContents() 호출중이라 주소만 보내면 된다.
        printer.printContents(r3);

    }
}


//interface는 추상메소드만 가질 수 있다. 객체화가 되어있지 않은 메소드들의 집합체
//그래서 Object를 상속받을 수 없다<얘는 객체화 된 메소드들을 집합체나 마찬가지라서 super();하면 interface가 뻑남.
//뭣보다 interface는 class를 상속받을 수 없기도 하고.
interface Printable2 {
    String getContents();
}


interface Upper{}
interface Lower{}

class Report0 extends Object implements Printable2, Upper { //implement하는 동시에 상속받기도 가능하다.
    private String contents;
    Report0(String contents) {
        this.contents = contents;
    }
    @Override
    public String getContents() {
        return contents;
    }
}

class Report1 implements Printable2, Lower {
    @Override
    public String getContents() {
        return "Simple Funny News~";
    }

    // public int getContents() {return 0;};
    // 이렇게 할 수 없다. 왜? Printable2에서 getContents()의 리턴타입은 String으로 정해져있음.
}
class Report2 implements Printable2, Upper {
    @Override
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Report3 implements Printable2, Upper, Lower {
    @Override
    public String getContents() {
        return "Simple Funny News~";
    }
}

//class 앞에 static 못붙이는데 static 붙여놓고 왜 안되지... 하지말자
class Printer{
    public void printContents(Printable2 doc) {
        if(doc instanceof Upper) {
            System.out.println(doc.getContents().toUpperCase()); //toUpperCase() 대문자변환 메소드
        }else if(doc instanceof Lower) {
            System.out.println(doc.getContents().toLowerCase()); //toLowerCase() 소문자변환 메소드
        }else{
            System.out.println(doc.getContents());
        }
    }
}