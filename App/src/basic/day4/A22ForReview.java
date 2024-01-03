package basic.day4;

// for문 복습 :1) ~ 5) 까지 구현. 6) 구구단 출력하기 (for in for)
public class A22ForReview {
    public static void main(String[] args) {
        int m;
        int n;
        int sum = 0;
        int result = 1; //곱셈 결과를 저장할 변수
        

        /* 1) 1부터 정수 n 까지 더하기 */
        n = 10;
       
        for(int i = 1; i <= n; i ++){
            sum += i;   //sum = sum + i;
        }
        System.out.println(String.format("문제 1 ) 1부터 %d 까지의 합계 : %d ", n, sum));
        System.out.println("문제 1) 1부터 " + n + " 까지의 합계 : " + sum);   
        
        /*2) 1부터 정수 n 까지 곱하기*/
        n = 15;     
        //int 타입은 정수 -2147483648 ~ +2147483647 그래서 곱셈결과 큰 값이 나올 것을 예상하면 long 타입으로 합니다.
        //              n = 20으로 int result에 결과를 저장하면 - 음수 값이 나옵니다.(오버플로우)
        long longResult = 1;
        for(int i = 1; i <= n; i++){
           longResult *= i;
        }
         System.out.println(String.format("문제 2 ) 1부터 %d 까지의 곱 : %d ", n, longResult));

        //3) 시작 값 정수 m 부터 마지막 값 n까지 더하기
        m = 5; n = 8;
        sum = 0; // 리턴 타입 초기화 꼭 필요
        for(int i=m; i<=n; i++){
        sum += i;
        }
        System.out.println(String.format("문제 3 ) &d부터 %d 까지의 더하기 : %d ", m, n, sum));

        //4) 시작 값 정수 m 부터 마지막 값 n까지 곱하기
        m = 5; n = 8;
        longResult = 1;
        for(int i=m; i<=n; i++){
            longResult  *= i;
        }
        System.out.println(String.format("문제 4 ) %d부터 %d 까지의 곱 : %d ", m,n,longResult));
        
       
        //5) 2의 n승 구하기 : 2를 n번 곱하기 (2진수에서는 많이 사용되는 연산)
        n = 4;
        longResult = 1;
        for(int i = 1; i <= n; i++){
        longResult *= 2;
        }
        System.out.println(String.format("문제 5 ) 2의 %d승 구하기 : %d ", n, longResult));
    
    }
}