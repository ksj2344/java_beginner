package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        String s1 = new String("10");
        String s2 = new String("10");
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); //주소값이 다르지만 값은 같기 때문에 true가 뜬다.

        NumBox n1= new NumBox(10);
        NumBox n2= new NumBox(10); //생성자 호출할 때마다 새로 생성됨
        NumBox n3= new NumBox(13); //생성자 호출할 때마다 새로 생성됨


        System.out.println("n1: "+n1);   //오버라이딩 하지 않았을 때 출력되는 해시태그는 Object에서 오는 것.
        System.out.println("n2: "+n2.toString());

        System.out.println("n1==n2: "+(n1==n2)); //레퍼런스 변수끼리의 주소값 비교
        //n1,n2는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다름. 즉, 2개의 NumBox객체가 만들어졌다.
        System.out.println("n1.equals(n2): "+n1.equals(n2)); // String타입을 비교했을 때랑은 다르게 false가 뜬다!

        /*
        .equals()도 object 출신! 원래는 여기서도 ==비교임.
        그런데 String으로 비교하면 맞는다! 왜? String에서 오버라이딩 했기 때문.
         */

        System.out.println("n1.equals(n3): "+n1.equals(n3));

    }
}


class NumBox{
    private int num;
    NumBox(int num) {  //받아온 숫자를 그대로 집어넣는 생성자
        this.num = num;
    }

    @Override
    public boolean equals(Object object) { //Object는 최상위 부모라서 아무타입을 집어넣든지 다 가능함
        if(object instanceof NumBox){ // Object는 아무타입이나 다 받으므로 object로 받은 인자타입이 NumBox와 같은지 먼저 검증한다.
            return ((NumBox)object).num == this.num; //this는 생략가능.
            //object 타입을 먼저 형변환 한 다음 이 객체의 num(멤버필드)값이 object 객체의 num(멤버필드)값과 같은지 비교한뒤 return
        }
        return false;
    }

    //오버라이딩 된 toString으로 해결한 방법. 그러나 속도가 느리기 때문에 비추천.
    public boolean equals2(Object object) {
        if(!(object instanceof NumBox)){
            return false;
        }
        return toString().equals(object.toString());
        //문자열로 비교할 시 배열과 for문으로 검증하기 때문에 이게 더 느림.
    }

    @Override
    public String toString() {
        return String.valueOf(num);  //valueOf: printf처럼 쓸 수 있게 해줌. num은 정수지만 문자열로 출력하게 해준다!
        //valueOf는 static이다. 객체 생성없이 사용했기 때문.
        //valueOf와 toString은 return 타입이 String이다.
        //파라미터는 정수타입.
    }
}
