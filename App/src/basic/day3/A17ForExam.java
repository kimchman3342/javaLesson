package basic.day3;

public class A17ForExam {
    public static void main(String[] args) {
        // 반복문 for가 활용되는 예시
        String message = "Hello, World~ Hoi";

        System.out.println("1.문자열 길이 만큼 문자 1개를 추출하는 반복문 실행하기");
        for(int i=0; i<message.length(); i++) { 
            // i =0 초기화; i<문자열길이 조건식; 반복할 때 마다 i++
           char temp = message.charAt(i);
           System.out.println(""+temp);
        }   //for end

        // for문을 while로 바꿔서 실행.
        int k = 0;
        while( k < message.length()){
            char temp = message.charAt(k);
            System.out.println("k = " + k + ", 문자 = " + temp);
            k++ ;
        }

        System.out.println("\n2.문자열 길이 만큼 반복문 실행하면서 if 조건문으로 문자열 검사하기");
        System.out.println("\t문자열에서 알파벳 o의 개수를 구해봅시다");
        int count = 0;
        for(int i=0; i<message.length(); i++) { 
            // i =0 초기화; i<문자열길이 조건식; 반복할 때 마다 i++
           char temp = message.charAt(i);
           if(temp == 'o') 
           count ++;
        }   //for end
        System.out.println("o의 총 개수" + count);
        
        

    }   // main end
}   // Class end