package com.green.day08.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr=new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=(i+1)*10;
        }

        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }

        //쓰기와 읽기를 동시에 하는 반복문은 안넣는게 좋음. 저 위의 코드 두개는 분리해서 넣는게 재사용성이 도움이 된다.
    }
}
