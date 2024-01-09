package object.day8;

import object.day7.Diamond;
import object.day7.Shape;
import object.day7.Triangle;
import object.test.Square;

/*
 * 모든 자바 클래스의 부모는 Object 타입
 * 
 */

public class B14ObjectTest {

    public static void main(String[] args) {
        //Object 타입으로 업캐스팅
        Object ob1 = new String("hello hava~");
        Object ob2 = new Diamond();
        Object ob3 = 3;         //3은 int 정수. > Integer객체로 변경 > Object로 참조
        //기본형 타입은 Wrapper 클래스로 객체로 변경되서 Object로 업캐스팅
        //              ㄴByte, Character, Short, Integer, Long, Float, Double 등
        //              ㄴ ** 다른 자료구조 list, Map, Set 등은 객체 (클래스) 타입만 다릅니다.**    

        //Object 클래스의 메소드 - 모든 자바 클래스가 상속받고 있다.
        //                      ㄴgetClass, toString, hashcode, equals
        //                      ㄴString 클래스 equals는 Object 메소드 재정의(오버라이드)
        

        System.out.println("\ngetClass는 클래스의 타입 정보를 리턴합니다.");
        //getName은 클래스 타입 정보중 클래스 이름 리턴
        System.out.println("\tob1 getClass = "+ob1.getClass().getName());     
        System.out.println("\tob2 getClass = "+ob2.getClass().getName());
        System.out.println("\tob3 getClass = "+ob3.getClass().getName());

        System.out.println("\nhashcode는 객체의 참조(식별)값을 리턴");
        System.out.println("\t ob1 hashcode = " + ob1.hashCode() + "," + Integer.toHexString(ob1.hashCode()));
        System.out.println("\t ob2 hashcode = " + ob1.hashCode() + "," + Integer.toHexString(ob2.hashCode()));
        System.out.println("\t ob3 hashcode = " + ob1.hashCode() + "," + Integer.toHexString(ob3.hashCode()));
        
        
        
        System.out.println("\ntoString 확인 - 참조변수");
        System.out.println("\tob1 to String = " + ob1.toString());      // String은 toString 재정의
        System.out.println("\tob2 to String = " + ob2.toString());      // Object toString의 기본 값 출력
        System.out.println("\tob3 to String = " + ob3.toString());      // Integer는 toString 재정의
        
        System.out.println("\nString 생략");
        System.out.println("\tob1 to String = " + ob1);     //toString 메소드는 생략하고 쓸 수 있습니다.
        System.out.println("\tob2 to String = " + ob2);
        System.out.println("\tob3 to String = " + ob3);

        System.out.println("\n우리가 만든 클래스의 toString 재정의 확인");
        Shape sh2 = new Shape("아직모름", 25, 20);
        Shape diamond = new Diamond();
        Shape square = new Square();
        Triangle triangle = new Triangle("삼각형", 20, 30, 65);
        
        System.out.println("\t sh2 = " + sh2);
        System.out.println("\t diamond = " + diamond);
        System.out.println("\t square = " + square);
        System.out.println("\t triangle = " + triangle);


        System.out.println("");

    }

    
}