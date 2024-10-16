package com.green.day07.ch10;
import static java.lang.Math.*;  //*은 all의 의미로 쓴다.
//Math 클래스 아래의 static 멤버필드, 멤버메소드를 전부 import 한다는 의미.
public class StaticImport {
    public static void main(String[] args) {
        /* 원래는 이렇게 작성을 해야하지만
        System.out.println(Math.E); //E는 소괄호가 없으니 멤버필드. 또한 대문자이니 상수일것.
        System.out.println(Math.random()); //Math.random()은 double타입의 return 메소드

        static import 선언시 Math가 필요없다.
        */

        System.out.println(E);
        System.out.println(random());

        //이렇게 쓸 수 있다.

    }
}
