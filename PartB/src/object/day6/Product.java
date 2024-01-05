package object.day6;

import java.util.Arrays;

public class Product {

    private String productName; // 메소드에 들어갈 재료 설정
    private int price;      // 메소드에 들어갈 재료 설정
    private String company; // 메소드에 들어갈 재료 설정
    private String[] etc; // 메소드에 들어갈 재료 설정

    // 커스텀 생성자 만들기
    public Product(String productName,int price, String company, String[] etc) {    // 생성자를 만들어 객체의 틀을 정함
        this.productName = productName;     // 생성자 필드에서 참조하는 변수 설정 
        this.price = price;     // 생성자 필드에서 참조하는 변수 설정
        this.company = company;     // 생성자 필드에서 참조하는 변수 설정
        this.etc = etc;         // 생성자 필드에서 참조하는 변수 설정
    }

    
    

    // getter 만들기    getter는 main으로 이동할 때 필요한 메서드를 만들어줌으로써 코드의 유연성을 높임
    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public String[] getEtc() {
        return etc;
    }

    public String getData() {
        return String.format("%s\t %d\t %s\t %s", productName, price, company, Arrays.toString(etc));
    }

    // setter는 값을 변경하기 위해 사용, 필요에 따라 넣을 수도 있고 뺄 수도 있음
}
