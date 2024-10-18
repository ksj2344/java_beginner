package com.green.day09.ch13;

public class MyArrays {
//public 쓰는 이유: 패키지 밖에서도 쓸려고
    public static String toString (int[] arr){
        StringBuilder str = new StringBuilder("[");
        int lastIdx = arr.length-1;
        for(int i=0; i<arr.length; i++){
            str.append(arr[i]);
            if(i == lastIdx){
                break;
            }
            str.append(", ");
        }
        return str.append("]").toString();


    }

    public static String toString2 (int[] arr){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(i!=0){
                str.append(", ");
            }
            str.append(arr[i]);
        }
        return "["+str+"]";  //문자열+가 되어서 str.toString() 생략됨


    }

    public static String toString3 (int[] arr){
        if(arr.length==0){
            return "[]";
        }
        StringBuilder str = new StringBuilder("[");
        str.append(arr[0]);
        for(int i=1; i<arr.length; i++){
            str.append(", ");
            str.append(arr[i]);
        }
        return str.append("]").toString();

    }


    public static int[] copyOf(int[] arr, int Index){
        int [] temp=new int[Index];
        for(int i=0;i<Index;i++){
            temp[i]=arr[i];
        }
        return temp;
    }

    public static int[] copyOf(int[] arr){
//        int [] temp=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            temp[i]=arr[i];
//        }
//        return temp;
        return copyOf(arr, (arr.length));
    }
}

