package com.green.day15.ch18;

import com.green.personal.Hypen;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;  //패키지에는 대문자 안넣음. 그걸로 클래스 구분함

//p.402 예제
/*
 D드라이브에 Simple.txt파일을 만든다.
 */
public class IOExceptionCase3 {
    public static void main(String[] args){
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Hypen.end();
    }

    public static void md1() throws IOException{
        md2();
    }

    public static void md2() throws IOException{
        Path path= Paths.get("D:/Simple.txt");  //절대경로(full경로)
        BufferedWriter writer = Files.newBufferedWriter(path); //throws 메소드
        writer.write('A');
        writer.write("반갑다.");
        writer.close();
        //현재 로직대로는 쓰기만 가능해서 메소드 실행마다 추가되지는 않음
    }
}
