package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    /*
        List 인터페이스, Interface(인터페이스)는 객체화가 불가하다.
        
        인터페이스는 부모역할만 한다. < List를 상속받은 class(LinkedList, ArrayList)가 있다.
        두 class는 결과는 똑같은데 처리방식이 다르다.
        LinkedList는 Node방식으로 데이터를 다루고, ArrayList는 Array(배열)방식으로 데이터를 다룬다.
        LinkedList는 수정 위주의 작업이 잦으면 유리하고  (수정 과정이 간결하단 소리)
        AraayList는 읽기 위주의 작업이 많으면 유리하다.  (속도가 빠르단 소리)
        
        List 변수명=New ArrayList();
        List 변수명=New LinkedList();
        이렇게 작성이 가능하다.
     */

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10); //이 때 칸을 하나 늘려서 0번망에 정수타입 10을 넣음
        list.add(20); //이 때 칸을 하나 더 늘려서 1번방에 정수타입 20을 넣음

        ArrayList list2=(ArrayList)list ;
        //이런식으로 명시적 형변환을 하여 ShallowCopy 할 수 있지만! 굳이 할 필요 없음! 어차피 List가 알고있는 메소드만 쓰기 때문이다.
        list2.add(30); // ==list.add(30);

        list.add("하하");
        // list 0번과 1번에는 정수를 넣다 2번방에 갑자기 문자열을 넣었다.
        // 어떻게 이게 가능할까? 이 값들은 Object 타입으로 들어가있기 때문이다.
        // .add() 아무것도 지정을 하지 않으면 기본적으로 타입이 Object로 들어간다!!! //Object 모든 타입을 집어넣을 수 있는 최상위 부모

        int val0=(int)list.get(0); //list의 0자리에 Object타입으로 들어가있으므로 명시적 형변환이 요구된다. 여기서는 int
        System.out.println("val0: "+val0);

        String val3=(String)list2.get(3);  //여기서는 String으로 명시적 형변환.
        System.out.println("val3: "+val3);
        //이렇듯이 add()에 아무런 지정을 해주지 않으면 매번 값을 가져올때마다 형변환이 요구된다.

        System.out.println(list2);
        //여기서 리스트가 해시코드가 아니라 내용이 뜨는 이유: ArrayList(정확히는 그 추상적 부모)에서 toString()이 오버라이딩 되어있음.
        //추상적부모: 객체화가 안되어있는 부모 클래스

    }
}
