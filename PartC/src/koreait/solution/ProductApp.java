package koreait.solution;

public class ProductApp {
    public static void main(String[] args) {
        
        // 2-1)
        Product[] cart = new Product[10];
        
        cart[0] = new Bike(123000,"MTB",25);
        cart[3] = new Bike(99000,"삼천리",15);
        cart[1] = new Electronics(35000,"USB");
        cart[5] = new Electronics(527000,"스마트TV");
        cart[7] = new Electronics(2250000,"lg냉장고");
        
        // 2) power 메소드 : Electronics 자식 클래스의 메소드 
        //           현재 부모타입으로 참조하는 것을 자식타입으로 변경
        if(cart[5] instanceof Electronics){
        Electronics tv = (Electronics) cart[5];
        tv.setKwh(0.9);
        System.out.println(tv.power());
        }else
            System.out.println("Electronics 타입으로 변경 불가.");
        
        
        
            // 3) 배열 10개 중에 객체가 참조된 것은 5개
        // -> 반복문으로 실행할 떄 반드시 null이 아닌 것만 하도록 합니다.
        // -> null 이면 메소드 실행 예외 발생합니다. NullpointerException 
        for(Product p : cart) {
        if(p!= null && p.price >= 100000) {
            // System.out.println(p.toString());
            System.out.println(p);      // toString() 메소드이름 생략 가능
            }
         }
    
  
         // 4) ride 메소드 : Bike 자식 클래스의 메소드 
         //   현재 부모타입으로 참조하는 것을 자식 타입으로 변경.(다운캐스팅) 
         for(Product p : cart) {
            if(p!= null && p instanceof Bike) {
                Bike bike = (Bike) p;
                System.out.println(bike.ride());
         }
     }

    //  5)
    System.out.println("\n문제5.");
    String result = cart[3].sell(20);
    System.out.println(result);

    // 6)
    System.out.println("\n문제6.");
    System.out.println(cart[5].sell("사운드바"));
 }
}

/* 자바 교재 204 페이지
 * 라이브러리 클래스 : Product, Bike, Electronics, 그리고 제일 중요한 자바 클래스들
 *                   ㄴ 프로그래밍에 필요한 재료로 사용되는 클래스
 *                   ㄴ 인스턴스 메소드와 static 메소드로 제공되는 기능을 사용함.
 * 실행 클래스 : ProductApp
 *                  ㄴ main 메소드를 포함하여 프로그램을 실행함.
 *                  ㄴ main 메소드는 반드시 static 이어야 합니다.
 *                  ㄴ main 메소드를 위한 객체를 먼저 생성할 수 없다. 그래서 static 입니다.  
 * 
 * 
 * 설명 예시 : Bike 클래스의 sell 메소드 Object 인자 값은 외부에서 줍니다.
 *             여기서 외부는 이 메소드를 사용하는 main 또는 다른 클래스를 말합니다.
 *             라이브러리 클래스의 특히 인스턴스 필드 값은 실행될 때 결정됩니다.
 * 
 */