// Source code is decompiled from a .class file using FernFlower decompiler.
package basic.day1;

public class ProbChangeMoney {
   public ProbChangeMoney() {
   }

   public static void main(String[] args) {
      int myWon = 1000000;
      int cost = 98760;
      double yenToWonRate = 9.29;
      double wonToYenRate = 8.97;
      double toYen = (double)myWon / yenToWonRate;
      int myYen = (int)toYen - cost;
      double toWon = (double)myYen * wonToYenRate;
      System.out.println(" ");
      System.out.println("::: 한/일 23.12.28 기준 환율 :::");
      System.out.println("살 때 1엔당 = " + yenToWonRate);
      System.out.println("팔 때 1엔당 = " + wonToYenRate);
      System.out.println(" ");
      
      System.out.println("::: 환전을 돈으로 표현하기 :::");
      System.out.println("환전된 돈은 " + toYen + "엔 입니다.");
      System.out.println("환전한 금액 : " + myWon + "원");
      System.out.println(" ");
      System.out.println("::: 돈을 환전으로 표현하기 :::");
      System.out.println("일반적으로 사용한 금액은 " + cost + "원 입니다.");
      System.out.println("사용하고 남은 엔화 " + myYen + "엔");
      System.out.println("남은 돈을 다시 원화로 바꿀 때 : " + toWon + "원");
   }
}
