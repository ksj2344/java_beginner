package com.green.day07.ch11;

public class MathodOverloading {
    /*
    오버로딩은 메소드에서만 적용된다.
    오버로딩은 같은 이름의 메소드를 여러개 정의할 수 있는 기법이다.
    매개변수의 종류 및 타입의 순서가 다르다면 가능하다.
    (같은 이름의 다른 메소드와 매개변수 구분이 된다면)

    매개변수명과 리턴타입은 전혀 상관없다.
    오로지 매개변수 타입의 갯수와 순서를 따진다.

    생성자도 메소드의 한 종류이기 때문에 오버로딩이 된다.
     */
    public MathodOverloading (){}
    public MathodOverloading (int n1, long n2){}
    public MathodOverloading (long n1, int n2){}

    public void sum(int n1){}
    public void sum(int n1, int n2){}
    //public void sum(int i1, int j2){} 매개변수명으로 구분하지 않는다.
    //public String sum(int n1, int n2){return "String";} //리턴타입으로 구분하지 않음
    public void sum(int n1, long n2){}
    public void sum(long n1, int n2){}
    //순서는 따진다.

}
