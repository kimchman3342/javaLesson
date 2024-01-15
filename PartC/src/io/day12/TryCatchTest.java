package io.day12;

import java.util.Scanner;

public class TryCatchTest {
    public static void main(String[] args) {
        // 예외 처리 구문 : 비정상적인 종료에 대해 사용자에게 전달.    
        try {
        // 예외 가능성이 있는 명령문 작성하기
       } catch (NumberFormatException e)  {  // (인자) : 처리할 예외의 종류 : Exception은 모든 예외.
        // 예외가 발생할 때 실행할 명령
        System.out.println("정수는 숫자만 입력하세요.");
       } 
    }
    
    
    public static void indexException() {
        int[] arrays = { 11, 22, 33, 44, 55, 66 };
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[arrays.length]);
    }
    
    public static void IndexException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요. ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("입력한 값 : " + number);
    }


}
