package basic.day4;

    // 프로그램을 실행시키는 main이 static 이므로 여기서 같이 사용할 수 있는 다른 static 메소드 연습을 해봅시다.

public class A24StaticMethod {
    public static void main(String[] args) {
        argumentTest();         //메소드 호출. 이름과 형식이 맞는 메소드를 찾아서 실행시킵니다.
        argumentTest(999);
        argumentTest(100,333);
        
        
        
      
    }
      // 1~4 리턴은 없습니다. 인자로 선언된 () 안의 변수는 메소드의 지역변수 입니다.   
      // 1) 인자 값 없는 메소드
         public static void argumentTest() {
        System.out.println("\n인자 값이 없는 메소드입니다.");
    }
        // 2) 인자가 1개 있는 메소드
         public static void argumentTest(int i) {
        System.out.println("\n*인자가 1개 정수 " + i + "입니다.");
    }
        // 3) 인자가 2개 있는 메소드
        public static void argumentTest(int i, int j) {
        System.out.println("\n**인자가 2개인 정수 i = " + i + ",j = " + j);
        System.out.println("                    i + j = " + (i + j));
    }
        // 4) 리턴 값이 정수인 메소드
        // 5) 리턴 값이 boolean인 메소드
        // 6) 리턴 값이 String인 메소드
        // 7) 리턴 값이 char인 메소드
}
