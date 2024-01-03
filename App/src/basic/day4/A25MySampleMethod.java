package basic.day4;
// A25 소스파일은 구글 드라이브에 올려주세요.

public class A25MySampleMethod {
    // A22번 1) ~ 5) 을 각각 메소드로 정의해보기
        // 1) sum1ToN   2) multiply1ToN 3)sumMToN  4) multiplyMToN 5)multiplyNof2
        // 6) 구구단 '출력'하는 메소드. 리턴은 void.printGuguDan

    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        
        System.out.println("\n-------------------------------");
        System.out.println("       A22번 메서드 정의");
        System.out.println("-------------------------------");
        
        System.out.println("\n1) 1부터 정수 n 까지 더하기 : " + sum1ToN(n));
        System.out.println("\n2) 1부터 정수 n 까지 곱하기 : " + multiply1ToN(n));
        System.out.println("\n3) 시작 값 정수 m 부터 마지막 값 n까지 더하기 : " + sumMToN(m,n));
        System.out.println("\n4) 시작 값 정수 m 부터 마지막 값 n까지 곱하기 : " + multiplyMToN(m,n));
        System.out.println("\n5) 2의 n승 구하기 : 2를 n번 곱하기 : " + multiplyMToN(m,n));
        printGuguDan();
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
    
    public static int sumMToN(int a, int b) {      //3) 시작 값 정수 m 부터 마지막 값 n까지 더하기 
        int result1 = 0; // 리턴 타입 초기화 꼭 필요
        for(int i=a; i<=b; i++){
        result1 += i;
        }
        return result1;
    }

    public static long multiplyMToN(long a, long b) {   //4) 시작 값 정수 m 부터 마지막 값 n까지 곱하기
        long longResult = 1;
        for(long i=a; i<=b; i++){
            longResult  *= i;
        }
        return longResult;       
    }


    public static long multiplyNof2(long a) {      //5) 2의 n승 구하기 : 2를 n번 곱하기 (2진수에서는 많이 사용되는 연산)
        long longResult = 1;
        for(int i = 1; i <= a; i++){
        longResult *= 2;
        }
        return longResult;
        
    }
    public static void printGuguDan() {      //6) 구구단
        for(int i = 2; i <= 9; i++) {            
            for(int j = 1; j <= 9; j++){    //(1부터 9까지 반복) 
                System.out.println(String.format("\n6) 2~9단 %3d x %3d = %3d", i,j,i * j));              
            }
            
         }        
    }
}
