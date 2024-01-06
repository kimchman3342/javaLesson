package object.myexam2;

import java.util.Scanner;

public class AddQuizMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        AddQuiz an1 = new AddQuiz();
        AddQuiz an2 = new AddQuiz();
        AddQuiz usan = new AddQuiz();

        

        
        
        

        System.out.println("덧셈 10문제 퀴즈를 시작합니다.");
        
        int start = 11; int end = 99; int sum;
        for(int i = 0; i <10; i++) {
            int temp1 = (int)(Math.random()*(end-start+1)) + start;
            int temp2 = (int)(Math.random()*(end-start+1)) + start;
            sum = temp1 + temp2;
           
            System.out.println(String.format("\n%d번) %d+%d= ?",(i+1),temp1,temp2));
            System.out.println("답을 입력하세요. >>> " +  sc.nextInt());
            
            
        }
       

            System.out.println("\n::::: 채점하고 있습니다.:::::\n");
            

            System.out.println("\n::::: 맞은 개수 " + "입니다.:::::\n");
        
    }
    
}
