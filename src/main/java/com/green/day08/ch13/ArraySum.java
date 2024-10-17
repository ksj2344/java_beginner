package com.green.day08.ch13;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr={10, 15, 23, 1, 8};

        int sum=0;
        //지역변수는 default 값이 부여되지 않음.
        for(int i=0; i<arr.length; i++){
            //int sum=0; 여기서 선언하면 반복할때마다 새로운 sum이 정의됨!
            sum+=arr[i];
        }
        System.out.printf("sum: %d\n",sum);
    }
}
