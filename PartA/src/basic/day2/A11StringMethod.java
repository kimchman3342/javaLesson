package basic.day2;

public class A11StringMethod {
    public static void main(String[] args) {

        // 메소드 인자의 개수와 형식에 따라 분류 해보기
        String message = "Hello, World~";
    


        // 1. 메소드 괄호 안에 아무것도 엇는 것. : lenghth, isEmpty, toUpperCase, toLowerCase 
        System.out.println("messeage.lenth() :  " + message.length()); 
        System.out.println("toUpperCase() : " + message.toUpperCase());
        System.out.println("isEmpty() : " + message.isEmpty()); 

        // 2. 메소드 괄호 안에 정수 1개를 쓰는 것.
        System.out.println("message.charAt(0) : " + message.charAt(0));
        System.out.println("message.charAt(3) : " + message.charAt(3));
        System.out.println("message.charAt(4) : " + message.charAt(4));

        // 3. 메소드 괄호안에 문자열 1개를 쓰는 것. : concat, equals, startsWith, emdsWith, indexOf
        System.out.println("message.concat(\"~짱짱\") : " + message.concat(" ~짱짱"));
        System.out.println("message.startsWith(\"hello\") : " + message.startsWith("hello")); // 해당 문자열로 시작하는 메소드인지 검색하는 메소드
        System.out.println("message.startsWith(\"Hello\") : " + message.startsWith("Hello"));
        System.out.println("message.endsWith(\"~\") : " + message.endsWith("~"));
        
        // 문자열 안에서 원하는 단어의 위치를 찾기 -> 시작위치 index 값을 리턴, 단어가 없으면 -1을 리턴
        System.out.println("message.indexOf(\"World\")" + message.indexOf("World"));
        System.out.println("message.indexOf(\"world\")" + message.indexOf("world"));

        // 4. 메소드 괄호 안에 정수 2개를 쓰는 것. : subString
        System.out.println("message.substring(0,4) : " + message.substring(0,4));
        System.out.println("message.substring(2,4) : " + message.substring(2,4) + " (마지막 인덱스는 출력 안함 마지막인덱스 : o)");
        // 결국 추출하는 문자개수는 endIndex - beginIndex

        message = "hello";

        System.out.println("message.equals(\"Hello\") : " + message.equals("Hello"));
        System.out.println("message.equals(\"hello\") : " + message.equals("hello"));

        // 5. 메소드 괄호 안에 문자열 2개를 쓰는 것. : replace
        System.out.println("message.replace(\"ll\",\"****\") : " + message.replace("ll","****"));

        /*질문 공유
         *  메소드 리턴 타입에 따라 결과를 저장할 변수를 일치하는 형식으로 선언하기
         *  String temp = message.toUpperCase().substring(3,5)
         *  System.out.println("message.toUpperCase().substring(3,5) : " + message.toUpperCase().substring(3,5) )
         * 
         *  int len = message.lenghth();
         *  char ch = message.charAt(5);
         */
        

        // 리턴 값 형식을 기준으로 정리하기
        //boolean : booleanValue(), compareTo(), toString(), parseBoolean(), valueOf()
        //string : replace(), substring(), toLowerCase(), concat()
        //int : lenghth(), indexOf()
        //char : charAt()


    }
    
}
