package practice3;

public class cat extends animal12 {

    String color;

    public cat(String name , String color) {
        super(name);
        this.color = color;

    }

    public cat(int age, String color) {
        super(age);
        this.color = color;
    }


    @Override
    public void makeSound() {

        System.out.println("meow");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Color: " + color);
    }
}
