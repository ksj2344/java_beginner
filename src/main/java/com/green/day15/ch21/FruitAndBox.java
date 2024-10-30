package com.green.day15.ch21;
//p.480
//Generic이 없던 시절의 코드
public class FruitAndBox {
    public static void main(String[] args){
        AppleBox chugdo = new AppleBox(new Apple());  //AppleBox안에 Apple 객체만 들어가면 되니까 굳이 Apple ap 변수는 필요없음.
        OrangeBox delmont = new OrangeBox(new Orange());

        //현재 상황으로는 한 사과박스 하나당 하나의 사과와 한 오렌지박스 하나당 하나의오렌지만이 들어갈 수 있다.
        // 사과나 오렌지가 하나가 더 있으면 박스를 새로 만들어야한다.
    }
}

class Apple{
    @Override
    public String toString(){
        return "사과";
    }
}
class AppleBox{
    //사과박스 하나에 하나의 사과를 저장하자. 하면 사과 타입의 변수 하나를 정의하면 된다.
    private Apple ap;

    AppleBox(Apple ap){
        this.ap=ap;
    }
    Apple getAp(){ //Getter
        return ap;
    }
}

class Orange{
    @Override
    public String toString(){
        return "어륀지";
    }
}
class OrangeBox{
    private Orange orange;

    OrangeBox(Orange or){
        this.orange=or;
    }
    Orange getOrange(){
        return orange;
    }
}
