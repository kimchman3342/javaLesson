package basic.day4;
// A25 소스파일은 구글 드라이브에 올려주세요.

public class A25MySampleMethod {
    // A22번 1) ~ 5) 을 각각 메소드로 정의해보기
        // 1) sum1ToN   2) multiply1ToN 3)sumMToN  4) multiplyMToN 5)multiplyNof2
        // 6) 구구단 '출력'하는 메소드. 리턴은 void.printGuguDan

    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        
        
        System.out.println("1번 : " + sum1ToN(n));
        System.out.println("2번 : " + multiply1ToN(n));
        System.out.println("3번 : " + sumMToN(m,n));
            }
    
    
    public static int sum1ToN(int a) {       // 1) 1부터 정수 n 까지 더하기
        int result1 = 0;
       
        for(int i = 1; i <= a; i ++){
            result1 += i;   //sum = sum + i;         
        }
        return result1;
    }
    public static long multiply1ToN(long a) {   // 2) 1부터 정수 n 까지 곱하기
        long longResult = 1;

        for(int i = 1; i <= a; i++){
           longResult *= i;
        }
        return longResult;
    }
    
    public static int sumMToN(int a, int b) {      
        int result1 = 0; // 리턴 타입 초기화 꼭 필요
        for(int i=a; i<=b; i++){
        result1 += i;
        }
        return result1;
    }

    public static void multiplyMToN() {
        
    }
    public static void multiplyNof2() {
        
    }
    public static void guGuDan() {
        
    }
}
