package com.green.day27.ioc;

import com.green.day27.*;

public class TvFactory {
    // SingleTon 패턴, 싱글톤 패턴
    // 객체를 딱 하나 만들어서 돌려 쓰겠다.
    private static TvFactory tvFactory;
    public static TvFactory getInstance(){
        if(tvFactory==null){
            tvFactory=new TvFactory();  //최초로 호출시 객체생성
        }
        return tvFactory;  //그 이후로는 하나의 객체만 반환.
    }

    private TvFactory() {}  //생성자에 접근 못하도록 한다. 그러니까 이 클래스 외부에서 생성자 접근을 못하도록 하겠다.


    public Tv factory(String tvName, String speakerName, String wooferName){
        Woofer woofer = switch(wooferName){
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName){
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };

        return switch (tvName){
            case "lg" -> new LgTv(speaker);
            default -> null;
        };
    }
}
