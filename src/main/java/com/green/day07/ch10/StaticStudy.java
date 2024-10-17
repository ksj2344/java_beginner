package com.green.day07.ch10;

public class StaticStudy {
    public static void main(String[] args) {
        NonStaticNumBox nnb1 = new NonStaticNumBox();
        nnb1.n1=10;
        nnb1.n2=30;

        NonStaticNumBox nnb2 = new NonStaticNumBox();
        nnb2.n1=15;
        nnb2.n2=20;
        nnb1.sum();
        nnb2.sum();
        //nnb1과 nnb2의 공간이 각각 생기고 그 안에 또 n1과 n2가 각자 하나씩 생긴다.
        System.out.println("-------------");

        StaticNumBox snb1 = new StaticNumBox();
        snb1.n1=10;    //Static영역에 n1과 n2가 정의 되었고 snb1의 위치를 가진 공간이 그것을 참조한다.
        snb1.n2=20;    //사실 굳이 이렇게 안씀.

        StaticNumBox snb2 = new StaticNumBox();
        snb2.n1=15;
        snb2.n2=30;

        snb1.sum(); //45
        snb2.sum(); //45
        /*
        객체마다 멤버필드의 공간이 각각 생기길 원하면 non-static(인스턴스 멤버필드)로 해야한다.
        (각 객체마다 다른 값을 저장 가능하게 하고 싶다면)

        static을 사용할 수 있으면 (위 두줄의 내용과 반대되는 경우) 적극 사용하는걸 추천한다!
        실행 속도가 빠르고 사용하기 편하다.(객체 생성이 필요없기 때문)
         */
        StaticNumBox.n1=50;
        StaticNumBox.n2=50;
        StaticNumBox.sum(); //110
        StaticNumBox.sum(150,160); //310
        // 클래스 멤버필드, 메소드는 위 처럼 사용할 수 있다.
        // 매개변수만 이용하여 해결하는 메소드는 static method로 만들면 좋다.
        //  (즉, 멤버필드를 사용하지 않는 경우)

        Math.random(); //Math 클래스 안에 있는 random이라는 static mathod
        //Math 클래스를 객체화 해서 사용할 필요없기 때문에 static 메소드가 사용이 편하다.
        //Math() 기본 생성자는 접근레벨이 private로 제한되어있다!! 따라서 Math 클래스를 객체화 할 수 없다.
    }
}

class StaticNumBox{
    static int n1, n2;
    int n3, n4;

    static void sum(int n1, int n2){
        System.out.println(n1+n2);
    }

    static void sum(){
        System.out.println(n1+n2);

        //System.out.println(n3+n4);  //static 메소드에서 인스턴스 멤버필드 접근 불가
        //hello();  //static 메소드에서 인스턴스 메소드 호출 불가
    }
    void hello(){
        System.out.println("Hello");
    }
}
class NonStaticNumBox{
    int n1, n2;
    static int n3, n4;
    void sum(){
        System.out.println(n1+n2);
        System.out.println(n3+n4);  //인스턴스 메소드에서 클래스 멤버필드 접근 가능하다.
        hello();  //인스턴스 메소드에서 클래스 메소드 호출 가능하다,
        //왜 가능한가?? sum()메소드가 호출이 된다는 것은 NonStaticNumBox가 객체화가 되었다는 뜻이다.
        //Static은 이미 메모리가 올라가 있기 때문에 사용이 가능하다.
    }
    static void hello(){
        System.out.println("Hello");
    }

}