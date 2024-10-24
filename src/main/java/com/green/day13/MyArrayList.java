package com.green.day13;



public class MyArrayList {
    private int[] arr;  //전역변수는 객체가 살아있는 동안은 계속 유지가 된다!

    public MyArrayList() {
        //arr = new int[10];
          clear();
    }

    @Override
    public String toString() {
        if(arr.length==0){
            return "[]";
        }
//        String s = "["+arr[0];    //stringBuilder 쓰는 습관을 들이자.
//        for (int i = 1; i < arr.length; i++) {
//            s=s+","+arr[i];
//        }
//        return s+"]";
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(", ").append(arr[i]);
        }
        return sb.append("]").toString();
    }


    public void add(int value) {
//        int[] temp = new int[arr.length + 1];
//        for (int i =0; i<arr.length; i++) {
//            temp[i]=arr[i];
//        }
//        arr=new int[arr.length+1];
//        for (int i =0; i<arr.length; i++) {
//            arr[i]=temp[i];
//        }
//        arr[arr.length-1]=value;
        int[] temp = new int[arr.length + 1];
        for(int i = arr.length - 1; i >= 0; i--){
            temp[i] = arr[i];
        }
        temp[arr.length] = value;
        arr=temp;
        // 처음에 시도한 코드는 마치 스와핑 하나하나 복사하는 방식을 썼음
        // 그러나 arr에 value를 추가한 배열 temp를 만들어서
        // arr에 저장된 주소값을 temp에 저장된 주소값으로 바꾸면 됨.
    }

    public void add(int index, int value) {
        if(index<0 || index>=arr.length){
            return;
        }
        int[] temp = new int[arr.length + 1];
//        for(int i =0; i<index; i++){
//            temp[i] = arr[i];
//        }
//        temp[index] = value;
//        for(int i = index; i < arr.length; i++){
//            temp[i+1] = arr[i];
//        }
        //for문 하나로 해결하기
        for(int i=0; i<temp.length; i++) {
            if (i < index) {
                temp[i] = arr[i];
            } else if (i == index) {
                temp[i] = value;
            } else if (i > index) {
                temp[i] = arr[i-1];
            }
        }
        arr = temp;
    }

    public int size(){
        return arr.length;
    }
    public void clear(){
        arr=new int[0];
    }

    public int remove(){
        if(arr.length<=0){
            return 0;
        }
        int[] temp = new int[arr.length-1]; //기존보다 한칸작은 배열 만들기
        int num=arr[arr.length-1];  //원본배열의 마지막 값을 num에 넣기, index는 0부터 세니까 -1
        for(int i =0; i<temp.length; i++){
            temp[i] = arr[i];
        }
        arr=temp;  //한칸 작은 배열 주소값을 전역변수 arr에 복사
        return num;
    }

}
