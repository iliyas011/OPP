package LAB2.task5;


class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override
    public String getSound() { return "Woof"; }
}