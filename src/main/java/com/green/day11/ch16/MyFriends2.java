package com.green.day11.ch16;

public class MyFriends2 {
    //다형성에 대한 설명, Is-A(상속으로 처리하는)관계
    public static void main(String[] args) {
        UnivFriend2[] arr1 = new UnivFriend2[3];
        CompFriend2[] arr2 = new CompFriend2[3];
        //원래는 같은 타입의 배열에 같은 타입의 정보만 넣을 수 있음.

        //다형성: 다양한 형태가 될 수 있는 성질 >> 변수타입은 다른데 저장할 수 있다.
        UnivFriend2 obj1=new UnivFriend2("Lee","010-1111-1111","Computer");
        Friend f1=obj1; //UnivFriend2 타입의 객체 주소가 담겼음에도 문제되지 않는다. //이는 상속관계에서만 가능함!
        Friend f2=new UnivFriend2("SEO","010-2222-2222","Electronics");
        // Friend f2가 의미하는 바는 Friend객체 주소값을 담을 수 있는 f2 레퍼런스 변수
        // 이제는 또한 Friend를 상속받은 객체의 주소값도 담을 수 있다.

        // 즉 Friend 배열을 만들면 UnivFriend2 객체 주소값과 CompFriend2 객체 주소값을 둘 다 담을 수 있다.
        Friend[] arr3=new Friend[10]; //arr3 각 방의 타입: Friend
        // CompFriend2 타입이나 UnivFriend2 타입 주소값을 넣어도 방의 타입이 변하는게 아니라 부모타입이 자식의 객체주소값을 받을 수 있다.
        arr3[0]=obj1;
        arr3[1]=f2;
        arr3[2]=new CompFriend2("YOON","R&D 1","02-123-9999");
        arr3[3]=new CompFriend2("PARK","R&D 2","02-333-5555");
        arr3[4]=new UnivFriend2("GANG","Entertament","010-2135-4545");

        arr3[0].showInfo();
        //arr3[4].showInfo();  //null point exception 발생!
        System.out.println("--------------------");
        for(Friend item:arr3){  //arr3중 null이 아닌 값을 showInfo()로 출력
            if(item==null){
                continue;   //5번 이후로는 값이 없기 때문에 break해도 됨. 그러나 이후에 값이 있을 수 있다면? continue해야함.
            }
            item.showInfo();
        }
        //main 메소드는 수정하지 않고 대학친구는 전공도 출력, 직장 동료는 부서도 출력.
    }
}

class Friend {
    protected String name;  //pakege벗어나고 상속관계 벗어나면 결국 private와 같음
    protected String phone;


    Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public void showInfo(){
        System.out.println("name: "+name);
        System.out.println("phone: "+phone);
    }
}

class UnivFriend2 extends Friend {
    private String major;

    UnivFriend2(String name, String major,String phone) { //이름, 전화, 전공값을 초기화 할 수 있는 생성자
        super(name, phone);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("major: "+major);
    }
}

class CompFriend2 extends Friend {
    private String department;
    CompFriend2(String name, String department, String phone) { //매개변수 순서를 바꾸면 super로 받아와도 파라미터 순서를 바꿀 수 있다.
        super(name, phone);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("department: "+department);
    }
}
