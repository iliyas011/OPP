package practice2.task1.task1;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner  cs = new Scanner(System.in);

        System.out.print("name:");
        String name = cs.nextLine();

        System.out.print("ID:");
        String id = cs.nextLine();

        Student s = new Student(name , id);

        System.out.println("student" + s.getId() + "ID:" + s.getId() +  "is in year" + s.getYear());

        s.in();
        System.out.println("After increment year is " + s.getYear());
    }

}
