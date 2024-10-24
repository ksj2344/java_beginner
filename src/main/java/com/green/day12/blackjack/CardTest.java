package com.green.day12.blackjack;

import com.green.personal.Hypen;

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