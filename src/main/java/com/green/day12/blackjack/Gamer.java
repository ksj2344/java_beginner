package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card 객체 주소값 여러개 저장 할 수 있어야 한다. <멤버필드 선언
    //여기서는 ArrayList 사용한다.
    private final List<Card> cards;
    private int points;

    public Gamer() {
        cards = new ArrayList();
    }

    public void receiveCard(Card card) {
        //switch expression switch문을 마치 return메소드처럼 쓸 수 있다!  java12부터 추가된 기능.
        points+=switch(card.getDenomination()){
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default ->Integer.parseInt(card.getDenomination());
            //Intger.parseInt() 문자열을 정수타입으로 바꾸는 static 메소드
        };
        cards.add(card);


    }

    public void showYourCards(){
        if(cards.size() == 0){
            System.out.println("You have no cards");
            return;
        }
        //간단하게 enhanced for문으로 처리하기
//        for(Card card : cards){
//            System.out.println(card);
//        }

        //Card 단계에서 Override 되었기 때문에
        // 해시코드 대신 카드가 출력된다!
        //가로로 출력하기
        System.out.print("[");
        System.out.print(cards.get(0));
        for (int i = 1; i < cards.size(); i++) {
            System.out.print(", "+cards.get(i));
        }
        System.out.println("]");
    }

    public List<Card> openCard(){ //이게 Getter랑 비슷함. 규칙범위에서 뽑은카드를 써야하니까.
        return cards;
    }



}
