package com.green.personal;

import java.util.Arrays;
import java.util.Collections;

class test {
    public static void main(String[] args) {
        int[] arr = {3, 76, 24};
        System.out.println(Arrays.toString(maxArr(arr)));
    }
    public static int[] solution(int[] emergency) {
        int[] answer =new int[emergency.length];
        int[] arr=maxArr(emergency.clone());
        int n=1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(emergency[j]==arr[i]){
                    answer[j]=n;
                    n++;
                    break;
                }
            }
        }
        return answer;
    }

    public static int[] maxArr(int[] arr){
        Integer[] tempArr= Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(tempArr, Collections.reverseOrder());
        return Arrays.stream(tempArr).mapToInt(Integer::intValue).toArray();
    }
}
