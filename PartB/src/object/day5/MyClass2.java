package object.day5;

import java.util.Arrays;

public class MyClass2 {
   
    // 인스턴스 필드
    // private 키워드 : 현재 클래스 외에 다른 클래스에서 사용 못함.
    private String field1;
    private int field2;
    private double[] field3;

    // static 필드 - 클래스 이름으로 사용.
    private static int field5;
    private static final int FIELD4 = 999;

    // private 변수(필드)를 다른 클래스에서 값을 '읽고' 또는 '저장'하기 -> getter,setter
    // 필드 값을 가져오는(읽기) 메소드 : getter
    public String getField1(){
        return field1;
    }

    public int getField2(){
        return field2;
    }
    
    public double[] getField3(){
        return field3;
    }
    
    

    // 필드 값을 저장하는 메소드 : setter
    public void setFiled1(String f1){
        field1 = f1;   
    }
    public void setFiled2(int f2){
        field2 = f2;
    }
    
    public void setFiled3(double[] f3){   // 배열의 값이 인자 값입니다
        //field3 = f3;        
        // 참조 값을 대입시킵니다. 객체가 의도하지 않아도 쉽게 field3 배열 값이 변경됩니다.
        field3 = new double[f3.length]; // 배열을 새로 생성하기
        for(int i = 0; i < f3.length; i++)  // f3 배열의 값을 복사하기
                field3[i] = f3[i];

        
    }

    public void printdata(){
        System.out.println("field1 = " + field1 + ",field2 = " + field2 +", "+
        "field3 = "+ field3 +", " + Arrays.toString(field3));
    }
    
    /**/
}
 