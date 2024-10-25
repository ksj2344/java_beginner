package com.green.day12.blackjack;

public class Dealer extends Gamer { //Gamer 상속(is-A)
    public void needMoreCard(CardDeck deck) {
        if(points<=16){
            //Card c =deck.draw
            //receiveCard(c);   //요런식으로 이해하면됨.

            receiveCard(deck.draw());
        }else {return;}
        //needMoreCard(deck); //재귀호출로 16점을 넘을때까지 계속 받을 수 있다.
        //원래는 while(true)로 해결하려 했음. 굳이 그럴필요 없다.
    }
}
