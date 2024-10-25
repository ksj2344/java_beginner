package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        // Generic 제네릭  List<E> 으로 쓸 수 있다. 타입은 <E>만 있는게 아니니 따로 공부하기
        // 제네릭을 사용하면 실행 될 때 타입이 결정된다.
        // 제네릭이 사용된 클래스에 타입을 결정하지 않으면(<>안에 아무것도 안적으면) 타입은 Object가 된다.
        // 어지간하면 제네릭해서 사용한다.


        // 아래 3가지는 결국 같은 소리이다. 맘에 드는 것을 사용
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList(); //생략이 가능하다.

        //Integer : int를 객체화 하여 쓸 수 있는 wrapper class. 이것을 쓰는 이유: List<> 안에 primative 타입이 들어갈 수 없기 때문이다.
        // ArrayList 클래스에서 <> 안의 내용이 E로 메소드가 만들어져있고 이게 E의 타입으로 객체를 만든 효과가 나고있다.

        // list는 정수만 들어갈 수 있는 list이다. list.add("")할 수 없다.
        list.add(10);
        list.add(20);
        list.add(30);

        int n1=list.get(0); //형변환 하지 않아도 된다!

        System.out.println(list);

        list.add(1,60); //.add(추가할 인덱스, 추가할 값)  //1번 자리에 60을 추가하고 이후의 인덱스는 한칸씩 밀려난다.

        System.out.println(list);
        System.out.println(list.size()); //.size() 방의 갯수를 출력함

        list.remove(2);  //인덱스로 삭제하는 케이스.
        System.out.println(list);

        //list.remove(10);  //값을 찾아서 삭제할 수도 있다. 그러나 현재 list는 내용물도 정수타입이기 때문에 쓸 수 없다.


        //당연하지만 indexOf 쓸 수 있다.
        list.add(0, 30); //인덱스를 지정해서 값넣는거
        System.out.println(list);
        System.out.println("list.lastIndexOf(30) : " + list.lastIndexOf(30));
        System.out.println("list.indexOf(30) : " + list.indexOf(30));

        //lastIndexOf, indexOf 메소드의 리턴값이 -1이면 해당값이 콜렉션에 없음을 의미
        //둘 다 해당하는 값이 나올때 까지 자릿수를 찾는 메소드라서 자릿수 내에 없으면 -1까지 가기 때문이다.
        System.out.println("list.lastIndexOf(100) : " + list.lastIndexOf(100));
        System.out.println("list.indexOf(100) : " + list.indexOf(100));

        list.clear();  //리스트 내용물 전부 지우기
        System.out.println(list);
        System.out.println(list.size());

    }
}
