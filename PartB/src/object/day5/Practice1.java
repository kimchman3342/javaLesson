package object.day5;

public class Practice1 {


    // 파칭코 만들기
    
    private int num1;
    private int num2;
    private int num3;
    private String[] sco;


    // getter
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public String[] getsco() {
        return sco;
    }

    // setter
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void setSco(String[] result) {
        sco = new String[result.length];
        for(int i = 0; i < result.length; i++)
            sco[i] = result[i];
    }
    
    // printResult
    
    
}
