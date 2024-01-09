package object.day8;

public class Member {

   
    private int age;
    private String name;
    

    public Member(int age, String name) {
    //    필드 2개 선언
        this.age = age;
        this.name = name;
    }

    // 다형성 예시 : 메소드 인자가 부모 타입일 때, 실제 객체는 여러 자식 객체가 될 수 있습니다.
    public boolean isAdopt(Animal animal) {
        /* if (animal instanceof Puppy) {
            return age >= 15;
        } else if (animal instanceof Cat) {
            return age >= 18;
        } else if (animal instanceof Rabbit) {
            return age >= 13;
        } else {
            return age >= 20;
        }
 */
        if (animal instanceof Puppy && age >= 15)
        return true;
        else if (animal instanceof Cat && age >= 18)
        return true;
        else if (animal instanceof Rabbit && age >= 13)
        return true;
        else if ( age >= 20)
        return true;
        else 
        return false;

    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}