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

        System.out.println("\n-------------------------------");
        System.out.println(" 🏝 무인도 탈출하기🏝 ");
        System.out.println("-------------------------------\n");

        while (run) {
            System.out.println("\n\n🎲 주사위 굴리기 🎲  ");
            System.out.print(">>>>>>> ");
            
            dice1 = sc.nextInt();
            dice2 = random.nextInt(6) + 1;

            if (dice1 > 6) {
                System.out.println("❌❌6을 넘는 숫자는 사용할 수 없습니다.❌❌");
                continue; // 다시 반복문의 처음으로 돌아감
            }

            int sum = dice1 + dice2;
            

            if (dice1 == dice2) {
                System.out.print("\n굴린 주사위  >>>>>>> " + dice1);
                System.out.println("\n-------------------------------");
                System.out.println("🎲 주사위 1 🎲: " + dice1);
                System.out.println("🎲 주사위 2 🎲: " + dice2);
                System.out.println("🎲 주사위 합계 🎲: " + sum);
                System.out.println("-------------------------------");
                System.out.println("🎉🎉~더블입니다! 무인도를 탈출합니다~🎉🎉");
                break;
            } else if((sum % 2) != 1 ){
                System.out.print("\n굴린 주사위  >>>>>>> " + dice1);
                System.out.println("\n-------------------------------");
                System.out.println("🎲 주사위 1 🎲: " + dice1);
                System.out.println("🎲 주사위 2 🎲: " + dice2);
                System.out.println("🎲 주사위 합계 🎲: " + sum);
                System.out.println("-------------------------------");
                System.out.println("\n🤪🤪 짝수입니다. 다시 굴려주세요.🤪🤪");
            } else if((sum % 2) != 0 ){
                System.out.print("\n굴린 주사위  >>>>>>> " + dice1);
                System.out.println("\n-------------------------------");
                System.out.println("🎲 주사위 1 🎲: " + dice1);
                System.out.println("🎲 주사위 2 🎲: " + dice2);
                System.out.println("🎲 주사위 합계 🎲: " + sum);
                System.out.println("-------------------------------");
                System.out.println("\n🤪🤪  홀수입니다. 다시 굴려주세요.🤪🤪");               
            }
            

        }
    }
}
