package myexam;


public class HomeStringFormat {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // 주말과제 : String.format() 에 대한 예제를 작성하고 실행도 해보세요.
        // 예제 : String.format()메서드와 유니코드를 활용하여 광복절 날짜를 출력하기.

        
        char month = '\u0038';
        char day = '\u0031';
        char day2 = '\u0035';
        
        System.out.println("\n 주말과제 정답 : ");
        String str1 = String.format("광복절 날짜: %s월%s"+"%s일", month, day, day2);
        System.out.println(str1);

        
        
     

        // 1. 기본 자료형의 크기 순서를 작은것 부터 차례대로 출력하시오. (부등호 사용)
        System.out.println("\n 1번문제 정답 : boolean(1bit) < byte(1byte) < char( 2byte) = short(2byte) < int(4byte) = float(4byte) < long(8byte) = double(8byte)");
            
        
        //  2. 반복문을 사용하여 100부터 50까지 나열하시오 System.out.print()사용
        
        int start = 100;
        int end = 50;
        System.out.println("\n 2번문제 정답 : ");

       while (end<=start) {
        System.out.print(" " + start--);
        
       }
        
       

        //  3. toUpperSize() 메소드를 사용하여 "KOREA IT academy (강남)"를 출력하시오.
        String contry = "koera";
        String name = "it";
        

        System.out.println("\n\n 3번문제 정답 : " + contry.toUpperCase() + " " + name.toUpperCase() + " academy (강남)" );

        //  4. length() 메서드를 이용해 '내 과제 수'의 글자수를 출력하시오.
        String word = "내 과제 수";
        System.out.println("\n 4번정답 : 내 과제수는 " + word.length() + "개");


        //  5. relpace() 메소드를 사용하여 'lively weak'을 'lively week'로 바꿔서 출력하시오. 

        String message = "lively weak";
        System.out.println("\n 5번문제 정답 : " + message.replace("weak","week"));

         
        
        

     }
    
    }

