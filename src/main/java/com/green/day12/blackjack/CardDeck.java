package com.green.day12.blackjack;

public class CardDeck {

    //Card 객체 주소값 52개를 저장할 수 있어야함.
    private final Card[] cards; //cards의 주소값만 상수로 지정. 각 방의 주소값은 변수로서 계속 기능한다.
    private final String[] patterns;
    private int selectedIdx=0; //외부에 줘야할 카드의 idx값

    public CardDeck() { //생성자로 cards 배열의 length 지정
        cards = new Card[52]; //52개의 Card 객체를 저장할 수 있는 배열이 있음
        patterns = new String[]{"Diamond", "Heart", "Clova", "Spade"};
        int index = (cards.length/patterns.length);
        int n=0;
        //enhanced for문은 각 방의 값을 item에 복사해서 쓰는 것이므로 값을 넣어줄 때는 사용할 수 없음.
        for (String item:patterns) {  //그러나 여기서는 cards[n]에 patterns 배열의 값을 복사해서 넣어주는 것이기 때문에 상관없다.
            for (int j = 0; j <index; j++) {
                cards[n] = new Card(item,getDenomination(j+1));  //item은 결국 pattern[i]
                n++;
            }
        }

        shuffle();

    }
    private void shuffle() {
        //생성자를 호출할 때마다 섞이도록 해도 되지만.
        //cards가 전역변수라서 메소드로 만들어서 호출해도 된다.
        for (int i = 0; i<cards.length; i++) {
            int shuffle=(int)(Math.random()*cards.length);//0~51<인덱스값
            Card shuffledCard = cards[i];
            cards[i] = cards[shuffle];
            cards[shuffle] = shuffledCard;
        }
    }
    public String getDenomination(int n) {
        if (n == 1) {
            return "A";
        } else if (1 < n && n < 11) {
            String number = n + "";
            return number;
        } else if (n < 0 || n > 13) {
            return "";
        }
        switch (n % 10) {
            case 1:
                return "J";  //return이 있으면 break가 없어도 됨.
            case 2:
                return "Q";
            case 3:
                return "K";
            default:
                return null;
            //JAVA의 switch 문법상 default가 없으면 n이 return을 못만날 수 있다는 가능성이 있기 때문에 default값이 있어야 실행이 된다.
        }
    }

    public void checkCard(){
        for (Card item : cards) {
            System.out.println(item);
            // 여기서 item을 pattern(denomination)으로 출력하려면 Card 클래스에서 toString을 오버라이드 해야함
            // 왜? item에서 출력하는 것은 CardDeck의 객체가 아니라 Card의 객체들이기 때문에.
        }

            //while문은 몇번 돌 지 모르겠을 때 쓰는 반복문. 몇번 돌지 명확하면 for문 쓰는게 편함.
    }


    /* 카드를 주는 방식은 두가지가 있다.
       1. 카드를 배부한 후 배부한 카드의 자리(주소값)을 null로 만든 후 for문으로 이 주소값이 null인지 검증하고 null이 아니라면 배부하는 방식.
       2. 몇번째 카드까지 배부했는지 전역변수(여기서는 selectedIdx)로 기억하고 주는 방식
     */
    public Card draw(){
        if(selectedIdx>=cards.length){
            System.out.println("No more cards");
            return null;
        }

        Card card=cards[selectedIdx];
        cards[selectedIdx]=null;
        selectedIdx++;
        return card;
    }
}
