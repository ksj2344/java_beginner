package com.green.day09.ch13;

import com.green.day01.ch01.SystemOutPrintln;

public class EnhancedForInst {
    public static void main(String[] args) {

        Product[] arr=new Product[4];
        arr[0]=new Product("Coffe",5000);
        arr[1]=new Product("Computer",1_000_000); //java에선 _가 없는거랑 같음. 1000000=1_000_000
        arr[2]=new Product("Apple",7000);
        arr[3]=new Product("Dress",400000);


        //for(타입 번호:배열)로 배열에 있는 내용물 출력  Product item=arr[0~3]
        //제품명, 가격 출력
        int price=0;
        for(Product item:arr){
            System.out.println(item); //결국 System.out.println(arr[0]); 과 같은 소리임! <toString메소드로 인해 문자열 출력이 가능하다.
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
class Product{
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

    public String toString(){  //toString 메소드를 집어넣는다.
        StringBuilder sb=new StringBuilder();
        return String.format("제품명: %s, 가격:%,d",name,price);    //.format()   printf처럼 쓴 문자열을 return해줄 수 있는 함수.
        //return "제품명:"+name+", 가격:"+ price;
    }
}

