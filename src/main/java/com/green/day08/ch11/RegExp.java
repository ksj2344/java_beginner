package com.green.day08.ch11;

import java.util.regex.Pattern;

public class RegExp {

    /*
        정규표현식 Regular Expression
        모든 프로그래밍 언어에서 사용 가능한 별도의 표현식.
        패턴 체크할 때 사용한다. - 이메일 규칙, 비밀번호 규칙(특수문자 2개이상, 영문자만 있는지.)
     */
    public static void main(String[] args) {
        String email = "abc12@naver.com";
        String regExp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z0-9]{2,3}+$";
        String regExp2 = "^[a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]{2,}+$";

        boolean isOk = Pattern.matches(regExp, email);
        System.out.println(isOk);

        String REGEXP_KR = "^[가-힣]*$";  //자음도 넣고싶다면 [ㄱ-ㅎ]도 넣으면 됨
        isOk = Pattern.matches(REGEXP_KR, "안녕");
        System.out.println(isOk);
    }
}
