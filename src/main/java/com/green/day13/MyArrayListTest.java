package com.green.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        System.out.println(list);
        list.add(10);
        System.out.println(list);
        list.add(20);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.add(2,30);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}
class MyArrayList2 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //마지막 방에 있는 값은 리턴.
        //마지막 방도 없애야함. 즉 size는 3이 되어야함.
        System.out.println(list.remove());
        System.out.println(list); //[10, 20, 30]
    }
}
