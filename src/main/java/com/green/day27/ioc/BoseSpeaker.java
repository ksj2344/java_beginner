package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class BoseSpeaker implements Speaker {
    private Woofer woofer;

    public BoseSpeaker(Woofer woofer){  //외부에서 값을 받아온다. 생성자 아니고 setter여도 됨. 주입받는 것을 DI라고 한다.
        this.woofer=woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Bose Speaker: 소리가 짱짱하다.");
        woofer.baseSound();
    }
}
