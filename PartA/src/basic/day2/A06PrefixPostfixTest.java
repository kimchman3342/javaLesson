package basic.day2;

public class A06PrefixPostfixTest {
	
	public static void main(String[] args) {
		
		int start =100;
		
		//증가 또는 감소연산자 (증감연산)는 다른 명령문과 같이 쓰일때 위치가 중요합니다.
		// start++ 또는 ++start는 start = start +1 ; 연산을 합니다. 간단하게 증가연산
		// 너무 많이 사용되는 +1 또는 -1은 더 간단하게 증감연산 ++, -- 사용합니다



		System.out.println("== postfix 확인 (출력 후에 +1)==");
		System.out.println(start--);		
		System.out.println(start--);		
		System.out.println(start--);	
		System.out.println(start--);		
			
		start = 100;
		System.out.println("== prefix 확인 (+1 후에 출력) ==");
		System.out.println(--start);		// +1 후에 출력
		System.out.println(--start);		// +1 후에 출력
		System.out.println(--start);		// +1 후에 출력
		System.out.println(--start);		// +1 후에 출력
	
	}
}