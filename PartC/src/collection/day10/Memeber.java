package collection.day10;

public class Memeber {
    private String name;
    private int age;

    public Memeber(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Memeber [name=" + name + ", age=" + age + "]";
    }

    
}
