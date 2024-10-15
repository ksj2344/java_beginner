package com.green.day06.ch09;

public class InforHideCircle {
    public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.setRadius(1.5);
        System.out.println("원의 넓이(1):"+c.getArea());

        // c.radius=-3.3; //radius 멤버필드에 접근되지 않는다. (읽기/쓰기 불가능.)

        c.setRadius(-3.3);
        System.out.println("원의 넓이(2):"+c.getArea());


        System.out.println(c.PI);

    }
}

class Circle2 { //같은 패키지 안에 같은 이름의 clss생성불가
    private double radius=0; //Circle class를 벗어나면 radius에 접근 할 수 있는 방법은 없다.
    final double PI = 3.14; //얘는 Private 안붙어서 접근 가능하다.

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
