package com.green.day08.ch13;

public class ArrayInstance2 {
    public static void main(String[] args) {
        Box[] arr= new Box[5]; //클래스 타입의 배열을 정의할 수 있다.
        //이 배열에는 박스라는 객체의 주소값만 저장할 수 있다.
        //객체 안에 객체 안에 객체 저장이 가능
        Box b1=new Box("안녕");
        System.out.println(b1);
        System.out.println(b1.toString());

        arr[0]=b1;
        arr[1]=new Box("하세요");
        arr[2]=new Box("반갑습니다.");

        System.out.println(arr[0]); //원래는 주소값(정확히는 해시코드) 출력할거 toString메소드로 conts 문자열 출력함
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

class Box{
    private String conts;

    Box(String conts){
        this.conts = conts;
    }

    //원래 main메소드에서 b1을 출력했을때 해시코드(!=주소값)가 찍혀야함.
    //아래의 메소드가 b1 객체의 값(문자열)을 반환해줌. 자세한건 상속배울때
    //이걸 오버라이딩(덮어쓰기)이라고 함. 부모가 갖고있는 값을 새롭게 정의하다.
    public String toString(){
        return conts;
    }
    //모든 클래스는 무보건 Object를 상속받는다.
}
