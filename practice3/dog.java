package practice3;
public class dog extends animal12 {

    String breed;

    public dog(String name, String breed) {
        super(name);
        this.breed = breed;

    }

    public dog(int age, String gen) {
        super(age);


    }

    @Override
    public void makeSound() {

        System.out.println("gav");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Breed: " + breed);
    }
}
