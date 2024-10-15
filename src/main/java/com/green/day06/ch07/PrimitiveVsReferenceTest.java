package com.green.day06.ch07;

/*
    일반 변수(primitive type)
    참조 변수(reference type)
    차이점을 설명하는 예제
 */
public class PrimitiveVsReferenceTest {
    public static void main(String[] args) {
        int num = 10;   //지역변수
        changeNum(num);  //int기 때문에 changeNum의 num=100;이 실행된다.
        System.out.println("num:" + num); //결과 10
        /*
        main메소드에 있는 num 변수와(main-num)와 changeNum메소드에 있는 num매개변수(m-num)는 다른 공간이다.
        main-num이 가지고 있는 값을 복사하여 m-num에 저장했다.
        m-num값을 변경한다고 하여 main-num값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문
         */

        //NumberBox class 객체화
        NumberBox nb = new NumberBox(); //NumberBox의 규격을 따르는 공간을 제작하여 공간의 주소를 nb에 부여한다.
        nb.num = 10;  //객체 안에 10을 넣음
        changeNum(nb);
        System.out.println("nb.num:" + nb.num); //결과 100
    }
    public static void changeNum(int num) {
        num = 100;
    }

    /*
    main메소드에 있는 nb변수와(main-nb)와 changeNum메소드에 있는 nb매개변수(m-nb)는 다른 공간이다.
    다만 같은 값(주소값)을 가지고 있다. 그로인해 같은 객체에 접근할 수 있다!
    m-nb를 통해 객체의 num값을 변경을 했다면 main-nb를 통해 접근했을 때 변경된 값을 얻게 된다.
     */
    public static void changeNum(NumberBox nb) {
        //nb=new NumberBox();   //m-nb에 새로운 주소값을 저장하므로 main-nb와의 값이 달라짐 //즉 main-nb.num에 영향을 줄 수 없게됨.
        nb.num = 100;
    }

}

class NumberBox {
    int num;  //defult값 0이 세팅됨
}
