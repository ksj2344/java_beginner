package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_2_Solution {


    /*
        다음 형태로 표현 된 2차원 배열이 존재한다고 가정해보자.
        1   2   3      >>1행
        4   5   6      >>2행
        7   8   9      >>3행
        이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경하는 메소드를 정의하자.
        7   8   9      >>1행
        1   2   3      >>2행
        4   5   6      >>3행

        물론 배열의 가로와 세로 길이에 상관 없이 위와 같이 동작하도록 메소드를 정의해야한다.
     */
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        arrayChangeOrder(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void arrayChangeOrder(int[][] arr){
        int lastIdx = arr.length-1;  //last배열의 최종 인덱스 값을 arr인덱스 값의 -1 <길이는 1부터 세는데 인덱스는 0부터 세기 때문.
        int[] last=arr[lastIdx];  //last 1차 배열에 arr 마지막 행을 복사
        for(int i=lastIdx;i>0;i--){  //마지막 직전행을 마지막에 복사하고 그 전 행을 마지막 직전 행에 복사하고 그그 전 행을 그 전행에 복사하고...
            arr[i]=arr[i-1];
        }
        arr[0]=last; //마지막 행인 last 1차배열을 arr첫번째 행 arr[0]에 복사.
    }
}
