package object.day6;

public class B06ProductMain {

    public static void main(String[] args) {
        
        // Product 객체를 4개 만들어보겠습니다.
        Product snack = new Product("새우깡", 1200, "농심", new String[3]);
        Product drink = new Product("칠성사이다", 2200, "롯데", new String[3]);
        Product fruit = new Product("부사", 12000, "우리농원", new String[3]);
        Product icecream = new Product("투게더", 7000, "빙그레", new String[3]);

        // 출력해봅시다.
        System.out.println(snack);
        System.out.println(drink);
        System.out.println(fruit);
        System.out.println(icecream);
        
    }
    
}
