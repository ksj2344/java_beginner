package com.green.day16.ch23;

import com.green.day01.ch01.SystemOutPrintln;

import java.util.*;
//key 와 value의 hashmap.
public class HashmapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //Map은 인터페이스, HashMap이 임플리먼트 //제네릭이 되어있고 보통은 <String,Object>씀
        //여기서 Map<String, String>은 <key, value>가 된다.
        map.put("홍길동","시계");
        map.put("권혜지","자바책");
        map.put("이정민","빈 캔");
        map.put("이정민","집문서"); //빈 캔이라는 value는 사라지고 집문서라는 value만 남음.
        //map.put(1,"아이폰");  타입이 달라서 정수는 넣을 수 없음

        boolean real=map.containsKey("이정민"); //이 key가 있냐는걸 boolean으로 반환하는 메소드

        System.out.println(map.keySet()); //.keySet()은 key값만 배열로 뽑아내는 메서드

        String v = map.get("홍길동");  //v에는 시계가 저장됨. 홍길동을 key로 둔 value값을 가져오겠다는 뜻.
        System.out.println("v: "+v);

        System.out.println(map.get("김수지")); //넣지 않은 값을 불러오면 null을 출력
    }
}
