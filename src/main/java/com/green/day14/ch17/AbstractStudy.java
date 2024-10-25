package com.green.day14.ch17;

public abstract class AbstractStudy {
    /*
    p.380 추상클래스
    class 키워드 앞에 abstract 키워드를 붙이면 추상 클래스가 된다.
    추상 클래스가 되면 객체화 불가능. >> 부모역할만 한다. (단독으로는 의미가 없다.)
    그래서 추상클래스를 상속받는 클래스가 있기 때문이다.

    class 앞에 abstract를 붙이는 것은 선택사항이나 만약에 추상 메소드를 가지게 된다면
    선택 사항이 아니라 필수 사항이 된다.

    class간의 공통적인 부분을 부모에 작성을 해서 상속받도록 하기 위한 것.
    그리고 추상 메소드를 구현해야하는 강제성!!!이 존재한다.
    추상 메소드 구현하는것을 : implements, 구현한다. 라고 한다. (구현부를 만드는 행위)
     */

    //추상 메소드 정의
    //선언부만 있고 구현부가 없는 메소드를 추상 메소드라고 한다.
    //그리고 abstract를 붙여야한다.
    public abstract void sum();


    //추상클래스나 인터페이스는 규격 구상할 때 사용한다. 표준을 만들어놓고 그에 맞춰서 제작하도록
    // mmorpg로 따지자면 마법사, 몽크, 기사, 힐러 있다면 그 객체들의 표준이 되는 '캐릭터'라는 추상클래스가 있다.

    //추상 클래스는 클래스적인 특징과 인터페이스적 특징도 가진다.
    //그래서 추상클래스도 구현부가 있는 메소드를 만들 수는 있다.
    public void multiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }

}

class ImplementsStudy extends AbstractStudy {
    //implements 단계
    //반드시 부모의 추상메소드를 구현해야한다.
    @Override //<-이때는 에노테이션 굳이 적어줄 필요 없긴함. 어차피 오버라이드 안할시 오류나기때문.
    public void sum() {
        System.out.println("Implements study");
    }
}

abstract class ImplementsStudy2 extends AbstractStudy {
 //추상클래스를 상속받은 클랙스도 추상 클래스가 될 수 잇음.
}

class AbstractStudyTest{
    public static void main(String[] args) {
        //AbstractStudy study = new AbstractStudy();
        //추상 클래스는! 객체화가 불가능하다!
        AbstractStudy study =  new ImplementsStudy();
        //ImplementsStudy, 즉 추상클래스의 임플리먼트 단계 class는 객체화가 가능하다!
        study.sum();
        //AbstractStudy는 sum메소드를 알고있다! 고로 ImplementsStudy에 있는 sum();호출한다!
        //가장 가까이 있는 것 부터 호출하므로 ImplementsStudy의 sum();을 호출한다. ImplementsStudy의 객체이기 때문.

    }
}
