package object.myexam2;

import java.util.Arrays;
import java.util.Scanner;

public class AddQuizMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        AddQuiz quiz = new AddQuiz();
        int[] an1 = new int[10];
        int[] an2 = new int[10];
        int[] usan = new int[10];
        boolean[] right = new boolean[10];

        

        
        
        

        System.out.println("\n덧셈 10문제 퀴즈를 시작합니다.");
        
        int start = 11; int end = 99; 
        
        for(int i = 0; i <usan.length; i++) {
            int temp1 = (int)(Math.random()*(end-start+1)) + start;
            int temp2 = (int)(Math.random()*(end-start+1)) + start;
            
           
            System.out.println(String.format("\n%d번) %d+%d= ?",(i+1),temp1,temp2));
            System.out.print("답을 입력하세요. >>>");

            quiz.setData1(temp1);
            quiz.setData2(temp2);
            quiz.setUserAnswer(sc.nextInt());                
            an1[i] = quiz.getData1();
            an2[i] = quiz.getData2();
            usan[i] = quiz.getUserAnswer();
            right[i] = quiz.isRight();
            
            
        }
       

            System.out.println("::::: 채점하고 있습니다.:::::\n");

            System.out.println("\n::::: 맞은 개수 " + "입니다.:::::\n");
            System.out.println("\t문제\t제출한 답\t정답\t채점");

            for(int i = 0; i < usan.length; i++){
                System.out.print(String.format("\n%d번. \t%d+%d\t%d\t\t%d", i + 1, an1[i], an2[i],usan[i],(an1[i]+an2[i])));
                if(right[i] == true)System.out.println("\t⭕️");
                else System.out.println("\t❌");
            }
        
    }
    
}
