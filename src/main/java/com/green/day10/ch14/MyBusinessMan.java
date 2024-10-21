package com.green.day10.ch14;
//상속에 대한 설명
public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man1=new BusinessMan("Yoon","Hybrid ELD", "Staff Eng.");
        System.out.println(man1.getName()); //private 멤버필드라서 getName으로 호출해야함

        man1.tellYourSelf();
        //BusinessMan의 class안에는 tellYourSelf() method가 없지만 사용할 수 있다.
        //Man으로 부터 상속을 받아서 사용할 수 있는 것이다!
        //같은 사유로 Object 클래스로 부터 상속 받았기 때문에 toString메소드를 호출할 수 있다.
        System.out.println("----------");
        man1.jump();  //오버라이딩 한 메소드를 사용

        System.out.println("----------");
        man1.whatIsDoing(); //super.로 부모의 메소드 호출

        //man1.super.jump();
        //위처럼 못쓰는 이유! 첫번째로는 외부에서 this, super를 사용할 수 없고(상속 관계 내부에서 사용한다.)
        //부모의 부모에게 다이렉트로 호출할 수는 없다! 그냥 연쇄적으로 호출해서 씀.

        /*
            class가 객체화 하면 그의 부모들도 다 메모리로 올라간다.
            만약 객체화 한 class에 호출한 method가 없다면 계속 부모 class로 해당 method를 찾아 거슬러 올라간다.
            그리고 가장 가까운 method를 가져온다.
            예를 들어 BusinessMan객체에서 active() 메소드를 호출했다고 가정하자.
            그리고 클래스 object와 클래스 Man에 같은 이름의 active() 메소드가 있다면 Man의 active()를 호출한다.
         */
    }
}

//상속키워드를 생략하면 extends Object가 자동으로 붙는다.
//모든 class는 최상위 부모로 Object를 갖는다.
class Man extends Object {
    private String name;
    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void tellYourSelf(){
        System.out.printf("제 이름은 %s입니다.\n", name);
    }
    public void jump(){
        System.out.printf("%s(이)가 점프하다.\n", name);
    }
}


class BusinessMan extends Man{  //extends 상속받고픈 클래스
    private String company;
    private String position;

    public BusinessMan(String name, String company, String position) { //this. 은 나자신의 객체  //this()는 생성자
        /* super(); 내 부모의 생성자를 호출하는 메소드
          ☆★ 주의: super소괄호는 생성자의 가장 최상단에 위치해야한다!!!!!!☆★
        안써도 생략이 된다. 소괄호를 생략하면 자동으로 super(); 이 내용만 추가된다.<부모의 기본 생성자를 만든단 소리.
       ※ 그러나! 부모에게 기본 생성자가 없을 때 super();를 쓰면 오류가 난다. 어떻게 해결해야 할까?
         1. 부모에게 기본 생성자를 만들어준다.
         2. 있는 생성자를 쓴다. (수동으로 작성)
         */
        super(name);
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }
    public String getPosition() {
        return position;
    }

    //오버라이딩: 부모가 가진 메소드를 호출하는 것이 아니라, 내가 부모의 메소드를 '재정의' 하여 사용하는 기법.
    public void jump(){
        super.jump(); //super.을 생략하면 나자신(재귀호출)=this.jump()가 되기 때문에 무한루프가 된다.
        //오버라이딩 하지 않았다면 super.jump()나 this.jump()나 같았겠지만 오버라이딩 하기 때문에 달라짐.

        System.out.printf("%s에 다니는 %s(이)가 점프하다.\n",position,getName());
        //name은 private으로 정의되어 바로 접근할 수 없다.
        //public으로 상속받은(접근할 수 있는) getName 메소드를 호출하여 이름값을 얻는다.
        //getName()은 super.getName()으로 쓸수도 있고 this.getName()으로도 가능하다.
    }
    public void whatIsDoing(){
        super.jump(); //부모가 가지고 있는 메소드를 호출하고 싶으면 super.을 이용하여 쓰면 된다.
    }
}