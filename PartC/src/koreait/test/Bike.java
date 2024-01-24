package koreait.test;




public class Bike extends Product {
    
    int price;
    String prdName;
    private int speed;
    
    public Bike(int price, String prdName, int speed) {
        super();
        this.price = price;
        this.prdName = prdName;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
 
    public void ride(){
        speed = 20;
        System.out.println("당신은 이것을" + speed + "km로 탈 수 있습니다.");
    }

    @Override
    public void sell(String prdName, Object abj) {
        // TODO Auto-generated method stub
        super.sell(prdName, abj);
        System.out.println(String.format("[ %s] 행사 - %d%% 인하", prdName, abj.toString())); 
    }

    @Override
    public String toString() {
        return "Bike [price=" + price + ", prdName=" + prdName + ", speed=" + speed + "]";
    }
    
    
    
    
}


class Electronics extends Product {
    int price;
    String prdName;
    private double kwh;
   
    public double getKwh() {
        return kwh;
    }

    public Electronics( int price, String prdName){
        super();
        this.price = price;
        this.prdName = prdName;
    }
    
    public void setKwh(double kwh) {
        this.kwh = kwh;
    }
    
    public void power(){
        kwh = kwh/24;
        System.out.println( kwh );
    }
    
    @Override
    public void sell(String prdName, Object abj) {
        // TODO Auto-generated method stub
        super.sell(prdName, abj);
        System.out.println(String.format("[ %s] 증정 - %s", prdName, abj.toString())); 
    }

    @Override
    public String toString() {
        return "Electronics [price=" + price + ", prdName=" + prdName + ", kwh=" + kwh + "]";
    }
    
    
    
}

