package com.green.day27;

import com.green.day27.noneioc.HarmanSpeaker;
import com.green.day27.noneioc.SamsungTv;
import com.green.personal.Hypen;

public class Test {
    public static void main(String[] args) {
        Tv tv=new SamsungTv();
        tv.sound();
        /*
        Samsung Tv: 소리가 난다.
        Harman Speaker: 소리가 웅장하다.
        Hanil Woofer: 웅!! 웅!! 웅!!
         */ // 이렇게에서 아래로 바뀌도록 하자

        /*Samsung Tv: 소리가 난다.
        JBL Speaker: 소리가 깔끔하다.
        Marten Woofer: 웅~ 웅~ 웅~
         */
        // 이 과정에서 반드시 코드 수정이 요구된다. 이것이 noneIOC
        // 현재는 SamsungTv가 스피커를 무엇을 쓸지 직접 결정한다.
        // 그럼 직접 결정하지 않도록 한다면?

    }
}
