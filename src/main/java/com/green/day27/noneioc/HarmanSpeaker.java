package com.green.day27.noneioc;

import com.green.day27.HanilWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class HarmanSpeaker implements Speaker{
    private Woofer woofer; //이렇게만 하면 woofer2에 null이 저장됨.
    // woofer= new HanilWoofer;
    // 이렇게 나눠서 할 수 없는 이유. 초기화 코드는 클래스의 멤버 변수 선언 부분에서 직접 초기화할 수 없다.
    // 추후 값을 넣어주는 것은 메소드를 통해 가능하므로 생성자나 setter를 통해서 해야함.

    public HarmanSpeaker(){
        this.woofer=new HanilWoofer();  //기본생성자 호출시 woofer 멤버필드에 HanilWoofer가 저장되도록.
    }

    @Override
    public void speakerSound() {
        System.out.println("Harman Speaker: 소리가 웅장하다.");
        woofer.baseSound();
    }
}
