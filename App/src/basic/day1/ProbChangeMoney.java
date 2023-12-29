// Source code is decompiled from a .class file using FernFlower decompiler.
package basic.day1;

public class ProbChangeMoney {
   public ProbChangeMoney() {
   }

   public static void main(String[] args) {
      int myWon = 1000000;
      int cost = 98760;
      double yenTowonRate = 9.29;
      double wonToyenRate = 8.97;
      double toYen = (double)myWon / yenTowonRate;
      int myYen = (int)toYen - cost;
      double toWon = (double)myYen * wonToyenRate;
      System.out.println(" ");
      System.out.println("::: \ud55c/\uc77c 23.12.28 \uae30\uc900 \ud658\uc728 :::");
      System.out.println("\uc0b4 \ub54c 1\uc5d4 = " + yenTowonRate);
      System.out.println("\ud314 \ub54c 1\uc5d4 = " + wonToyenRate);
      System.out.println(" ");
      System.out.println("::: \uc6d0\ud654\ub97c \uc5d4\ud654\ub85c \ud658\uc804\ud558\uae30 :::");
      System.out.println("\ud658\uc804\ud560 \uc6d0\ud654\ub294 " + toYen + "\uc6d0 \uc785\ub2c8\ub2e4.");
      System.out.println("\uc6d0\ud654\ub97c \uc5d4\ud654\ub85c \ubc14\uafc0 \ub54c : " + myWon + "\uc6d0");
      System.out.println(" ");
      System.out.println("::: \uc5d4\ud654\ub97c \uc6d0\ud654\ub85c \ud658\uc804\ud560 \uacbd\uc6b0 :::");
      System.out.println("\uc77c\ubcf8\uc5d0\uc11c \uc0ac\uc6a9\ud55c \uae08\uc561\uc740 " + cost + "\uc5d4 \uc785\ub2c8\ub2e4.");
      System.out.println("\ub0a8\uc740 \uc5d4\ud654\ub294 \uc5bc\ub9c8\uc778\uac00\uc694? " + myYen + "\uc5d4");
      System.out.println("\uc5d4\ud654\ub97c \uc6d0\ud654\ub85c \ubc14\uafc0 \ub54c : " + toWon + "\uc6d0");
   }
}
