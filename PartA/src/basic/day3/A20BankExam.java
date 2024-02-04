package basic.day3;

import java.util.Scanner;

import java.text.DecimalFormat;

public class A20BankExam {
    public static void main(String[] args) {
        int menu;
        int money; // 입금액 또는 출금액
        int balance = 0; //잔액
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        // 세자리마다 컴마 찍기 : 아직 배운 진도가 아니지만 일단은 사용하기
        DecimalFormat df = new DecimalFormat("#,###");
        

        while(run){
            System.out.println("--------------------------------");
            System.out.println(" 1:예금 | 2:출금 | 3:잔액 | 4:종료 ");
            System.out.println("--------------------------------");
            System.out.print("메뉴를 선택해주세요(1,2,3,4 중 선택) >> ");
            menu= sc.nextInt();
            
            
            


            switch (menu) {
                case 1:
                    System.out.println("예금액 입력> ");
                    money = sc.nextInt();
                    balance += money;
                    System.out.println("고객님의 잔액은 " + df.format(balance) + "입니다.💵");
                    break;
                case 2:
                    System.out.println("출금액 입력> ");
                    money = sc.nextInt();
                    balance -= money;
                    
                    if(money <= balance) 
                        balance -= money;
                    else{
                        System.out.println("고객님의 잔액이 출금액보다 부족합니다.😢");
                    break;
                    }

                    System.out.println("고객님의 잔액은 " + df.format(balance) + "입니다.🤗");

                    
                    
                    break;
                case 3:
                    System.out.println("현재잔고" + balance + "원 입니다.💵");   
                    break;
                case 4:
                    System.out.println("이용해 주셔서 감사합니다.!🙂");
                    run = false;
                    break;
                
                default:
                    System.out.println("잘못된 선택입니다. 1~4만 선택해주세요");
                    break;
            }

        }
        System.out.println("------------프로그램을 종료합니다.🍎-------------");
        ////
    }

}
