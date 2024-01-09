package object.day8_interface;

public class B16MyClassAMain {
    public static void main(String[] args) {
        
        
        // interfaceA ifa = new InterfaceA() ;
        // 인터페이스는 객체생성 못함.
        // 단, 익명 내부 타입으로 정의는 가능
        
        // 구현 클래스로 객체 생성
        MyClassA mya = new MyClassA();

        // 업 캐스팅 가능합니다.
        InterfaceA ifa = new MyClassA();
        
        // 다운 캐스팅 가능합니다.
        InterfaceA temp = (MyClassA) ifa;
        System.out.println("참조 타입 변수와 상관없이 똑같이 실행됩니다.");
        mya.methodA();
        ifa.methodA();

   
    }
}