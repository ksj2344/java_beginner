package com.green.day07.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffe";
        String str2 = "Bread";   //원본이 수정되지 않는 메소드를 비파괴 메소드라고 함.

        String str3 = str1.concat(str2);  //concat 문자열을 합친 객체를 만드는 메소드
        System.out.println(str3);

        String str4 = str1+str2;  //concat과 출력값이 다르지 않음
        System.out.println(str4);

        String str5 = str3.concat(str1);
        System.out.println(str5);
        System.out.println("--------------------");

        String str6 = "abcdefghijklmn";
        System.out.println("str6.substring(3): " + str6.substring(3));  //0부터 n개 있는 문자열 중 3번째부터 추출하여 출력
        //문자열에서 추출하는 함수 //파일명에서 확장자를 추출해낼 때 사용함.
        System.out.println("str6.substring(4,7): " + str6.substring(4,7)); //얘도 오버로딩 되어있어서 사용가능함.

        System.out.println("--------------------");

        String str7 = "LExi";
        String str8 = "Lexi";
        System.out.println(str7.equals(str8)); //문자열 값이 같은지 확인
        System.out.println(str7.compareTo("LExi")); //대충 0이 나오면 같은 문자열(안씀)
        System.out.println(str7.equalsIgnoreCase(str8)); //대소문자 구분없이 같은지 비교(영어만 가능)

        String fileNm="nice_Very.Nice.jpg";
        System.out.println(".의 위치값: "+fileNm.indexOf("."));
        // .indexOf(), .의 위치값이 어디냐는 메소드, 왼쪽에서부터 찾은 index값을 return
        System.out.println(".의 위치값: "+fileNm.lastIndexOf("."));
        //.lastIndexOf() .의 위치값이 어디냐는 메소드, 오른쪽에서부터 찾은 index값을 return

        System.out.println("--------------------");

        int n=10;
        String str9 = n+""; //정수를 문자열로 변환. 이렇게 적어도 되긴함
        String str10 = String.valueOf(n); //정수, 실수, boolean.. 모든 타입을 String으로 변경할 수 있다.
        System.out.println(str9);
        System.out.println(str10);

        System.out.println("--------------------");
        String str11 = "acbcdefcdgd";
        String str11Result = str11.replace("cd","CD");  //문자열 cd라는 요소를 CD로 대체함
        System.out.println("str11Result: "+str11Result);


    }
}
