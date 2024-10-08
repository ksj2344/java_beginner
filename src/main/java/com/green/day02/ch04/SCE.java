package com.green.day02.ch04;

public class SCE {
    public static void main(String[] args) {

        /*
            &&연산자는 false가 될 확률이 높은 연산을 왼쪽으로 배치하는게 유리하고
            ||연산자는 True가 될 확율이 높은 연산을 왼쪽으로 배치하는게 실행 속도면에서 유리하다.
         */

        int n1=0, n2=0;
        boolean result;
        result = ((n1 +=10)<0)&&((n2 +=10)>0);    //&& 연산자는 왼쪽 항이 false면 오른쪽 항 연산을 하지않고 false를 리턴한다.
        System.out.println("result: "+result);
        System.out.println("n1: "+n1);  //n1 += 10은 실행이 되었기 대문에 n1값이 10임
        System.out.println("n2: "+n2);  //n2 += 10은 실행이 되지 않아 n2값이 여전히 0

        int n3=0, n4=0;
        result=((n3 += 10)>0)&&((n4 += 10)>0); //true, 왼쪽 항이 true였기 때문에 오른쪽 항 또한 연산을 실행함.
        System.out.println("result: "+result);
        System.out.println("n3: "+n3);
        System.out.println("n4: "+n4);
    }
}
