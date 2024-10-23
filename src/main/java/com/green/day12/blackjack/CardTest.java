package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        //cardDeck은 CardDeck이 객체주소값 혹은! CardDeck을 상속받은 객체 주소값을 넣을수있음.
        Card c=deck.draw(); //CardDeck이 객체화된 cardDeck의 주소로 따라감.

    }
}
