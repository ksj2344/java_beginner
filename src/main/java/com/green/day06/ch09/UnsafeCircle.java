package com.green.day06.ch09;

public class UnsafeCircle {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.setRadius(1.5);
        System.out.println("원의 넓이(1):"+c.getArea());

        c.setRadius(2.5);
        System.out.println("원의 넓이(2):"+c.getArea());

        c.setRadius(-3.3);
        System.out.println("원의 넓이(3):"+c.getArea());

        c.radius=-3.3;   //다이렉트로 값을 집어넣으면 이러한 오류가 생김.
        // 그래서 직접적으로 멤버필드를 수정할 수 없도록 함. 그것이 은닉화.
        System.out.println("원의 넓이(4):"+c.getArea());
    }
}

class Circle {
    double radius = 0;
    final double PI = 3.14;

    public void setRadius(double rad) { //음수값으로는 변경이 되지 않도록 한다.
        if (rad < 0) {
            radius = 0;
            return;
        }
        radius = rad;
    }

    public double getArea() { //원의 넓이 값을 return
        return PI * radius * radius;
    }
}
