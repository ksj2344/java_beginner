package com.green.day09.ch13;

public class EnhancedFor {
    //강화된 for문, 향상된 for문, foreach
    public static void main(String[] args) {

        // =이나 return으로 전해줄 수 있는 데이터는 하나뿐이다. 그러나 객체화를 통해서 주소 정보를 주어 여러 정보를 줄 수 있다.
        // 아래도 배열의 주소 하나를 int[] arr에 복사해서 준 것.
        int[] arr={10, 22, 7, 4, 80};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("-----------------");

        for(int item : arr){  //반복문이 돌 때마다 item이 새로 생성됨
            System.out.println(item);
        }
        /*
           enhanced for문은 아래처럼 동작한다.
           보통은 값을 읽어올 때만 사용한다.
           자동으로 마지막 인덱스값까지 반복한다.
            int item=arr[0];
            System.out.println(item);

            int item=arr[1];
            System.out.println(item);

            int item=arr[2];
            System.out.println(item);


           enhanced for문은
           for (요소 : 배열){
                반복할 문장
            }
            형식이며, 여기서 요소는 배열의 타입을 따른다.
           sequence가 있는 콜렉션에서 사용 가능하다.= 0, 1, 2번방 같은 순차적으로 값을 읽어오고 쓰는 콜렉션에서 사용가능하다.
           Array(배열), ArrayList. 즉 자료구조형에서 사용가능.
         */

    }
}
