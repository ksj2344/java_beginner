package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card 객체 주소값 여러개 저장 할 수 있어야 한다. <멤버필드 선언
    //여기서는 ArrayList 사용한다.
    protected final List<Card> cards;  //상속관계or패키지 내라면 쓸 수 있게 protected 접근지시
    protected int points;

    public Gamer() {
        cards = new ArrayList();
    }

    public void receiveCard(Card card) {
        //New switch expression switch문을 마치 return메소드처럼 쓸 수 있다! java12부터 추가된 기능.
        this.points+=switch(card.getDenomination()){  //this 생략 가능
            case "A" -> 1;  //{yeild 1}; 이 생략된 것.
            // 메소드에서 return을 쓰면 메소드 종료를 하기 때문에 대신 yeild 키워드로 값을 반환한다.
            case "J", "Q", "K" -> 10;
            default ->Integer.parseInt(card.getDenomination());
            //Intger.parseInt() 문자열을 정수타입으로 바꾸는 static 메소드
            // -> 는 반환하는 키워드를 적지 않고 생략하여도 값을 반환해준다.
        };
        cards.add(card);
    }

    public int getPoint() { //이게 Getter랑 비슷함.
        return points;
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



}
