package object.test;

import object.day7.Diamond;

public class B11DiamondTest {
    public static void main(String[] args) {
        
        Diamond diamond = new Diamond();

        System.out.println("다이아몬드 너비 : " + diamond.getWidth());
        System.out.println("다이아몬드 높이 : " + diamond.getHeight());
        System.out.println("다이아몬드 넓이 : " + diamond.calculateArea());
/* 
        diamond.round = 3;      // B11DiamondTest는 상속 받은 자식 클래스가 아님.
        diamond.etc = "테스트";     // Shape과 같은 패키지가 아님.
        System.out.println("변경된 내용 확인 : " + diamond.round);
        System.out.println("변경된 내용 확인 : " + diamond.etc); */
    }
    
}
