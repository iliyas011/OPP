package practice3;



public class animal12 {
    String name ;
    int age ;
    String gen;

   public animal12(String name ){

       this.name = name ;


   }

    public animal12(int age){

       this.age = age;
    }


    public void makeSound() {

       System.out.println("Animal sound ");
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gen);
        System.out.println("age:" + age);
    }




}
