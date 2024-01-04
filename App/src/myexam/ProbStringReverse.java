package myexam;


/* message 문자열이 "Hello World" 일 때 문자열을 뒤집기
 * char[] 배열 사용해서 도전!!!
 */

public class ProbStringReverse {
    public static void main(String[] args) {
        String message = "Hello World";     // length : 11 , index : 0 ~ 10
        char[] messageArray = new char[message.length()];

        for(int i = messageArray.length-1; i >= 0; i-- ) {
            char temp = message.charAt(i);
            System.out.println(temp);
            messageArray[message.length()-1-i] = temp;
        }
        
        
        System.out.print(messageArray);
        System.out.println(" 😀");

        
        
        
        
        // 다른 방법
        int cidx = message.length() - 1;    //10
        for(int i = 0; i < message.length(); i++){
            char temp = message.charAt(i);     // i = 0 일 때
            messageArray[cidx] = temp;         // cidx = 10입니다.
            // i = 1 일 때, cidx = 9       
            // i = 2 일 때, cidx = 8
            cidx--;//cidx 변수 없이 사용할 공식 찾아보세요.
        }  
         
        System.out.print("\nHello World 거꾸로 뒤집기 ♻♻♻  ");
        System.out.println(messageArray);
        
    }
    
}
