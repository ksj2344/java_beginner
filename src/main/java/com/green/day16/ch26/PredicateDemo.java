package com.green.day16.ch26;

import com.green.personal.Hypen;

import java.util.function.Predicate;

//p.674
/*
    predicate: 서술어, 술부, 주어의 동작,상태, 성질따위를 서술하는 말.

    JAVA에서는?
    Predicate 함수형 인터페이스: 인자(파라미터)가 하나, 리턴은 boolean. 이 중 인자는 제네릭으로 되어있음.
    java scrift에서는 함수형으로 쓰는 것이 기본. 자바에서도 그런것을 구현해본것이 predicate.

    Predicate 자체로는 boolean을 반환하는 함수형 인터페이스 이다.
    함수형 인터페이스: 하나의 추상메소드를 갖고 @FunctionalInterface 어노테이션 사용하는 인터페이스. 대충 람다식 쓰겠다는 소리.
 */
public class PredicateDemo {
    public static void main(String[] args){
        Predicate<Integer> preMore10= n -> n > 10;  //인자는 n 하나, 10보다 큰지를 묻는 boolean을 리턴.
        System.out.println(preMore10.test(9));
        System.out.println(preMore10.test(10));
        System.out.println(preMore10.test(11));

        examPredicate(preMore10, 9);
        examPredicate(n -> n>10, 9);  //이런식으로 인자 단계에서 정의하여 호출하는 것도 가능하다.
        examPredicate(n -> n>10, 11);

        //남자, 남, 여자, 여 이러한 값들만 허용(true), 나머지 false
        Predicate<String> preCheckGender = s -> "남".equals(s)||
                                                "남자".equals(s)||
                                                "여".equals(s)||
                                                "여자".equals(s);

        //소괄호, 중괄호, return을 생략한 경우.
        Predicate<String> preCheckGender2 = s -> switch (s){  //람다식이 아니라 new switch의 예문. 하지만 ->를 쓰긴한다.
            case "남", "남자", "여", "여자" -> true;  //여기서 로직이 들어가고 중괄호가 들어가면 true 앞에 yeild가 들어간다.
            default -> false;
        };

        String gender="자";
        System.out.println(gender);
        if(preCheckGender.test(gender)){
            System.out.println("성별을 입력받았습니다.");
        } else {
            System.out.println("다시 입력해주세요.");
        }
        Hypen.line();
    }


    //Predicate 인터페이스의 test를 출력하기 위한 메소드, test 정의는 main의 람다식에서 한다.
    public static void examPredicate(Predicate<Integer> p, int n){  //Predicate옆에는 <타입>을 적어야함. 안할시 object가 된다.
        System.out.println(p.test(n));
    }
}

