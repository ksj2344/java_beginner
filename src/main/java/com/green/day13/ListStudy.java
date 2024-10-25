package com.green.day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//컬렉션은 다수의 데이터, 프레임워크는 표준화된 프로그래밍 방식을 의미한다.
// 따라서 컬렉션 프레임워크란 데이터 그룹을 저장하는 클래스들을 표준화한 설계이다.
// 자바의 정석 중에서 - 배열이랑 리스트가 컬렉션 프레임워크란 소리
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
        List list1=new LinkedList();  //Linked나 Array나 똑같이 쓴다. 그저 처리 방식이 다를뿐.
        List list = new ArrayList();  //LinkedList나 ArrayList나 List에 있는 메소드를 쓴다.
        //요렇게 쓰는 이유는 추후 코드 수정에 있어서 유연성을 주기 위해서.
        list.add(10); //이 때 칸을 하나 늘려서 0번망에 정수타입 10을 넣음
        list.add(20); //이 때 칸을 하나 더 늘려서 1번방에 정수타입 20을 넣음

        ArrayList list2=(ArrayList)list ;
        //이런식으로 명시적 형변환을 하여 ShallowCopy 할 수 있지만! 굳이 할 필요 없음! 어차피 List가 알고있는 메소드만 쓰기 때문이다.
        list2.add(30); // ==list.add(30);

        list.add("하하");
        // list 0번과 1번에는 정수를 넣다 2번방에 갑자기 문자열을 넣었다.
        // 어떻게 이게 가능할까? 이 값들은 Object 타입으로 들어가있기 때문이다.
        // .add() 아무것도 지정을 하지 않으면 기본적으로 타입이 Object로 들어간다!!! //Object 모든 타입을 집어넣을 수 있는 최상위 부모
        int[] arr = new int[3];  //정수형 배열
        Object[] arr2 = new Object[4]; //Object형 배열
        arr2[0] = 10;
        arr2[1] = "하하";
        //위의 object형 배열과 같은 형태라는 것임.


        //보통 코드상에 넣을 수 있는 값이 있으면 뺄 수 있는 값도 있다. 를 외워둘 것.

        int val0=(int)list.get(0); //list의 0자리에 Object타입으로 들어가있으므로 명시적 형변환이 요구된다. 여기서는 int
        System.out.println("val0: "+val0);  //보통 배열 안의 값이 타입이 확실하지 않은 경우 검증을 거치고 형변환 후넣는다.
                                            // Object 타입으로 있다면 일을 더한다는 소리.

        String val3=(String)list2.get(3);  //여기서는 String으로 명시적 형변환.
        System.out.println("val3: "+val3);
        //이렇듯이 add()에 아무런 지정을 해주지 않으면 매번 값을 가져올때마다 형변환이 요구된다.

        System.out.println(list2);
        //여기서 리스트가 해시코드가 아니라 내용이 뜨는 이유: ArrayList(정확히는 그 추상적 부모)에서 toString()이 오버라이딩 되어있음.
        //추상적부모: 객체화가 안되어있는 부모 클래스

    }
}
