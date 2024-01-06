package object.myexam2;

import java.util.Arrays;
import java.util.Scanner;

public class AddQuizMainBrother {

    public static void main(String[] args) {



        // System.out.println(" 난수(컴퓨터가 만들어주는 임의 값) - random");
        // System.out.println(" 난수값을 만들어주는 방법은 Math.random()");
        // System.out.println(" 0~1 사이의 double 실수를 무작위로 만들어줍니다.");
        // System.out.println("Math.random() = " + Math.random());
        // System.out.println("Math.random() = " + Math.random());
        // System.out.println("Math.random() = " + Math.random()); 
        // 0 < 난수 < 1    => 로또 값처럼 1 <= 로또번호 <= 45
        //  원래 난수값 범위에 *45를 하고       0 < 난수*45 < 45   
        //  그 값에 다시 +1 하면 됩니다.        1 < 난수*45+1 < 46
        //  난수의 범위를 start ~ end 범위로 조정하려면
        //  (int)(Math.random()*(end-start+1))+start

        Scanner sc = new Scanner(System.in);
        AddQuizBrother quiz = new AddQuizBrother();
        int[] d1 = new int[3];
        int[] d2 = new int[3];
        int[] answer = new int[3];
        boolean[] ok= new boolean[3];
        

        System.out.println("\n덧셈 문제를 시작합니다.");
        int start=11;
        int end=99;
        
        for(int i=0; i<answer.length; i++){
            int temp1 = (int)(Math.random()*(end-start+1))+start;
            int temp2 = (int)(Math.random()*(end-start+1))+start;
            System.out.println(String.format("\n%d번) %d+%d= ?",(i+1),temp1,temp2));
            System.out.print("답을 입력해 주세요 > ");
            quiz.setData1(temp1);
            quiz.setData2(temp2);
            quiz.setUserAnswer(sc.nextInt());
            d1[i] = quiz.getData1();
            d2[i] = quiz.getData2();
            answer[i] = quiz.getUserAnswer();
            ok[i] = quiz.isRight();
        }

        // System.out.println(Arrays.toString(d1));
        // System.out.println(Arrays.toString(d2));
        // System.out.println(Arrays.toString(answer));
        // System.out.println(quiz.getData1());


        System.out.println("ㅡㅡㅡㅡㅡ채점 중입니다.ㅡㅡㅡㅡㅡ");
        System.out.println("\t문제\t제출한 답\t정답\t채점");
        for(int i=0; i<answer.length; i++){
            System.out.print(String.format("%d번.\t%d+%d\t%d\t\t%d", i+1, d1[i],d2[i],answer[i],(d1[i]+d2[i])));
            if (ok[i]==true)System.out.println("\tO");
            else System.out.println("\tX");
        }






        

    }
    
}
