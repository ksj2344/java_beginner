package com.green.day14.ch17;

public class PrinterDriver3 {
    public static void main(String[] args) {
        //자식타입이 부모객체 주소값 담은 경우! 형변환을 한다고 값이 들어가지 않는다.
     //  ColorPrintable cp = (ColorPrintable)new Prn204Drv();
     //  cp.printCMYK("ddd");
        //Prn204Drv는 printCMYK()를 모름!
        //Prn204Drv는 Printable을 implements한것이고 Printable은 ColorPrintable보다 부모타입이기 때문에 담을 수 없다.
        //Prn204Drv는 Printable를 구현한 것이고
        //ColorPrintable는 Printable를 상속 받은 것.
    }
}

//★☆ class가 class를 상속받을 때는 extends
//★☆ class가 interface를 상속받을 때는 implements
//★☆ interface가 interface를 상속받을 때는 extends
//★☆ interface는 class를 상속 받을 수 없다. 당연하지만 implements도 안됨.
interface ColorPrintable extends Printable {
    void printCMYK(String doc);
    //인터페이스는 추상메소드만 가질 수 있다.
}


//Prn9090rv 객체 주소값 담을 수 있는 타입: Printable, ColorPrintable, Prn9090rv
//Prn9090rv 타입으로 호출 할 수 있는 메소드: printCMYK, print
//Colorprintable 타입으로 호출 할 수 있는 메소드 또한: printCMYK, print
        //Prn9090rv가 ColorPrintable의 구현부(implements)기 때문에 어차피 객체화 할거면 ColorPrintable 변수=new Prn9090rv가 될거라서
//Printable 타입으로 호출 할 수 있는 메소드: print
class Prn9090rv implements ColorPrintable {
    @Override
    public void printCMYK(String doc) {  //ColorPrintable에서 받은 것
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {  //Printable에서 받은 것
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }
}


//빛의 3원소(RGB), 색의 4원소(CMYK) 인쇄를 위한 색상모드
//이미지포맷: jpg, jpeg, png <이미지 표현 압축방식