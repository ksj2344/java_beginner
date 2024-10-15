package com.green.day06.ch09;
//Getter 변수가 가진 개체값을 읽어올 때
//Setter 변수가 가진 개체값을 변경할 때
public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("홍길동");
        System.out.println("이름: "+s1.getName());
        s1.setAge(220);
        System.out.println("나이: "+s1.getAge());
    }
}

class Student {
    private String name;   //레퍼런스 변수의 defult값은 null
    private int age;
    private float height;

    //name-setter
    public void setName(String name) {
        this.name = name;
        //name=name;은 코드의 name을 둘 다 setName 메소드의 name으로 인식함.(가장 가까운걸 인식하기 때문)
        /*  this는 상수이고 나 자신의 주소값이 저장된 공간이다.
            s1.setName으로 메소드 실행한다고 했을 때, this.name의 뜻은
            class Student 규격에 맞춰 제작되고 s1의 주소를 가진 공간 내의 name(나자신의 name)을 쓰겠다는 뜻이다. this.name=s1.name  */
    }
    //name-getter
    public String getName() {  //불러내기만 하기 때문에 파라미터 필요없음.
        return name;
    }

    public void setAge(int age) {
        if(age<0||age>170){
            return; }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }
}
