package com.green.day12.blackjack;

import com.green.personal.Hypen;

import java.util.Scanner;

public class BlackJack {  //객체지향 방식으로 BlackJack 게임을 만들기.
    public static void main(String[] args) {
        Hypen.line("Black Jack");
        CardDeck deck=new CardDeck();
        Rule rule=new Rule();
        Gamer gamer=new Gamer();
        Dealer dealer=new Dealer();
        Scanner scan=new Scanner(System.in);


        //일단 두장씩 뽑게 해보자.
        for(int i=0;i<2;i++){
            gamer.receiveCard(deck.draw());
            dealer.receiveCard(deck.draw());
        }

        // System.out.println(deck.draw());
        // draw()메소드에 뽑은 카드 버리는 로직이 있다. 이렇게 하면 카드 뽑아서 저장하는게 아니라 버리겠다는 뜻이니까
        // 할거면 showYourCards()

        dealer.needMoreCard(deck); //딜러가 16점이하면 한번 더 뽑게하기

        while(true){
            gamer.showYourCards();
            System.out.print("카드를 추가하시겠습니까?(종료: N)");
            String input = scan.nextLine();
            if(input.equalsIgnoreCase("N")){  //equalsIgnoreCase 소문자 대문자 신경쓰지 않고 같은지 보기
                break;
            }
            gamer.receiveCard(deck.draw());
        }

        Hypen.line();
        rule.getWinner(gamer,dealer);
        //gamer랑 dealer 위치 바꾸면 dealer은 오류가 안생기는데 gamer은 오류남
        //왜냐면 gamer가 dealer의 부모타입이기 때문에.
        Hypen.end();

    }
}
