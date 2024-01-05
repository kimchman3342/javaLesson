package object.day6;

public class Cart {

    // 변수 선언부
    private String userid;
    private String[] productNames;
    private int[] prices;
    private int total_money;

    // 추가적인 인스턴스 메소드
    public int totalMoney(int[] select) {
        int sum = 0;
        for(int i = 0; i < select.length; i++){
            int temp = select[i];
            if(temp == -1) break;   // 반복문 중지
        }
        return 0;
    }

    // getter
    public String getUserid() {
        return userid;
    }

    public String[] getProductNames() {
        return productNames;
    }

    public int[] getPrices() {
        return prices;
    }

    public int getTotal_money() {
        return total_money;
    }

    // setter
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setProductNames(String[] productNames) {
        this.productNames = productNames;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }

    public void setTotal_money(int[] select) {
        this.total_money = 0;
        for (int i = 0; i < select.length; i++)
            this.total_money += select[i];
    }
}