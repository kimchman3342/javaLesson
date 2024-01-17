package io.day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThreadTest {

    public static void main(String[] args) {
        
        // 실행 시간이 오래 걸릴 경우 실행 중이라는 표시를 사용자에게 보여줍니다.
        //      ㄴ 1초마다 출력하기 => 새로운 쓰레드로 만듭니다.
        //  1) Thread 클래스 상속받기  2) Runnable 인터페이스 구현하기 

        // Sysyem에서 시간측정 메소드 : 나노세컨드 10억분의 1, ms 1000분의 1
        long start = System.nanoTime();     

        // 처리할 메소드
        // copyByBuffer();
        // copyByByteArray();
         copyByByte();  // main 쓰레드 실행
        long end = System.nanoTime();
        System.out.println(String.format("소요시간 : %,d ns",(end-start)));
    }
    
    public static void copyByByte() {
        int b; int count=0;
        FileInputStream fis = null;
        FileOutputStream fos = null;   
        try{
             fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\계곡.jpg");
             fos = new FileOutputStream("계곡복사.jpg");
        while((b=fis.read()) != -1){      //1바이트 씩 복사하기(파일fis에서 파일fos 로)
            fos.write(b);
            count++;
            }
        }catch(IOException e) {
            System.out.println("파일 입출력 예외 : " + e.getMessage());
        }finally {
            try{ fis.close(); fos.close();}
            catch(IOException e) {}
        }
        System.out.println(String.format("복사한 파일 크기 : %,d 바이트",count));
    }
    // count : 2,595,514 바이트
    // 소요시간 :  14,854,307,900  ns

        
    }

