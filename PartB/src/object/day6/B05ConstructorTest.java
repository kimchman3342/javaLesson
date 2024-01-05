package object.day6;

import java.util.Arrays;

public class B05ConstructorTest {
    public static void main(String[] args) {
        MyClass4 my = new MyClass4();
        System.out.println("\n기본생성자 실행");
        System.out.println("\tfield2 : " + my.getField2());

        System.out.println("\n인자 1개 커스텀 생성자 실행");
        MyClass4 my1 = new MyClass4(999);
        System.out.println("\tmy1 field2 : " + my1.getField2());
        
        MyClass4 my2 = new MyClass4("Hello");
        System.out.println("\tmy2 field1 : " + my2.getField1());
        
        System.out.println("\n인자 2개 커스텀 생성자 실행");
        MyClass4 my3 = new MyClass4("java", 222);
        System.out.println("\tmy3 field1 : " + my3.getField1());
        System.out.println("\tmy3 field2 : " + my3.getField2());

        System.out.println("\n인자 3개 커스텀 생성자 실행");
        MyClass4 my4 = new MyClass4("good", 234, new double[3]);
        System.out.println("\tmy3 field1 : " + my4.getField1());
        System.out.println("\tmy3 field2 : " + my4.getField2());
        System.out.println("\tmy3 field3 : " + my4.getField3());
        System.out.println("\tmy3 field3 : " + Arrays.toString(my4.getField3()));

    }
    
}
