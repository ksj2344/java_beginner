package com.green.day12.blackjack;

public class CardDeckSolution {

    //Card 객체 주소값 52개를 저장할 수 있어야함.
    private final Card[] cards; //cards의 주소값만 상수로 지정. 각 방의 주소값은 변수로서 계속 기능한다.
    private final String[] patterns;

    public CardDeckSolution() { //생성자로 cards 배열의 length 지정
        cards = new Card[52]; //52개의 Card 객체를 저장할 수 있는 배열이 있음
        patterns = new String[]{"Diamond", "Heart", "Clova", "Spade"};

        int idx=0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int j = 0; j <=13; j++) {
                String denomination=getDenomination(j);
                cards[idx++] = new Card(pattern, denomination);
            }
        }
    }

    public String getDenomination(int n) {
        if (n < 0 || n > 13) {
            return "";
        }
        switch (n) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(n);
        }
    }
}
