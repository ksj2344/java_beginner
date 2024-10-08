package com.green.day02.ch05;

public class IEIE {
    public static void main(String[] args) {
        int n =120;

        if(n<0){
            System.out.printf("%d는 0 미만\n",n);
        } else if(n<50) {
            System.out.printf("%d는 50 미만\n",n);
        } else if(n<100) {
            System.out.printf("%d는 100 미만\n",n);
        } else {
            System.out.printf("%d는 100 이상\n",n);
        }
        /*
            if-else if-else도 그룹이 된다. 그 중 하나만 실행 될 수 있다.
            else if의 갯수 제한은 없다. 조건을 추가하고 싶은 만큼 추가가 가능하다.
            다만, 조건은 위에서 아래로 순차적으로 물어보고 가장 빨리 만나는 true만 실행한다.
            true 조건 중 충족하는 것이 없다면 else가 실행된다.
            else는 필수가 아닌 옵션. else가 없고 해당하는 조건이 없다면 실행되지 않는다.
         */
    }
}
