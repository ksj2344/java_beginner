package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr= new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        //0~19

        //i번째와 rIdx번째의 값을 스와핑
        for(int i=0;i<arr.length;i++){
            int rIdx=(int)(Math.random()*arr.length);
            int tmp=arr[rIdx];
            arr[rIdx]=arr[i];
            arr[i]=tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
