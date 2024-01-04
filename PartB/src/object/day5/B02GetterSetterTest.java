package object.day5;

public class B02GetterSetterTest {
    public static void main(String[] args) {
    
    MyClass2 momo = new MyClass2();

    
    System.out.println("\n--------------------------------------------");
    System.out.println("MyClass2 의 field1 값(초기)" + momo.getField1());  //null
    momo.setFiled1("나는 모모!!"); 
    System.out.println("MyClass2 의 field1 값(변경 후)" + momo.getField1());
    String message = "WELCOME~!!";
    
    momo.setFiled1(message);    // 수정
    System.out.println("MyClass2 의 field1 값(변경 후)" + momo.getField1());
    System.out.println("--------------------------------------------"); 
    
    System.out.println("\n--------------------------------------------");
    System.out.println("MyClass2 의 field2 값(초기)" + momo.getField2());
    momo.setFiled2(999);    // 수정
    System.out.println("MyClass2 의 field2 값(변경 후)" + momo.getField2());
    momo.printdata();
    System.out.println("--------------------------------------------");
    
    int test =  1212;
    momo.setFiled2(test);
    System.out.println("\n--------------------------------------------");
    System.out.println("MyClass2 의 field2 값(변경 후)" + momo.getField2());
    momo.printdata();
    System.out.println("--------------------------------------------");
    
    System.out.println("\n--------------------------------------------");
    System.out.println("field3은 double 배열 타입입니다.");
    double[] dArray = momo.getField3();
    System.out.println("field3 : " + dArray);
    System.out.println("field3 : " + momo.getField3());
    System.out.println("--------------------------------------------");

    double[] tempArray = { 1.2, 3.44, 67.12 };
    momo.setFiled3(tempArray);
    System.out.println("\n--------------------------------------------");
    System.out.println("변경된 field3 확인합니다.");
    momo.printdata();    
    System.out.println("--------------------------------------------"); 
    momo.setFiled3(new double[5]);
   
    
    System.out.println("\n--------------------------------------------");
    System.out.println("변경된 field3 확인합니다");
    momo.setFiled3(tempArray);
    momo.printdata();
    System.out.println("--------------------------------------------");
   
    
    // setField3을 변수로 전달했을 때
    tempArray[2] = 3.1415;      // 변경된 값이 momo 객체에도 반영되는지 확인
    System.out.println("\n--------------------------------------------"); 
    System.out.println("변경된 field3 확인합니다.");
    momo.printdata();
    System.out.println("--------------------------------------------\n");

     
    }
    
    
}
