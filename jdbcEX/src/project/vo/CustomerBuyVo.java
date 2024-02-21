package project.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;

public class CustomerBuyVo {
    private int BUY_IDX;
    private String pcode;
    private String pname;
    private int price;
    private int quantity;
    private Timestamp reg_data;

    public void setBUY_IDX(int bUY_IDX) {
        BUY_IDX = bUY_IDX;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setReg_data(Timestamp reg_data) {
        this.reg_data = reg_data;
    }

    public int getBUY_IDX() {
        return BUY_IDX;
    }

    public String getPcode() {
        return pcode;
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Timestamp getReg_data() {
        return reg_data;
    }

    @Override
    public String toString() {
        return String.format("%6d %15s %40s\t %8d %15d %40d", BUY_IDX, pcode, pname, price, quantity, reg_data);
    }

    public CustomerBuyVo(String string, String string2, String string3, int int1, int int2, Timestamp timestamp) {
        // TODO Auto-generated constructor stub
    }

}