package object.day7;

//  Shape 과 Triangle을 객체 생성하고 메소드 테스트 해보세요.

public class B09ShapeMain {
    public static void main(String[] args) {
        
        // 클래스를 불러와 변수로 만드는 작업
        Shape sha = new Shape("모양", 30, 30);
        Triangle tri = new Triangle("삼각형", 60, 30, 30);
        
        // 만든 변수를 클래스 내에 있는 메소드를 재료로 사용
        sha.calculateArea();    
        sha.print();
        
        tri.print();
        tri.printAngle();
    }
    
}
