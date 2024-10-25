package com.green.day12.blackjack;

public class Rule {
    public void getWinner(Gamer gamer,Dealer dealer) {
        //1. 각 게이머(게이머, 딜러)의 점수를 얻을 수 있어야 한다.
        //2. 값을 비교하여 누가 이겼는지 출력
        //3. 비겼다 or 누가 이겼다. 를 출력

        //if
        //비긴 경우! 둘의 값이 같다 or 둘 다 21을 초과하였다.
        //if-else
        //이기는 경우! A가 21보다 작을 때<-이게 전제된 상황에서
                //A가 B보다 값이 크거나, B가 21을 넘긴다.
        //else
        //지는 경우! 남은 경우의 수
        final int MAX_POINT=21;
        int A=gamer.getPoint();
        int B=dealer.getPoint();

//        if((B==A)|| ((B>MAX_POINT)&&(A>MAX_POINT))){
//            System.out.println("game draw");
//        } else if ((A<MAX_POINT)&& ((A>B)||(B>MAX_POINT)))
//        {   System.out.println("you win!");
//        } else if ((B<MAX_POINT)&& ((B>A)||(A>MAX_POINT)))
//        {   System.out.println("you lose!");
//        }

        //자꾸 호출하게 만들지 말고 변수 사용하는 습관 좀 들이도록 하자. thx 현찬씨
        //실은 상수 지정도 강사님 아이디어

        //강사님이 만든 케이스. 결국 이기는 경우랑 비기는 경우 가정했으니 남은건 지는것 뿐이라 생략해도 됨.
        if((B==A)|| ((B>MAX_POINT)&&(A>MAX_POINT))){
            System.out.println("Game draw");
        } else if ((A<MAX_POINT)&& ((A>B)||(B>MAX_POINT)))
        {   System.out.println("You win!");
        } else
        {   System.out.println("You lose!");
        }

        System.out.print("게이머: ");
        gamer.showYourCards();
        System.out.print("딜러: ");
        dealer.showYourCards();
        System.out.printf("총합점수\n게이머: %d, 딜러: %d\n",gamer.getPoint(),dealer.getPoint());

    }
}
