package collection.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class D08FileReader {

    public static void main(String[] args) {
        
        // readByCharArray();
        readByChar();

    }

    
    public static void readByChar(){
        String filePath = "단어장.txt";
        // 문자열 저장하고 변경할 수 있는 가변 객체
        StringBuilder content = new StringBuilder();
        int charValue;
        int count=0;

       try( FileReader fr = new FileReader(filePath)){

         while ((charValue = fr.read()) != -1) {    // read는 문자단위 입력
            System.out.print((char)charValue);    // 문자단위이므로 표준출력가능
            // 파일에서 줄바꿈 2바이트 \r\n (10과 13)
            // int 값을 char로 변환하여 StringBuilder에 추가
            //  content.append((char)charValue);
             count++;
        }   
    } catch (Exception e) { }
        // FileReader 닫기

        // 파일에서 읽은 내용 출력
        System.out.println(content.toString());
        System.out.println("읽은 문자수 : " + count);
    }

    public static void readByCharArray(){
        String filePath = "단어장.txt";
        StringBuilder content = new StringBuilder();
        char[] charValues = new char[256];
        int count=0;
        int b;

       try( FileReader fr = new FileReader(filePath)){
        
         while ((b = fr.read(charValues,0,256)) != -1) {
            System.out.println("읽은 내용 : " + new String(charValues,0,b)); 
            // int 값을 char로 변환하여 StringBuilder에 추가
             content.append(charValues,0,b);
             count+=b;
        }   
    } catch (Exception e) { }
        // FileReader 닫기

        // 파일에서 읽은 내용 출력
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(content.toString());
        System.out.println("읽은 문자수 : "+count);
    }

    
    
}
