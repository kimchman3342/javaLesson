package basic.day3;

// if ~ else if ~ else if ~ ....
public class A18IfElseIfTest {

	public static void main(String[] args) {
		
		int menu;

		System.out.println(":::: 쇼핑몰 사용자 마이페이지 ::::");
		System.out.println("1:장바구니   2:찜 상품   3.배송 조회   4.구매 목록  5.종료");
		System.out.print("선택 하세요. >>>> ");
		
		menu = 1;
		
		//동일한 값인지 비교 : 관계연산자 == 또는 != 
		if(menu==1) {
			System.out.println("장바구니 🎁🎁🎁🎁 .많이 담아 주세요.");
		}else if(menu ==2) {
			System.out.println("찜 상품 입니다.❤❤");
		}else if(menu ==3) {
			System.out.println("배송 조회🚚🚛🚚🚛 ");
		}else if(menu ==4) {
			System.out.println("구매 목록 입니다.");
		}else if(menu ==5) {
			System.out.println("종료 입니다.");
			// menu 변수 값이 1,2,3,4,5 중 하나의 값이 아닐 때
		}else {
			System.out.println("잘못된 선택 입니다.");
		}
		
		System.out.println("메뉴 선택 종료합니다.");

		int jumsu = 3;
		String grade;

		// 유효한 점수 데이터인지 검사합니다.
		if (jumsu > 100 || jumsu < 0) {
			System.out.println("점수는 0~100 사이의 정수 값 입니다.");
			return;		//main 결과를 반환. 프로그램 종료가 됩니다.
			
		}

		// grade 구하기 = 점수가 100~90 점 :'A', 80~89 점 :'B', 70~79 점 :'C' ,60~69 점 'D', 60점 미만 : 'F'

		//100점 보다 큰 값은 일단 제외하고 간단하게 예시
		if(jumsu >= 90) grade = "A";
		else // 점수가 90점보다 작은 값
			if(jumsu >= 80) grade = "B";
		else // 점수가 80점보다 작은 값
			if(jumsu >= 70) grade = "C";
		else // 점수가 70점보다 작은 값
			if(jumsu >= 60) grade = "D";
		else // 점수가 60점보다 작은 값
			grade = "F";

		System.out.println("점수: " + jumsu + ", 학점: " + grade);
			
			
	
		
		
	}

	@Override
	public String toString() {
		return "A18IfElseIfTest []";
	}
	
}

