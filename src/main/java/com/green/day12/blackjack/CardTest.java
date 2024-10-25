package com.green.day12.blackjack;

import com.green.personal.Hypen;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        //deck은 CardDeck이 객체주소값 혹은! CardDeck을 상속받은 객체 주소값을 넣을수있음.
        deck.checkCard();
        Hypen.line();
        Card c=deck.draw(); //CardDeck이 객체화된 deck의 주소로 따라감.
        System.out.println(c);
        Hypen.line();
        deck.checkCard(); //deck에 남은 카드 확인
    }
}
class CardTest2{
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Card c1=deck.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); //카드를 저장한다.
        gamer.receiveCard(deck.draw()); //위랑 똑같은 소리
        gamer.receiveCard(deck.draw());

        Dealer dealer = new Dealer();
        dealer.needMoreCard(deck);

        Rule rule = new Rule();
        rule.getWinner(gamer,dealer);
    }
}