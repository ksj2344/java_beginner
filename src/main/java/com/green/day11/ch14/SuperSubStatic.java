package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS();
        sub1.showCount(); //count:3 //SuperCLS 생성 두번+SubCLS(SuperCLS상속) 한번
    }
}

class SuperCLS{  //클래스명과 파일명이 같을 때만 public이 붙을 수 있어서 SuperCLS와 SubClS에는 붙일수 없다.
    protected static int count; //protected: 같은 패키지에만 접근 가능 패키지가 다르더라도 상속관계면 접근가능하다. class앞에는 줄수 없음
    SuperCLS(){
        count++; //객체 생성마다 count가 오름
    }
}

class SubCLS extends SuperCLS{
//    SubCLS(){
//        super();
//    }
    //위가 자동으로 들어가며, 생략됨.

    void showCount(){
        System.out.println("count: " + count);
    }
}
