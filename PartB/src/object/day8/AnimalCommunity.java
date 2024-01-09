package object.day8;


public class AnimalCommunity {

	public static void main(String[] args)  {
		System.out.println("~~~~~ 여기는 유기동물 분양소입니다. ~~~~~");
			Animal[] animals = new Animal[10];
			animals[0] = new Puppy("푸들이","브라운");
			animals[1] = new Cat("그레이");
			animals[2] = new Rabbit();
			animals[2].setColor("화이트");
			animals[3] = new Puppy("말티즈","화이트");

			System.out.println("\n[[반려동물 목록을 보여드리겠습니다.]] \n");
			for(int i=0;i<animals.length;i++) {
				if(animals[i]!= null)
					animals[i].sound();
			}	
			
	//	모모회원이 동물 보호소의 모든 동물들을 분양 받을 수 있는지 셀프 체크
	//	강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다.			
		
		String name="모모";
		int age = 17;
	    Member member = new Member(age, name);
		
		StringBuilder sb = new StringBuilder(name);
		sb.append(" 회원님 \n");
		boolean result;
		for(int i=0;i<animals.length;i++) {
			if(animals[i]==null) break;	
			 result =member.isAdopt(animals[i]);
			 sb.append(animals[i].toString());
			if(result) {
				sb.append("  😃 분양 가능합니다. \n");
			} else {
				sb.append("  😓 분양 자격이 안됩니다.\n");
			}
		}
		System.out.println();
		System.out.println(sb.toString());

	}//main end
	
}







