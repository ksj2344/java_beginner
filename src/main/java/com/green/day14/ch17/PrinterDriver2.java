package com.green.day14.ch17;

import com.green.personal.Hypen;

public class PrinterDriver2 {
    public static void main(String[] args) {
        Printable prn1=new Prn204Drv();  //다향성
        Printable prn2=new Prn731Drv();

        String myDoc="This is a report about...";
        prn1.print(myDoc);
        Hypen.line();
        prn2.print(myDoc);

        //Prn204=(Prn204Drv)prn2;  //캐스팅에러. 형제관계라 형변환 불가

    }
}

class Prn204Drv implements Printable {
    @Override
    public void print(String doc) { //추상 메서드 구현. 추상 클래스 단계에서 (String doc)의 파라미터를 지정했으므로 유지됨.
        System.out.println("FROM MD-204 printer");
        System.out.println(doc);  //인자를 받아와서 출력하는 부분.
    }
}

class Prn731Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("FROM MD-731 printer");
        System.out.println(doc); //인자를 받아와서 출력하는 부분.
    }
}
