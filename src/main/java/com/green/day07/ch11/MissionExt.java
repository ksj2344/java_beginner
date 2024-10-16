package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        String fileNm="nice_Very.Nice.jpg";
        int a=fileNm.lastIndexOf(".")+1;  //결과값이 return되어 저장된 것이므로 ++을 사용할 수 없다.
        String ext=fileNm.substring(a);
        System.out.println(ext);

        System.out.println(fileNm.substring(fileNm.lastIndexOf(".")+1));
    }
}
