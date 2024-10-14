package com.green.day04.ch06;

public class MethodStudy {
    /*
    ☆★모든 객체지향 언어에서 메소드는 class안에 존재해야한다.

    함수=메소드, 어디서 부르냐의 차이만 있을 뿐이다. 메소드는 서로 동등하다.

    */
    /*
    아래 메소드를 main 메소드라고 부른다.
    메소드를 만드는 행위는 '메소드를 정의했다'라고 표현한다.
    만든 메소드를 사용하는 행위를 '메소드를 호출했다.'라고 표현한다.
    public, static은 나중에 설명

    아래 4가지가 메소드 구성요소
    void: 리턴타입; 메소드가 호출 된 후 결과값
    main: 메소드명; 호출 할 때 사용한다.
    (String[] args): 파라미터, 매개변수; 메소드를 호출할 때 메소드에 보내는 데이터
    {}: 구현부; 호출되었을 대 실행되는 부분

    void main(string{} args)
    (리턴타입 + 메소드명 + 파라미터): 선언부

    메소드를 크게 두 분류로 나눈다.
     - void 메소드  : 리턴하는 값이 없다. (결과값이 없다.) 실행커서가 단독으로 호출한 곳으로 돌아간다.
     - return메소드(비void메소드) : 리턴하는 값이 있다. (결과값이 있다.)

     */
    public static void main(String[] args) {    //여기서부터 구현부    //args는 아규먼트(인자)의 줄임말이다.
        sum(5,7); //sum 메소드 호출  //정확히는 class명을 붙여야하므로 MethodStudy.sum()이 되어야한다. 생략이 가능할뿐
        sum(15,17); //sum 메소드 호출  //이 선언 자체가 값이 될 순 없다. 그러나 void 메소드에 보낼수 있다. 보내는 값은 아규먼트(인자)라 부른다.

        int result=returnsum(5,7);   //값을 return 처리하는 함수를 넣어준다.
        System.out.println("result: "+result);   //아래의 출력함수들은 전부 값이 같다. //returnsum(5,7)에 32라는 값이 저장되었기 때문이다.
        System.out.println("result: "+returnsum(15,17));
        System.out.println("result2: "+32);
    }

    //메소드는 return;을 만나면 다시 돌아간다.

    //void 메소드
    //sum이라는 이름의 static 메소드를 정의했다.(파라미터 2개)
    static void sum(int n1, int n2) { //파라미터(매개변수)마다 타입을 전부 적어야하고 갯수도 맞춰야한다. 이 파라미터들은 호출되는 순간 사라진다.
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        //void 메소드는 return; 부분이 생략된다.
    }    //void함수는 값을 출력하고 저장하지 않는다. 그대로 끝.

    //return 메소드
    static int returnsum(int n1, int n2){
        return n1 + n2;     //위의 returnsum 자리로 돌아가 값을 저장한다.
    }

    //★★★return과 void 차이를 확인해두는게 좋다.
    // return은 다시 main으로 돌아가고 void는 실행한 후 사라진다(값이 되돌아가지 않는다=내버려두면 출력하지 않는다.)
    //이름도 같고 파라미터 선언도 같으면 main에서 메소드 구분을 하지 못해 같은 이름을 쓰지 못한다
    //파라미터 타입이나 개수 선언이 다르면 main에서 알아서 구분하여 인식하는데 이것을 오버로딩이라 한다. 리턴값만 다른것은 오버로딩 할 수 없다.
}
