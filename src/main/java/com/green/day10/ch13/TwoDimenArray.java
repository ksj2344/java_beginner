package com.green.day10.ch13;
//Two Dimension Array 2차원 배열
public class TwoDimenArray {
    public static void main(String[] args) {

        int[][] arr=new int[3][5];//2차원 , 배열 안에 배열
        int[][] arr3= {  //arr과 같은 자리 갯수를 가짐. 3행 5열
                {0,0,7,14,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        /*
            arr, arr3의 각 방의 타입은 int[] (int 1차원 배열)
         */
        System.out.println("arr.length="+arr.length);
        System.out.println("arr3.length="+arr3.length);
        int[] tmp1=arr3[0];  //arr3의 0행(첫번째행)을 tmp1에 복사해서 넣겠다는 뜻.
        System.out.println("tmp1: "+tmp1[2]); //arr3의 0행(첫번째행) 2번째 값 출력한다.
        System.out.println("arr3[0][2]: "+arr3[0][2]); //위랑 같은 소리임.

        int n=1;
        for(int i=0;i<arr.length;i++){ //행 구조 반복문
            for(int i2=0;i2<arr[i].length;i2++){ //열 구조 반복문
            //배열 갯수가 가변할 때 arr[i].length 이렇게 해주면 좋음.
            //근데 인덱스값이 변하는게 그닥 좋은 데이터는 아니라서, 인덱스 변하는게 아니라면 arr[0].length해도 된다.
                arr[i][i2]=n++;
                //외부에서 n이라는 변수 지정해주고(스코프문제) 각 자리에 값을 넣어줌.
            }
        }

        System.out.println("----------------------");
        for(int i=0;i<arr.length;i++){
            for(int i2=0;i2<arr[0].length;i2++){
                System.out.printf("%d\t",arr[i][i2]);
            }
            System.out.println();
        }


        int[][][] arr2=new int[3][5][2]; //3차원, 배열 안에 배열 안에 배열
        //각 방의 타입은 int[] 2차원 배열
    }
}
