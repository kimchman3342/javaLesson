package object.day6;

import java.util.Arrays;
import java.util.Scanner;

public class B04CartMain {
public static void main(String[] args) {
Cart momos_Cart = new Cart();

        // 모모의 장바구니 - 상품이름, 가격
        String[] products = {"새우깡", "칠성사이다","빅토리아","제주감귤","나주배","호빵","이클립스"};
        int[] prices = {3000,2500,9900,12000,9800,6000,1500};

        // 장바구니 값을 저장합니다.
        momos_Cart.setUserid("momo");
        momos_Cart.setProductNames(products);
        momos_Cart.setPrices(prices);

        Scanner sc = new Scanner(System.in);

        System.out.println(momos_Cart.getUserid() + "님의 장바구니입니다.");
        System.out.println(String.format("%-10s %-20s %-20s\n", "번호","상품명","가격"));

        for(int i = 0; i < products.length; i++){
            System.out.println(String.format("%-10d %-20s %-20d", i, products[i], prices[i]));
        }

        System.out.println("구매할 상품 번호를 선택하세요. 선택 종료는 -1 입니다.");

        int sel = 0;
        int[] select = new int[5];
        int k = 0;  // select 배열 인덱스

        while (sel != -1) {
            System.out.print("상품번호 입력 >>> ");
            sel = sc.nextInt();
            if (sel != -1) {
                select[k] = sel;
                k++;
            }
            System.out.println("선택하신 상품은 : " + Arrays.toString(select));
            System.out.println(momos_Cart.getUserid() + "님이 선택하신 상품 합계 : " + momos_Cart.totalMoney(select));
        }

        momos_Cart.setTotal_money(select);
        System.out.println("선택하신 상품 합계 : " + momos_Cart.getTotal_money());
    }
}