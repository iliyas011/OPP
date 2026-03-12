package LAB2.task5;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + name + " (Age:" + age + ")";
    }
}



