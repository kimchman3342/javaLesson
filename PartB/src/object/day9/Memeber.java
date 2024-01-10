package object.day9;

/* 인터페이스 예시 - 비교 가능한 객체 만들기
 *                ㄴ 객체 비교 방법 1) Comparable 인터페이스 구현하도록 합니다.
 * 
 * Comparable<Memeber> 는 <> 에 타입을 표시합니다. 이런 방식을 제너릭 타입
 *                     제너릭 타입 : 클래스 또는 인터페이스의 메소드에게 타입을 매개변수로 전달하기 위한 방식입니다.
 *                     이 때 타입이 실행 시점에서 결정되기 때문입니다. 기본형은 Wrapper 클래스로 사용
 *                     Comparable 인터페이스가 실행하는 메소드에 Memeber 타입을 전달합니다.
 * Comparable : 비교할 수 있는
 */

public class Memeber implements Comparable<Memeber> {
    private String id;
    private int age;
    
    public Memeber(String id, int age){
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    

    @Override
    public String toString() {
        return "Memeber [id=" + id + ", age=" + age + "]\n";
    }

    // Comparable 인터페이스의 추상메소드  compareTo를 구현합니다.
    @Override
    public int compareTo(Memeber o) {   // 메소드의 인자 타입 Memeber는 <> 제너릭 타입과 같게 만들어집니다.
        // 현재 객체 this를 인자로 전달되는 Memeber 객체와 비교합니다.
        // 비교 기준은 요구사항에 따라 개발자가 정합니다.
        // 만약에 나이로 한다면
        return this.age - o.age;
    }
}
