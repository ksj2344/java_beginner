package com.green.day15.ch18;

import com.green.personal.Hypen;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        /*
         만약 BufferedWriter writer = Files.newBufferedWriter(path); 에서는 문제가 없었고
         writer.write("FinallyCase"); 에서 예외가 발생되었다면
         writer.close(); 이 실행되지 않는다.
         그런데! 리소스 절약을 위해 writer.close();은 무조건 실행이 되어야하는 상황이다.
         */

        try {
            Path path= Paths.get("D:/Simple.txt");  //절대경로(full경로)
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FinallyCase2{
    /*
        writer.close(); 가 반드시 실행하게 하자
     */
    public static void main(String[] args) {
        Path path= Paths.get("D:/Simple.txt");  //절대경로(full경로)
        BufferedWriter writer = null;  //writer가 인식할 수 있도록 스코프를 늘려주자.
        try{ writer=Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return; //finally설명하며 추가된 부분. 여기서 return을 만나면 아래부터는 실행이 안됨
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("실행되는지 확인");
        try {
            writer.close();   //try-catch문의 밖으로 빼주면 되는데 이렇게 되면 다시 예외처리가 필요해진다. 그래서 한번더 감싸준다.
        } catch (IOException e) {
            e.printStackTrace();
        }
        Hypen.end();
    }
}


//Finally를 사용한 케이스(별로 좋은 예시는 아님)
class FinallyCase3 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try{
            Path path= Paths.get("D:/Simple.txt");
            writer= Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return;
        } catch(IOException e) {
            e.printStackTrace();
        }finally {  //(실행보장)예외가 발생해도 안해도 무조건 실행되는 부분.
            // 무조건! 실행 중 위에서 return 키워드를 만나도 무조건 실행된다.
            // 그래서 반납 혹은 종료 처리에 사용된다. 여기서는 writer.close()
            System.out.println("실행되는지 확인");
            try {
                if(writer !=null) {
                    writer.close();
                }
            } catch (IOException e) {

            }
        }

    }
}