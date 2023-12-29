package basic.day2;

public class A10StringVariable {
    public static void main(String[] args) {
        //String 은 문자열 : 문자('')의 집합
        String message = "Hello~ 안녕!! 하이하이";

        System.out.println("메세지 '" + message + "'의 길이 : " + message.length());


        message = "welcome~ java world!!!!";
        System.out.println("메세지 '" + message + "'의 길이 : " + message.length());

        // String 으로 선언된 변수는 '객체' 입니다.
        // 그래서 여러가지 메소드를 갖고 필요한 기능들을 제공해 줍니다.


        // char imo = '😊'; //char은 2바이트, 이모지는 4바이트. 쓰면 오류
        String imo = "😂";

        System.out.println(message);
        System.out.println(imo);

        // 자바 String의 중요한 메소드 7가지씩 조사해서 테스트 해보기
        

        // 1. 메소드 괄호 안에 아무것도 엇는 것. 
        System.out.println("\n\nisEmpty() : 문자열이 비어있는지 확인한다. \n 결과 :  " + message.isEmpty()); 
        System.out.println("toCharArray() : 문자열의 각 문자를 char[]에 담아 반환한다. \n 결과 :" + message.toCharArray());  
        System.out.println("toUpperCase() : 모든 문자열을 대문자/소문자(Upper/Lower)로 변경한다. \n 결과 :" + message.toUpperCase());
        
        // 2. 메소드 괄호 안에 정수 1개를 쓰는 것.
        System.out.println("charAt() : 문자열의 n번째 문자를 반환한다. \n 결과 : " + message.charAt(3));  
        System.out.println(message.lastIndexOf(3)); //문자열의 마지막 인덱스를 기준으로 첫번째 인덱스까지 검색하여 특정 문자가 위치한 인덱스를 반환다.
        

        // 3. 메소드 괄호안에 문자열 1개를 쓰는 것.
        System.out.println(message.concat("friends~~!!@"));  //두개의 문자열을 합쳐서 반환한다.
        

        // 4. 메소드 괄호 안에 정수 2개를 쓰는 것.
        System.out.println(message.substring(3,6)); //beginIndex부터 endIndex -1 사이에 위치한 String을 반환한다.
        System.out.println(message.split("",3)); //문자열을 특정 문자를 기준으로 나눈다.

        // 5. 메소드 괄호 안에 문자열 2개를 쓰는 것.
        System.out.println(message.replace("w","f")); //특정 문자열을 검색해 특정 문자열로 변경한다.
       
        
        


        
    }
    
}
