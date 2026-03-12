package LAB2.task5;

public class Main {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);
        Animal dog = new Dog("Rex", 3);
        john.assignPet(dog);

        alice.assignPet(dog);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        john.leavePetWith(alice);


        System.out.println(registry);

        john.retrievePetFrom(alice);


        System.out.println(registry);
    }
}

