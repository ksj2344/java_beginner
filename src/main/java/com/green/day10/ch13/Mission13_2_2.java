package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_2 {


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
        arrayChangeOrder(arr);
    }
    public static void arrayChangeOrder(int[][] arr){
        int[][] temp=new int[arr.length][arr[0].length]; //arr과 같은 크기를 가진 2차 배열 temp 생성
       for(int i=0;i<arr.length;i++){
           //Deepcopy  (이럴필요 없이 temp[i]=arr[i] 해도 됐고, 첫번째 값만 복사하면 되어서 1차배열 tmp 만들어서 tmp=arr[0]해도 됐음
           for(int j=0;j<arr[i].length;j++){
               temp[i][j] = arr[i][j];
           }
       }

       for(int i=0;i<arr.length-1;i++){
           arr[i]=arr[i+1];
       }

       arr[arr.length-1]=temp[0];  //arr.lenth-1한 이유: 인덱스는 0부터 센다. arr[arr.length-1]은 arr마지막 열이란 소리임.


        System.out.println(Arrays.deepToString(arr));

    }
}
