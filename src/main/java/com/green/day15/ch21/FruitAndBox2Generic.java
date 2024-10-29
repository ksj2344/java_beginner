package com.green.day15.ch21;
// 제네릭에 대하여!!!!!!!!!!!
// 제네릭은 객체 형태가 같은데 타입만 다를 때 사용한다. 인터페이스를 사용하여 임플리먼트로 처리할 수도 있지만 제네릭을 쓸 수도 있다.
public class FruitAndBox2Generic {
    public static void main(String[] args) {
        BoxGeneric<Apple> appleBox=new BoxGeneric<>(new Apple()); //여기서 <>나 <Apple>을 생략하면 Object로 들어간다.
        Apple apple=appleBox.getBox();

        BoxGeneric<Orange> orangeBox=new BoxGeneric<>(new Orange());
        Orange orange=orangeBox.getBox();

        //우측항(new 파트) 부분에서 <>을 생략하면 제네릭의 타입이 Object가 됨.
        //그러면 저장될 때 타입에 적은 <Orange>로 형변환을 하게된다.
        //new 부분에 <>를 작성하는 것이 성능면에서 도움이 된다.
        BoxGeneric<Orange> orangeBox2=new BoxGeneric(new String());
        Orange orange2=orangeBox2.getBox();
        //FruitBoxGeneric<Orange> orangeBox3=new FruitBoxGeneric<>(new String());  //이러면 오류를 감지할수있음.
    }
}

//꺾쇠 안에 들어가는 것은 대문자 하나 아무거나 됨. T는 타입을 나중에 정하겠다는 의미. 객체화 시점에 정해진다.
class BoxGeneric<T>{
    private T fruit;
    BoxGeneric(T fruit){
        this.fruit=fruit;
    }

    T getBox(){
        return this.fruit;
    }
}