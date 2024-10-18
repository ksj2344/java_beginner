package com.green.day09.ch13;

public class Mission13_1 {
    /*
        int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최대값, 최솟값을 찾아서 반환하는 메소드를
        각각 다음의 형태로 정의하자.
        public static int minValue(int[] arr) //최솟값 반환
        public static int maxValue(int[] arr) //최댓값 반환

        단 반복문을 사용할 때 minValue 정의에서는 일반적인 for문을 사용하자.
        maxValue에서는 enhanced for문 사용
     */
    public static void main(String[] args) {
        int[] arr={43, 88, 100, 3, 220};
        int min=minValue(arr);
        int max=maxValue(arr);

        System.out.printf("min: %d\nmax: %d\n", min, max);
    }

    public static int minValue(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }  //예외처리!
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }
        int max=arr[0];
        for(int item:arr){
            if(item>max){
                max=item;
            }
        }
        return max;
    }

}
