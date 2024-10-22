package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        NumBox n1= new NumBox(10);
        NumBox n2= new NumBox(10); //생성자 호출할 때마다 새로 생성됨

        System.out.println("n1: "+n1);   //오버라이딩 하지 않았을 때 출력되는 해시태그는 Object에서 오는 것.
        System.out.println("n2: "+n2);

        System.out.println("n1==n2: "+(n1==n2)); //레퍼런스 변수끼리의 주소값 비교
        //n1,n2는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다름. 즉, 2개의 NumBox객체가 만들어졌다.
        System.out.println("n1.equals(n2): "+n1.equals(n2)); // String타입을 비교했을 때랑은 다르게 false가 뜬다!

        /*
        .equals()도 object 출신! 원래는 여기서도 ==비교임.
        그런데 String으로 비교하면 맞는다! 왜? String에서 오버라이딩 했기 때문.
         */


    }
}


class NumBox{
    private int num;
    NumBox(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(num);  //valueOf: printf처럼 쓸 수 있게 해줌. num은 정수지만 문자열로 출력하게 해준다!
        //valueOf는 static이다. 객체 생성없이 사용했기 때문.
        //valueOf와 toString은 return 타입이 String이다.
        //파라미터는 정수타입.
    }
}
