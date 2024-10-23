package com.green.day12.blackjack;


//class  값 지정법 두가지: 생성자와 setter
// 빼내는건 한가지 getter
public class Card {
    private final String pattern; //무늬    //전역변수
    private final String denomination;//A, 2~10, J, Q, K 값 저장

    Card(final String pattern, final String denomination) { //상수가 처리속도가 빠르기 때문에 final 붙여주면 좋음
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }
    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", pattern, denomination);
    }
}
