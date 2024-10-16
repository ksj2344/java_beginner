package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        String fileNm="nice_Very.Nice.jpg";
        int a=fileNm.lastIndexOf(".")+1;
        String ext=fileNm.substring(a);
        System.out.println(ext);

        System.out.println(fileNm.substring(fileNm.lastIndexOf(".")+1));
    }
}
