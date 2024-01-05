package object.day5;

import java.util.Random;
import java.util.Scanner;

public class practiceMain1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("게임을 시작하려면 500원을 넣고 '1'을 입력하세요! 😈 ");
        System.out.print("입력하는 곳 >>>>>> ");
        String answer = scanner.nextLine();

        if (answer.equals("1")) {
            startGame();
        } else {
            System.out.println("다음에 오세요 😠");
        }

        scanner.close();
    }

    public static void startGame() {
        Practice1 numb1 = new Practice1();
        Practice1 numb2 = new Practice1();
        Practice1 numb3 = new Practice1();

        Random random = new Random();   // 랜덤랜덤 뉴 랜덤0

        numb1.setNum1(random.nextInt(10) + 1);
        numb2.setNum1(random.nextInt(10) + 1);
        numb3.setNum1(random.nextInt(10) + 1);

        String[] scoArray = new String[3];

        for (int i = 0; i < scoArray.length; i++) {
            int randomNumber = random.nextInt(10) + 1;
            scoArray[i] = String.valueOf(randomNumber);
        }

        numb1.setSco(scoArray);
        numb2.setSco(scoArray);
        numb3.setSco(scoArray);

        System.out.println("\n🤑🤑🤑🤑🤑🤑 파친코 결과 🤑🤑🤑🤑🤑🤑");
        System.out.println("첫 번째 숫자: " + numb1.getNum1() + ", "
                + "두 번째 숫자: " + numb2.getNum1() + ", "
                + "세 번째 숫자: " + numb3.getNum1() + "\n");

        if (numb1.getNum1() == 7 && numb2.getNum1() == 7 && numb3.getNum1() == 7) {
            System.out.println("💚💚💚💚💚당첨입니다!💚💚💚💚💚");
        }
    }
}
