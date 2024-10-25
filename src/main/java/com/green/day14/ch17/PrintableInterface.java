package com.green.day14.ch17;
/*
    인터페이스(Interface)의 용어적 설명: 이질적인 플랫폼 간에 통신을 할 수 있는 역할을 해주는 것.

    사람이 컴퓨터를 다룰 때 키보드, 마우스 사용(키보드, 마우스, 모니터를 인터페이스라고 부른다.)
    게임에서 화면에 나오는 버튼이랑 HP, MP 같은게 보이는 부분을 인터페이스라고 한다.

    JAVA의 인터페이스: 추상 메소드와 static 멤버필드만 가질 수 있는 존재다.
                       인터페이스의 이름은 보통 형용사(~~할 수 있는)
 */


public class PrintableInterface {
    public static void main(String[] args) {
        // Printable pi = new Printable(); //Printable은 객체화 안됨. interface인 얘도 추상클래스
        Printable p2=new PrintableImpl(); //Printable의 변수에 Printable 임플리먼트(구현) 객체화 가능! //부모타입이기 때문에.
        p2.print("dddd");
        System.out.println(p2.NUM);  //
        System.out.println(Printable.NUM); //static은 이렇게 쓰는게 맞음.
    }
}



//interface를 만들 때 생략하면 무조건 들어가는 키워드가 있다.
interface Printable {
    int NUM=0;
    void print(String doc);  //추상 메소드만 담을 수 있다.   //여기서 String doc은 파라미터부분
}
/*
interface Printable {
    public static int num=0;  //멤버필드 앞에는 public static final이 무조건 추가
    public abstract void print(String doc);  //메소드 앞에는 public abstract가 무조건 추가
}
 */

//interface는 객체화가 안되므로 멤버필드 선언시 무조건 초기화 해줘야함.<디폴트값 줘봣자 바꿀수 없으니깐..
//그런데 interface에 멤버필드 지정할 일이 잘 없긴함

//Impl 인터페이스 구현했단 뜻임. 다른제목 해도 되지만 알아보기 쉽다.
class PrintableImpl implements Printable {
    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}

