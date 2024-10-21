package com.green.day10.ch13;


import java.util.Arrays;

public class Mission13_2_1 {
    public static void main(String[] args) {
        /*
            다음 메소드는 int형 1차원 배열에 저장된 값을 두번째 매개변수로 전달된 값의 크기만큼
            전부 증가 시킨다.
            public static void addOneArr(int[] arr, int add) {

            }
         */
        int[] arr = {1, 2, 3, 4, 5};
        addOneDArr(arr,3); //미션: 두번째 인자의 값을 모든 방에 더해준다.
        System.out.println(Arrays.toString(arr));

        int[][] arr2={
                {1,2,3},
                {4,5,6}
        };
        addTwoDarr(arr2,4); //미션: addOneDArr와 같으면 되는데 메소드 재활용 할것
        System.out.println(Arrays.deepToString(arr2));
        //deepToString()은 배열이 다차원이든 단일 배열이든 상관없이 모든 배열의 내용을 재귀적으로 순회하면서 문자열로 변환한다
        //원래는 아래처럼 적어야함.
        // for(int[] item:arr2){
        // System.out.println(Arrays.toString(item));
        // }

    }
    public static void addOneDArr(int[] arr, int n) {
        for(int i=0;i<arr.length;i++){   //arr은 주소값을 전달하는 레퍼런스 변수! 다른 메소드에서 값을 바꿔도 변환된다.
            arr[i]+=n;
        }
        // enhanced for문은 item에 arr[i]값을 복사해서 넣는것이지 같은 공간이 아니다!
        // 원본은 수정되지 않는다.
        // 즉, 아래는 item의 값만 변경되므로 arr의 인덱스 내부 값은 변하지 않는다.
        // for(int item:arr){
        //    item+=n;
        // }
    }

    //int[] 객체의 각 방 타입: int
    //int[][] 객체의 각 방 타입: int[]
    public static void addTwoDarr(int[][] arr, int n) {
        for(int j=0;j<arr.length;j++){
            addOneDArr(arr[j],n);
        }
    }
}
