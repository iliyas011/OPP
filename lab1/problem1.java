import java.util.Scanner;

public class problem1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String h = "-";
          String name = sc.nextLine();

          for (int i = 1; i < name.length(); i++) {
               h += "-";
          }
          String h1 = "-"+name.length();
          System.out.println("+" + h + "+" );
          System.out.println("|"+ name + "|");
          System.out.println("+" + h + "+");
     }
}
