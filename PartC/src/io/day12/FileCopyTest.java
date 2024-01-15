package io.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
    
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\licensed-image.jfif");
            fos = new FileOutputStream("ball.png");
            int count = 0; 
            int b;
            while ((b = fis.read())!= -1) { // 1바이트 씩 복사하기 (파일fis에서 파일 fos로)
                fos.write(b);
                count++;
            }
            System.out.println("count : " + count);
            
        } catch (Exception e) {
            
        }finally {
            try {fis.close(); fos.close();} 
            catch (IOException e) {}
    
    }

    
 }
}