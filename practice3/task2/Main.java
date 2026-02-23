package practice3.task2;

public class Main {
    public static void main(String[] args) {

        person p = new person("iliyas", "tole bi");
        staff s = new staff("Bekzat", "abay", "FIT", 5000.0);
        Students st = new Students("Dauren", "Satbaev", "Computer Science", 2, 1500.0);


        System.out.println(p);
        System.out.println(s);
        System.out.println(st);


        System.out.println("\nStaff school: " + s.getSchool());
        System.out.println("Student program: " + st.getProgram());
    }
}