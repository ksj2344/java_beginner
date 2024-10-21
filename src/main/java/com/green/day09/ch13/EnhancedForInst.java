package com.green.day09.ch13;

import com.green.day01.ch01.SystemOutPrintln;

public class EnhancedForInst {
    public static void main(String[] args) {

        Product[] arr=new Product[4];
        arr[0]=new Product("Coffe",5000);
        arr[1]=new Product("Computer",1_000_000); //java에선 _가 없는거랑 같음. 1000000=1_000_000
        arr[2]=new Product("Apple",7000);
        arr[3]=new Product("Dress",400000);

        System.out.println(arr[0].toString()); //toString 생략되어있음. 모든 자바 객체들은 toString을 상속받고있음
        System.out.println("-----------");
        //for(타입 번호:배열)로 배열에 있는 내용물 출력  Product item=arr[0~3]
        //제품명, 가격 출력, 가격 총합 출력
        int price=0;
        for(Product item:arr){
            System.out.println(item); //결국 System.out.println(arr[0]); 과 같은 소리임! <toString메소드로 인해 문자열 출력이 가능하다.
            //System.out.printf("제품명: %s, 가격: %,d\n", item.getName(), item.getPrice()); //toString 오버라이딩 안했다면 이렇게.
            price+=item.getPrice();  //그렇다면 이건 price+=arr[0].getPrice다. arr[0]은 결국 값이 저장된 Product타입의 객체주소가 저장된 변수. 호출이 가능.
        }
        System.out.printf("총합: %,d\n",price);

        //배열에서 제품명이 Apple인 것만 찾아서 콘솔에 출력.
        for (Product item : arr) {
            if(item.getName().equals("Apple")){
                System.out.println(item);
            }
        }

    }
}


//class단위에서 public이 아니라면 생성자나 메소드가 public이어도 의미없다. class보다 구성요소가 광범위일순 없다.
//이뮤터블 객체 //setter없음 //변수 선언에 private를 붙였다. //생성자로만 값을 지정할 수 있다. //상수는 아닌데 상수처럼 쓴다.
class Product {
    private String name;
    private int price;

    Product(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //오버라이딩(Overriding): 부모가 가진 메소드를 내가 상속하여 새롭게 정의하겠다.
    @Override //애노테이션, 오버라이드 애노테이션을 작성하면 실수방지를 할 수 있다. //이게 부모한테 있는 메소드인지 아닌지를 확인시켜줌
    public String toString(){
        // toString()메소드는 객체의 텍스트 표현을 반환하는 역할을 하며, 기본적으로 객체의 클래스 이름과 메모리 주소의 해시코드를 반환한다.
        // toString()은 object에 있는 메소드라 기본적으로 상속되어있다.
        // System.out.println을 호출 할 때 .toString()은 자동으로 붙게 되며 생략된다.
        return String.format("제품명: %s, 가격:%,d",name,price);    //.format()   printf처럼 쓴 문자열을 return해줄 수 있는 함수.
        //return "제품명:"+name+", 가격:"+ price;
    }


    //객체화가 필요없는 class: 상속만 필요하고 객체화를 하면 안되는 경우 생성자가 있되, 막아놓기도 하고 다른방식으롤 막기도함. 자세한건 나중에.
}

