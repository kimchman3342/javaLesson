package myexam;

import java.util.Random;
import java.util.Scanner;

public class Review1 {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1;
        int dice2;
        
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while(run) {
            System.out.print("🎲 > ");
            dice1 = sc.nextInt();
            dice2 = random.nextInt(6) + 1;
            
            int sum = dice1 + dice2;
            System.out.println("🎲 1 결과 : " + dice1);
            System.out.println("🎲 2 결과 : " + dice2);
            System.out.println("🎲🎲 : " + sum);
            
            if (sum % 2 == 0) {
                System.out.println("짝수입니다. 반복문을 탈출합니다.");
                break;
            } else {
                System.out.println("홀수입니다. 다시 굴립니다.");
            }
        }
    }
}
