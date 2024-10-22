package com.green.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        ClassC c=new ClassC();
        // super 생성자 호출은 자식 생성자 코드에서 최상위에 위치해야한다.
        // 위와 같은 사유로 생성자 실행시 Class A, B, C 순으로 진행됨.
        // C에서 거슬러가서 B로 갔다가 거기서 또 거슬러오른 후 A의 내용이 끝나면  B로 내려오는식.

    }
}


//ClassB는 ClassA 상속, ClassC는 ClassB상속
//JAVA에서 상속은 부모를 하나만 둘 수 있음(단일상속). class ClassC extends ClassB, ClassA안된단 소리임.
//어차피 ClassB가 ClassA를 상속하고 있으니 하나씩 거슬러 오르는 식.
class ClassA{
    ClassA(){
        System.out.println("======ClassA======");
    }
}
class ClassB extends ClassA{
    ClassB(){
        System.out.println("======ClassB======");
    }
}
class ClassC extends ClassB{
    ClassC(){
        System.out.println("======ClassC======");
    }
}
