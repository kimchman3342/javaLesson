package object.day8;

public class Member {

   
    private int age;
    private String name;
    

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean isAdopt(Animal animal) {
        if (animal instanceof Puppy) {
            return age >= 15;
        } else if (animal instanceof Cat) {
            return age >= 18;
        } else if (animal instanceof Rabbit) {
            return age >= 13;
        } else {
            return age >= 20;
        }

    }
}