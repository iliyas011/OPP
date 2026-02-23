package practice2.task1.task1;

public class Student{
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
