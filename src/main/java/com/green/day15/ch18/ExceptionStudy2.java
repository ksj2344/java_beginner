package com.green.day15.ch18;

import com.green.personal.Hypen;

public class ExceptionStudy2 {
    /*
    메소드를 호출하는 코드를 작성하였는데 빨간줄이고, unhandled Exception=처리되지 않은 예외 라는 내용이 보이면
    해당 메소드는 예외를 던지고(throw)하고 있기 때문에 호출하는 부분에서 try-catch로 해결을 해주어야한다. (호출부분을 감싸줘야한다.)
    안하면 컴파일 에러. 마우스를 올리고 추가액션->try-catch로 감싸기 누르면 자동으로 됨.
     */

    public static void main(String[] args) {
        int r = 0;
        try {
            r = div(10,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("r: "+r);
    }
    public static int div(int n1, int n2) throws Exception{  //throws 예외 //해당 예외 발생시 던지겠다.
        //throws Exception=나는 메소드를 호출한 부분으로 던지고 넘어가겠다.
        return n1/n2;
    }
}
