package com.green.day08.ch11;

public class Mission11_2 {
    /*
        다음 주민 등록 번호의 중간에 삽입된 '-'를 지우고 공백으로 채워서 출력하는 프로그램을 작성해보자.
        단, StringBuilder 클래스를 활용하여 빈번한 문자열 생성이 발생하지 않도록 해야한다.

        990925-101299를
        990925 101299으로 출력
     */
    public static void main(String[] args) {
        StringBuilder id=new StringBuilder("990925-101299");

        System.out.println(id.toString().replace("-"," "));
        //StringBuilder메소드에 있는 toString으로 id를 String타입으로 passing 한 후 replace메소드 사용
        //passig 처리 하지 않고 replace(); 메소드를 쓰는경우 n번째부터 m번째까지의 인덱스를 "문자열"로 대체하는 식으로만 사용 가능.
        //But! 이렇게하면 String에서도 생기고 StringBuilder에도 생기므로 메모리를 더 사용한다. 빈번한 문자열 발생!

        StringBuilder sb=new StringBuilder("990925-101299");

        int dashIdx=sb.indexOf("-");   //indexOf로 -의 위치를 찾아서 해결하는 방식. 이렇게 해결하는게 메모리를 덜쓴다.
        System.out.println("dashIdx:"+dashIdx);
        sb.replace(dashIdx,dashIdx+1,"");
        System.out.println(sb);


    }
}
