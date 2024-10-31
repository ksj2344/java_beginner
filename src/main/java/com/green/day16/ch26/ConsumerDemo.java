package com.green.day16.ch26;

import java.util.function.Consumer;

//Consumer은 Return이 없고 파라미터만 받는다.
//반환하는 값 없이 인자를 받을때만 쓴다. void 메소드 쓴다는 소리.

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> cons = n -> System.out.println(n < 0 ? -n : n);
        //{if(n<0){System.out.println(n*-1);}else{System.out.println(n);}};

        cons.accept(10); //콘솔에 "10"
        cons.accept(-20); //콘솔에 "20"
        cons.accept(30); //콘솔에 "30"
        cons.accept(-30); //콘솔에 "30" 출력하려면?

        Consumer<String> cons2 = str -> System.out.printf("%s는(은) %d글자입니다.\n", str, str.length());
        cons2.accept("abc");  //"abc는(은) 3글자입니다."
        cons2.accept("dddd");
    }
}
