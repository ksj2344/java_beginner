package com.green.day16.ch26;
//nested class 에 대한 설명. 잘 안쓴다.
public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1=new Outer.Nested1(); //Nested1 단독으로 쓸 수 없음. 왜냐면 class Outer가 static이 아니라서
        nst1.add(10); //클래스변수 num에 숫자 추가하는 메소드.
        nst1.add(2);

        Outer.Nested2 nst2=new Outer.Nested2();
        System.out.println(nst2.get());

        //nested class는 static 붙여도 되고 안붙여도 된다.
        //여기서는 그냥 static으로 올라간 num이 어떤 객체를 참조하여 접근하든 같은 주소에 있다는걸 확인하고 싶었던듯.
    }
}

class Outer{
    private static int num;

    //class 안에 class!
    //static nested class라고 한다. 한국어로는 내장클래스.
    static class Nested1{
        void add(int val){
            num+=val;
        }
    }

    static class Nested2{
        int get() {return num;}
    }
}
