package com.green.day08.ch11;

//p.264~269
//StringBuilder는 StringBuffer 속도면에서 유리하다. 그러나 스레드(처리를 동시에 하느냐 마느냐) 중에 객체보호가 되지 않는다.
public class BuildString {
    //일반적으로는 문자열 합칠때 그냥 +쓰면 되지만 반복문에서는 StringBuilder쓰는게 좋다.
    public static void main(String[] args) {
        //문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123");
        sb.append(45678);
        System.out.println("sb: "+sb);

        sb.delete(0,2); //0이상 2미만의 인덱스 삭제
        System.out.println("sb: "+sb);

        //길이가 어떻게 되든 모든 문자열을 지우는 방법
        //sb.delete(0,lastIndexOf("");  //되기는 하나 계산이 필요해서 length 사용보다 불리함.
        sb.delete(0,sb.length());  //last index값을 구하는법: .length()-1
        System.out.println("sb: "+sb);

        sb.append("345678");
        System.out.println("sb: "+sb);

        sb.replace(0,3,"AB"); //0이상 3미만의 인덱스 값을 AB로 대체
        String str=sb.toString(); //StringBuilder에서 String 타입으로 변경 , passing처리
        System.out.println("sb: "+sb); //StringBuilder 참조타입 sb 출력
        System.out.println("str: "+str); //String 참조타입 str 출력

        // 모든 타입은 String으로 변환 가능하다. 심지어 객체도

        StringBuilder sb2=sb.reverse().replace(0,2,"KK");  //문자열을 뒤집어주는 메소드 reverse
        //위의 예제는 체이닝 기법.(.메소드하고 .메소드하고 이런거)
        //sb.reverse();
        //sb.replace(0,2,"KK");
        //위의 두 메소드를 하나로 줄인 것.
        //나 자신의 주소값을 return해주는 return메소드이기 때문에 사용 가능하다.=return this;(나의 주소값을 리턴)가 핵심이다.

        System.out.println("sb: "+sb);
        System.out.println("sb2: "+sb2);
        System.out.println("sb==sb2: "+(sb==sb2));  //sb와 sb2는 같은 주소값을 가진다.

        /*
            sb와 sb2가 왜 같은 주소값을 가지는가? 같은 객체를 참조하고 있기 때문이다!
            StringBuilder타입의 객체 sb생성 후 reverse() 메서드는 StringBuilder의 문자열을 거꾸로 뒤집는다.
            이때, reverse() 메서드가 새로운 객체를 생성하는 것이 아니라 현재 객체(sb) 자체를 수정하고 그 객체의 참조를 반환한다.
            replace()도 마찬가지.
            reverse()와 replace()가 모두 동일한 객체(sb)를 수정하고 그 객체를 반환하므로, sb2에는 여전히 sb와 동일한 객체가 할당된다.
         */
    }
}
