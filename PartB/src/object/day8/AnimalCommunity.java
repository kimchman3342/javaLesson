package object.day8;


public class AnimalCommunity {

	public static void main(String[] args)  {
		System.out.println("~~~~~ 여기는 유기동물 분양소입니다. ~~~~~");
			Animal[] animals = new Animal[10];
			// result =  member.isAdopt(animals[i]);	// 인자를 animal 타입으로 전달받는 메소드 (다형성)
			animals[0] = new Puppy("푸들이","브라운");
			animals[1] = new Cat("그레이");
			animals[2] = new Rabbit();
			animals[2].setColor("화이트");
			animals[3] = (new Puppy("말티즈","화이트"));
			
			// 퀴즈 : 아래 객체를 배열 요소에 대입합니다. 수정이 필요한 코드는?
			animals[7] = new Animal(){
			public static final String TYPE = "새";
			
			@Override
			public void sound(){
			System.out.println(" 앵무새는 안녕~~ 하고 말합니다.");
			}
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return TYPE + "[ color = " + color + ", name = " + name + "]";
			}
		};
			

			System.out.println("\n[[반려동물 목록을 보여드리겠습니다.]] \n");
			for(int i=0;i<animals.length;i++) {
				if(animals[i]!= null)		// 배열요소에 참조되는 객체가 있는지(참조 값이 있는지) 검사
					animals[i].sound();	// null일 때 메소드 실행하면 오류 (재정의 필요)
			}	
			
	//	모모회원이 동물 보호소의 모든 동물들을 분양 받을 수 있는지 셀프 체크
	//  동물 보호소 규정(비즈니스 로직)
	//				ㄴ 강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다. 그 외에는 20세 이상 분양받을 수 있습니다.
	//				ㄴ Member 클래스 isAdopt 메소드에서 실행. -> intanceof 연산 사용		
		
		String name="모모";
		int age = 17;
	    Member member = new Member(age, name);	// Member 클래스 인스턴스 필드는 age,name 2개
		
		StringBuilder sb = new StringBuilder(name);	// String은 문자열 연결 결과 다른 문자열이 나오면 객체 새로만들어서 저장
		// String은 불변객체(문자열 변경 못함)
		// StringBuilder 는 가변 객체 (문자열 변경 가능. 문자열 추가연산 결과를 동일 객체에 저장)	=> 문자열 연결 연산에 사용
		sb.append(" 회원님 \n");	// message += " 회원님 \n";
		boolean result;
		for(int i=0;i<animals.length;i++) {
			// break는 null만나면 break
			if(animals[i]==null) continue;		// null 만나면 다음 명령어들 실행 안하고  for문 i++부터 다시 시작
			 result =member.isAdopt(animals[i]);	// 인자를 Animal 타입으로 전달받는 메소드(다형성)
			 sb.append(animals[i].toString());		// message += animal[i].toString();
			if(result) {
				sb.append("  😃 분양 가능합니다. \n");		// message += " 😃 분양 가능합니다. "
			} else {
				sb.append("  😓 분양 자격이 안됩니다.\n");

			/* 삼항연산자 
			String temp = member.isAdopt(animals[i]) ? "분양 가능합니다.\n" : "분양 자격이 안됩니다\n";
			sb.append(temp); */
			}
		}
		System.out.println();
		System.out.println(sb.toString());	// StringBuilder 타입 객체는 println의 인자로 쓸 때 toString 생략 가능

	}//main end
	
}







