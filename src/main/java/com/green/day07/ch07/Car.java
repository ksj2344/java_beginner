package com.green.day07.ch07;

public class Car {
    private String color;    //여기에 default값을 지정해도 되지만!(명시적 방법이라고 함) 정리상 기본 생성자에 보통 넣어줌
    private String gearType; //auto, manual
    private int door;

    public Car() {  //기본 생성자
//        color="white";
//        gearType="auto";
//        door=4;            //이거랑 아래가 같은 소리임
        this("white","auto",4);  //하드코딩(값이 지정된채로 객체생성) 되었다. 기본생성자로 객체 생성시 항상 같은 값이다.
        //생성자에서도 매소드나 생성자를 호출 가능하다. this를 통해 아래에 있는 생성자를 호출하여 default값을 지정해 주었다.

        /*
            this 사용법 2가지
            1. this.
                : 멤버필드, 멤버메소드 호출할 때. this. 생략 가능할 때가 있다.
            2. this()
                : 생성자에서 다른 생성자를 호출할 때. 그러니까 생성자 호출할 때 쓴다.
                  메소드에선 사용할 수 없다. 생성자는 오로지!! 객체 생성할 때만 호출할 수 있기 때문이다.
         */
    }

    public Car(String color, String gearType, int door) { //파라미터가 있는 생성자
        this.color = color; //매개변수명이 멤버필드명과 달랐다면 this.을 생략할 수 있다.
        this.gearType = gearType;
        this.door = door;
    }
    public Car(String gearType, int door) {
        this("white",gearType,door);
    }

    public void introduce(){
        // this("dd", "ddd", 12);
        // introduce메소드가 호출이 된다는 말은 이미 객체생성이 끝난 이후다.
        // 생성자는 객체 생성시에만 호출할 수 있기 때문에 객체생성 이후에는 호출 불가다.
        System.out.printf("%s 컬러의 %s 기어를 가진 %d개의 문짝이 있는 자동차\n", color, gearType, door);
    }
}


class CarTest{
    public static void main(String[] args) {
        //white 컬러의 auto 기어를 가진 4개의 문짝이 있는 자동차
        Car car = new Car();  //기본 생성자
        car.introduce();

        //red 컬러의 manual 기어를 가진 5개의 문짝이 있는 자동차
        Car car2 = new Car("red","manual",5); //파라미터가 있는 생성자
        car2.introduce();

        Car c4 = new Car("auto",6);
        c4.introduce();
        //white 컬러의 auto 기어를 가진 6개의 문짝이 있는 자동차
    }
}