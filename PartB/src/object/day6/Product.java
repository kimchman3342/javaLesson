package object.day6;

public class Product {

    private String productName;
    private int price;
    private String company;
    private String[] etc;

    // 커스텀 생성자 만들기
    public Product(String productName,int price, String company, String[] etc) {
        this.productName = productName;
        this.price = price;
        this.company = company;
        this.etc = etc;
    }
    

    // getter 만들기
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
}
