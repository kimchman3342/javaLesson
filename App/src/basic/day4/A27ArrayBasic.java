package basic.day4;

import java.util.Arrays;

//배열 기본
public class A27ArrayBasic {
	
	public static void main(String[] args) {
		
		//int age=23;  과 같은 변수선언 1개당 1개의 메모리 할당.
		
		//배열은 여러개의 데이터를 저장할 수 있는 변수.  저장할 데이터의 형식/이름/데이터의 개수(할당 받는 메모리 크기)를 선언해야 함.
		int[] arr1 = {34,56,78,89,65};		//저장할 값 초기화 //인덱스는 0부터 4
						
		
		int[] arr2 = new int[10];		//초기값은 기본값 0 , 정수 10개 (40바이트 할당), 인덱스 0~9
		
		//배열의 주요 속성 : length 는 배열의 길이(개수)를 갖습니다.
		System.out.println("==인덱스 직접 지정해서 배열 요소값 출력하기 ==");
		System.out.println("i=0, arr1[0]=" + arr1[0]);
		System.out.println("i=1, arr1[1]=" + arr1[1]);
		System.out.println("i=2, arr1[2]=" + arr1[2]);
		System.out.println("i=3, arr1[3]=" + arr1[3]);
		System.out.println("i=4, arr1[3]=" + arr1[4]);
		
		//배열에 저장된 값은 성적,포인트,이름 등등 같은 의미를 갖는 데이터들이며 따라서 처리 해야할 동작도 같습니다. => 반복문 필수
		System.out.println("\n~~~~~1. 반복문으로 배열 요소값 출력하기 ~~~~~");
		
		System.out.println("\n~~~~~2. arr1 배열의 합계 구하기 ~~~~~");
		System.out.println("\n~~~~~3. arr1 배열의 70이상 값 개수 구하기 ~~~~");
		
		
		System.out.println("\n~~~~~4.arr2배열에 키보드 입력으로 값 저장하기~~~~~");
		
				
		
		
	}
}
