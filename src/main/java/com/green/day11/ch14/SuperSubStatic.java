package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS();
        sub1.showCount(); //count:3 //SuperCLS 생성 두번+SubCLS(SuperCLS상속) 한번
    }
}

class SuperCLS{
    protected static int count;

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
