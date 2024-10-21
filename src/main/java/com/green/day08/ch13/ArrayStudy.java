package com.green.day08.ch13;

public class ArrayStudy {
    /*
        배열은 같은 타입의 여러(많은) 데이터를 묶어서 저장하기 위해 사용한다.
        배열을 사용하지 않는다면 데이터 수만큼 변수를 만들어야한다.

        ※ 인덱스: 배열에서 각 요소의 위치를 나타내는 숫자

        만약, 100개의 정수값을 저장한다면 변수 선언을 100번 해야한다.
            int n1, int n2, int n3 .... int n100;
        But! 배열을 사용하면 편하게 여러 데이터를 저장하고 가져올 수 있다.
        (read/write)

        배열을 만드는 방법
        int[] 변수명 = new int[100];  //100개의 정수값을 저장할 수 있는 공간을 만들었다.
        String[] 변수명 = new String[100];  //100개의 문자열을 저장할 수 있는 공간을 만들었다.
        int[] 변수명도 가능하고 int 변수명[]도 가능하지만 보통 int[] 변수명을 주로 사용한다.

        int[] arr;가 의미하는 바는 int배열(객체)의 주소값을 arr에 저장한다. 다른 타입의 배열의 주소값은 저장할 수 없다.

        new int[100]; int형의 공간이 100개가 만들어졌다. 각 공간은 int값만 저장할 수 있다.
        new String[100]; String형의 공간이 100개가 만들어졌다. 각 공간은 String주소값만 저장할 수 있다.

        배열 쓰기
        int[] arr=new int[10];
        arr[0]=10; //첫번째 공간에 10을 대입, 공간번호(index)는 0부터 시작한다.
        arr[1]=20; //두번째 공간에 20을 대입, 공간번호(index)는 0부터 시작한다.
        arr[9]=100; //마지막 공간에 100을 대입.

        초기화 하지 않은 공간은 디폴트값이 저장되어있다.
        숫자형은 0, 레퍼런스타입은 null, boolean은 false

        [배열 읽기]
        System.out.println(arr[0]); //10
        System.out.println(arr[9]); //100

        arr.length는 자신의 공간의 크기값을 저장한 정수 상수. arr의 경우 10.
        어떤 크기의 배열이든 마지막 공간의 값을 사용하고 싶을 때는 arr[arr.length-1]. 왜? 0부터 시작해서.

        ※ .length(): 문자열의 길이를 구하는 메소드.
          .length: 배열의 길이를 객체의 속성으로 정의된 필드. 배열의 크기는 고정되어 있기 때문에 이 값을 변경할 수 없다.=상수처럼 사용됨.

          배열이 정의되면 그때부터 length가 저장됨. length를 사용할 때는 저장된 length 필드를 호출한다.

        -------

        [배열 생성과 동시에 초기화]
        int[] arr2={1, 2, 3, 4, 5};
        int[] arr2=new int[]{1, 2, 3, 4, 5}; 둘다 가능하고 new int[]생략 가능

        메소드에 파라미터로 방금 만든 배열을 보내고 싶을 때,
        메소드명({1, 2, 3}); //이렇게 호출하는 것이 안된다.
        메소드명(new int[]{1, 2, 3}); //타입 지정을 해줘야함

        그러나 보통
        int[] arr2={1, 2, 3, 4, 5};
        메소드명(arr2);
        이런 방식을 쓴다.

        배열과 반복문(for)의 궁합이 좋다. 대부분 함께 쓰인다.
     */

}