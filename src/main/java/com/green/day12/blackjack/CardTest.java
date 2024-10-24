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
        deck.checkCard();
    }
}
class CardTest2{
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Card c1=deck.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); //카드를 저장한다.
        gamer.receiveCard(deck.draw());
        gamer.receiveCard(deck.draw());
        gamer.receiveCard(deck.draw());
        gamer.receiveCard(deck.draw());
        gamer.showYourCards();

        List<Card> list=gamer.openCard();
    }
}
class CardTest3{
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(deck.draw());
        dealer.receiveCard(deck.draw());
        dealer.receiveCard(deck.draw());
        dealer.showYourCards();
    }
}