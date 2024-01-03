package myexam;


/* message 문자열이 "Hello World" 일 때 문자열을 뒤집기
 * char[] 배열 사용해서 도전!!!
 */

public class ProbStringReverse {
    public static void main(String[] args) {
        String message = "Hello World";
        char[] messageArray = new char[message.length()];

        for(int i = messageArray.length-1; i >= 0; i-- ) {
            char temp = message.charAt(i);
            System.out.println(temp);
            messageArray[message.length()-1-i] = temp;
        }
        
        System.out.print("\nHello World 거꾸로 뒤집기 ♻♻♻  ");
        System.out.print(messageArray);
        System.out.println(" 😀");
        
    }
    
}
