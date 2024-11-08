package com.green.day27.ioc;


// IOC 방식으로 제작된 Tv 클래스 테스트
// noneIoc방식과는 반대로 woofer를 먼저 만들고 speaker를 만들고 tv를 만든다. 각각 받아온 값으로 제작한다.
import com.green.day27.MartenWoofer;
import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;
import com.green.personal.Hypen;

public class IocTest {
    public static void main(String[] args) {
        Woofer woofer=new MartenWoofer();
        Speaker speaker=new BoseSpeaker(woofer);
        Tv tv= new LgTv(speaker);

        tv.sound();
    }
}

class IocTest2{
    public static void main(String[] args) {
        TvFactory tvFactory=TvFactory.getInstance();
        TvFactory tvFactory2=TvFactory.getInstance();
        TvFactory tvFactory3=TvFactory.getInstance();

        System.out.println(tvFactory2==tvFactory);
        System.out.println(tvFactory3==tvFactory);
        System.out.println(tvFactory);
        System.out.println(tvFactory2);
        System.out.println(tvFactory3);
    }
}

class IocTest3{
    // 이제 우리는 코드 수정 없이 객체를 마음대로 바꿀 수 있다. 이것이 IOC
    public static void main(String[] args) {
        Hypen.line("Ioc test");
        TvFactory tvFactory=TvFactory.getInstance();
        Tv tv = tvFactory.factory(args[0], args[1], args[2]);
        tv.sound();
    }
}