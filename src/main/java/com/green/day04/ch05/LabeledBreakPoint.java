package com.green.day04.ch05;

public class LabeledBreakPoint {
    public static void main(String[] args) {
        //구구단에서 곱의 결과가 72인 결과를 딱 하나만 보여라.

        outer:      //라벨링, 바로 아래에 있는 for문을 이름붙임. 줄을 맞추기 위해 이렇게 적은것이지 사실상 outer: for()로 적은 것으로 봐야함.
        for(int i=1; i<10; i++){
            for(int z=1; z<10; z++){
                if((i*z)==72){
                    System.out.printf("%d x %d=%d\n", i, z,(i*z));
                    break outer;
                }
            }
        }   //이 for문을 벗어나면 다음에 다른 for문을 다시 Label 해도 그것과는 다른 코드의 Label이다.

        //while을 비롯한 다른 반복문에도 쓸 수 있다.

    }
}
