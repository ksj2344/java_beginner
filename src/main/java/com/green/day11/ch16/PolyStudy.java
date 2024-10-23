package com.green.day11.ch16;
//다형성(polymorphism)
public class PolyStudy {
    /*
        다형성을 method기준으로 이해하는 세가지 기준!
        1. 부모타입의 변수는 자식객체 주소값을 저장할 수 있다.
        2. 1번의 반대는 안된다. 자식타입의 변수는 부모객체 주소값을 저장할 수 없다.
        3. 타입은 호출할 수 있냐없냐(아는 메소드만 호출 가능, 모르는 메소드 호출불가.)를 구분하고!
           호출이 된다면 객체 기준. (우리가 원래 알던대로 동작한다.)
           -> 안다 모른다 구분은 해당 메소드를 가지고 있냐없냐로 구분(상속 받은 메소드도 알고있는 메소드)

        다형성을 이해할 때 멤버필드도 이해해야 하지만, 은닉화로 인해 직접 사용을 하지 않기 때문에
        멤버메소드를 어떻게 동작하는지만 이해한다.

        레퍼런스 변수끼리의 형변환이 가능한데, 위아래 수직적 상속관계(부모자식)에서만 가능하다. 수평관계(형제)는 불가.
        부모타입이 자식타입으로 형변환 하는 것도 런타임 에러 발생한다.
     */
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.roar();

        System.out.println("-------------------");
        //1번검증
        Animal ani1=new Cat();
        Animal ani2=new Dog();
        Animal ani3=new Bulldog();
        Animal ani4=new Bird();
        Dog dog1=new Bulldog();


        //2번검증
        // Bulldog dog2=new Dog(); //불가 -컴파일 에러

        // Bulldog bulldog2=(Bulldog)dog1; //Dog 타입의 변수 명시적 형변환(안됨) -런타입에러
             // ani2에는 Dog타입이 저장되어있다. 자식타입인 Bulldog에 부모객체인 Dog를 주소값을 저장하려 하여 에러발생.
        Bulldog bulldog3=(Bulldog)dog1;  //dog1에는 Bulldog타입의 객체 주소값이 저장되어있었기 때문에 명시적 형변환에 문제가 없다.
        /*
            불독은 jump메소드를 알고 있는데 Dog는 jump메소드를 가지고 있지 않아 호출이 된다면(만약) 에러가 터진다.
            그래서 자바는 애초에 자식타입이 부모객체 주소값이 담기지 않도록 되어있다.
            자식은 메소드가 부모보다 더 늘어날 수 있지만 줄어들 수는 없기 때문에.
            강제로 저장하려 하면 런타임 에러가 발생한다.
         */


        //3번 검증
        //ani3.jump();  //ani3에는 Bulldog 객체 주소값이 저장되어있으나,
            //Animal은 jump메소드(Bulldog에 정의된 메소드)를 모르기 때문에(존재하지않기 때문에) 호출할 수 없다.
        Bulldog bulldog4=(Bulldog)ani3;  //이 경우 자동형변환이 되지 않기 대문에 명시적 형변환을 해야함.
        System.out.println("ani3==bulldog4: "+(bulldog4==ani3));
        bulldog4.jump(); //ani3의 주소값을 명시적 형변환 후 Bulldog에 있는 메소드 실행
        ((Bulldog)ani3).jump(); //명시적 형변환과 호출을 같이 해도 됨! 다만 괄호에는 넣어줘야한다. 안넣을시 ani3.jump()를 Bulldog을 형변환 하게됨.

        System.out.println("-------------------");

        ani3.roar();
        bulldog4.roar();
        //결국 위의 두개는 똑같다. 같은 주소값이기 때문이다.  //타입에 따라 주소값이 달라지지 않는다.
        System.out.println("-------------------");


        //instanceof()   형변환이 가능하다면 ture, 아니면 false를 출력 하는 메소드
        //왼쪽항이 객체주소값 오른쪽 항이 타입(Class)
        // 가능: 타입이 동일한 객체이거나 자식 객체
        // 불가능: 가능의 반대
        System.out.println(ani3 instanceof Bulldog);//true  //Bulldog주소값(ani3)이 Bulldog 타입에 담길수 있냐
        System.out.println(ani3 instanceof Dog); //true   //Dog타입의 Bulldog주소값(ani3)이 Dog 타입에 담길수 있냐
        System.out.println(ani4 instanceof Bulldog); //false //Animal타입의 Bird주소값(ani4)가 Bulldog 타입에 담길수 있냐<형제라 안됨
        System.out.println(ani4 instanceof Bird);//true //Animal타입의 Bird주소값(ani4)가 Bird 타입에 담길수 있냐

        Cat cat2=new Cat();
        Dog dog2=new Dog();
        Bulldog bulldog=new Bulldog();
        Bird bird=new Bird();

        //동물을 울리자
        //호출한 것에서 알 수 있는 정보
        // 인자는 하나, void메소드, static 메소드, PolyStudy 아래에 있는 메소드
        animalCrying(cat2);   //animalCrying 앞에 아무것도 없다는 것은 같은 위치에 있는 메소드를 호출하였다.
        animalCrying(dog2);
        animalCrying(bulldog);  //미션: 불독 animalCrying이 호출 되었을 때 jump()도 같이 호출하도록 하자.
        animalCrying(bird);
    }
    static void animalCrying(Animal ani) {// 부모 타입에 자식타입의 주소값을 저장할 수 있다!
        // 그러니까 부모타입의 파라미터가 자식타입의 인자를 받을 수 있다.
        ani.roar();  //객체의 주소(각 타입에 맞는 주소).roar()메소드 호출
        //이것이 다형성!!

        if (ani instanceof Bulldog){ //들어온 주소값이 Bulldog 타입에 맞는지 검증하는 과정
            //받아온 인자가 Animal 타입이라 형 변환이 필요함.
            ((Bulldog)ani).jump();
        }
    }
}

class Animal {
    void roar() {
        System.out.println("Roar~");
    }

}

class Cat extends Animal {
@Override
    void roar() {
        System.out.println("Cats Roar like meow~");
    }
}
class Dog extends Animal {
    @Override
    void roar() {
        System.out.println("Dogs Roar like awuuuuu.");
    }
}
class Bulldog extends Dog {
    @Override
    void roar() {
        System.out.println("Bulldog Roar like bul bul.");
    }
    void jump(){
        System.out.println("Bulldog Jump to sky");
    }
}
class Bird extends Animal {
    @Override
    void roar() {
        System.out.println("Bird does'nt roar.");
    }
}
