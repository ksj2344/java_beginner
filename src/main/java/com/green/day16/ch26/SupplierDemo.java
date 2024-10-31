package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
//Supplier는 Return만 있고 파라미터가 없음
//받아오는 값 따로 없이 값을 반환만 할 때 쓴다!

//파라미터도 있고 return도 있는 인터페이스는 Function

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom = () -> (int)(Math.random()* 50.0);

        System.out.println(supRandom.get()); //Supplier는 return만 있으므로 값을 가져오는 get()메소드가 있음.

        //랜덤 정수값 5개를 갖고있는 ArrayList 리턴
        List<Integer> list = makeIntList(supRandom,5);


        //랜덤 정수값(20~50) 8개를 갖고있는 ArrayList 리턴
        Supplier<Integer> supRandom2 = () -> (int)(Math.random()* 31.0)+20;
        List<Integer> list2 = makeIntList(supRandom2,8);
        System.out.println(list2);
    }

    static List<Integer> makeIntList(Supplier<Integer> random, int len){
        //List list = new ArrayList<>();
        //이렇게하면 list 배열 안의 타입이 object가 되므로 List<Integer>해야한다.
        //list를 계속 덧붙이면 결국 일을 더 하게 만듬. 길이가 정해져있는거라면 (len)을 넣어주자
            //이렇게하면 default값이 있는 배열 len개에 add로 덧붙이는게 아닐까? 아니다.
            //add는 공간이 있는 자리에 값을 넣고 그 다음 공간이 부족하면 공간을 추가하고 값을 추가한 리스트를 만들어 반환하는 매소드.
        List<Integer> list = new ArrayList<>(len);
        for(int i=0; i<len; i++){
            list.add(random.get());
        }
        return list;
    }
}
