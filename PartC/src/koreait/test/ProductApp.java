package koreait.test;

public class ProductApp {
    public static void main(String[] args) {
       
            Product[] cart = new Product[10];
            cart[0] = new Bike(123000,"MTB",25);
            cart[3] = new Bike(99000,"삼천리",15);
            cart[1] = new Electronics(35000,"USB");
            cart[5] = new Electronics(527000,"스마트TV");
            cart[7] = new Electronics(2250000,"lg냉장고");
            
            
            for(int i=0;i<cart.length;i++) {
                if(cart[i]!= null) {
                System.out.println(cart[i]); 
                }
            }
        /* 
            boolean result;
            for(int i=0;i<cart.length;i++) {
                if(cart[i]!= null) continue;
                result =  */
        
        
    }
}
