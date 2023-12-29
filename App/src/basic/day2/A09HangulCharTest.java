package basic.day2;

public class A09HangulCharTest {
    public static void main(String[] args) {
        char start = '나';
        char end = '낟';
        int codeNa = start;     // codeNa는 '나'의 코드 값이 들어감
        int codeNet = end;

        while (start<=end) {
            System.out.print(start++);
        
        }

        System.out.println("\n\n'나'부터 '낟'까지의 총개수 : " + (codeNet - codeNa + 1));

        System.out.println(("start = ???") + start);
        
            
        }
       
    }
    
