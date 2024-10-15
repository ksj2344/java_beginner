package com.green.day05.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }
    public static void showHi(int cnt) {
        System.out.println("Hi~");
        if(cnt == 1){
            return;
        }
        showHi(--cnt); //cnt--가 되지 않도록 주의. 계속 새로운 showHi에 3이 보내진 뒤 줄어드므로 계속 3버전만 출력된다.
        //showHi(cnt-1); 과 같음
    }
}
