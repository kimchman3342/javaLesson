package object.day5;

public class B02GetterSetterTest {
    public static void main(String[] args) {
    
    MyClass2 momo = new MyClass2();
    System.out.println("\nMyClass2 의 field1 값(초기)" + momo.getField1());
    momo.setFiled1("나는 모모!!"); 
    System.out.println("MyClass2 의 field1 값(변경 후)" + momo.getField1());
    String message = "WELCOME~!!";
    momo.setFiled1(message);
    System.out.println("MyClass2 의 field1 값(변경 후)" + momo.getField1());
    System.out.println("--------------------------------------------"); 
    
    System.out.println("\nMyClass2 의 field2 값(초기)" + momo.getField1());
    momo.setFiled2(999);
    System.out.println("MyClass2 의 field2 값(변경 후)" + momo.getField1());
    int test =  1212;
    momo.setFiled2(test);
    System.out.println("MyClass2 의 field2 값(변경 후)" + momo.getField1());
    System.out.println("--------------------------------------------"); 
    }
    
    
}
