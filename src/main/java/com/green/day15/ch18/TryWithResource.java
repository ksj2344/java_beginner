package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        Path path= Paths.get("D:/Simple.txt");
        try(BufferedWriter writer=Files.newBufferedWriter(path); Scanner scan=new Scanner(System.in)){ //;을 기준으로 여러가지 조건을 넣을 수 있음
            writer.write("FinallyCase");
        } catch(IOException e) {
            e.printStackTrace();
        }
        /*
            writer.close();
            scan.close();
            는 리소스를 받은 try문이 닫히면서 무조건 실행이 된다. finallyCase3번을 실행한 것처럼 닫힌다.
            AutoCloseable 인터페이스를 상속받은 객체만이 가능하다.

            AutoCloseable auto=writer;
            auto = scan;
            try문 안에서 정의해보면 상속받았음을 알 수 있다. (다형성)
         */

        //try-catch 예외처리한 구문은 구분밖에 위치한 코드보다 처리 속도가 느리다. 과도한 예외처리는 피하도록 할것.

    }
}
