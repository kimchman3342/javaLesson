package object.day7;

//  Shape 과 Triangle을 객체 생성하고 메소드 테스트 해보세요.

public class B09ShapeMain {
    public static void main(String[] args) {
        
        // 클래스를 불러와 변수로 만드는 작업
        Shape sha = new Shape("그냥도형", 20, 15);
        Triangle tri = new Triangle("세모", 30, 20, 60);
        
        // 만든 변수를 클래스 내에 있는 메소드를 재료로 사용     
        System.out.println("~~~~~~~~재정의 메소드 확인~~~~~~~~~~");
        System.out.println(sha.getShapeName() + "의 넓이 : " + sha.calculateArea());
        System.out.println(tri.getShapeName() + "의 넓이 : " + tri.calculateArea());
        
        System.out.println("~~~~~~~~~~~~부모 클래스가 정의한 메소드 실행확인~~~~~~~~~~~~");
        sha.print();
        tri.print(); // 재정의는 불가능 함.
        

        // getWidth, getHeight는 부모클래스 Shape에서 정의했음. 자식이 실행 가능.
        System.out.println("세모 너비 : " + tri.getWidth());
        System.out.println("세모 높이 : " + tri.getHeight());
        System.out.println("~~~~~~~자식 클래스에서 정의한 메소드 실행확인~~~~~~~");
        System.out.println("세모 각도 : " + tri.getAngle());
        // sha.getAngle(); - 부모가 자식객체의 메소드 실행 못함.(자식한테 선택권이 있음)

        // 상속에서의 변수 참조 타입 - 자식클래스 타입, 부모클래스 타입.
        // 1) 자식 객체를 부모 타입으로 참조하기 (*****)
        Shape temShape = new Triangle("임시세모2", 30, 40, 90);
        
        System.out.println("~~~~~~~~재정의 메소드 확인~~~~~~~~~~");
        System.out.println("부모타입 참조지만 객체의 실체는 Triangle 이므로 재정의");
        System.out.println("\t 너비는 재정의 메소드로 실행됩니다.");
        System.out.println(temShape.getShapeName() + "의 넓이 : " + temShape.calculateArea());
        // 2) 부모 객체를 자식 타입으로 참조할 수 있음???
        // 부모 객체를 자식 타입으로 참조하기 위해 강제 캐스팅.
        Triangle tempTriangle = (Triangle) new Shape("임시도형", 30, 30); // 앞에 (Triangle) 써줘야함
        // 강제 캐스팅을 했으나 Triangle에 필요한 인스턴스 필드가 안만들어져 
        // 1)과 2)에 대해 메소드 사용 제한 확인해보세요.~~
    }
    
}
 