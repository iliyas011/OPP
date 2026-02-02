import java.util.Scanner;

class Student{
    private String name;
    private  String id ;
    private int year ;

    public Student(String name , String id){
        this.name = name;
        this.id = id;
        this.year = 1 ;
    }
    public  String getName(){
        return  this.name;}
    public String getId(){
        return this.id;
    }
    public Integer getYear(){
        return this.year;
    }
    public void in(){
        this.year = this.year +1;
    }
}



public class problem21 {
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
