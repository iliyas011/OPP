import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double number = sc.nextDouble();

        if (95 <= number && number <= 100) {
            System.out.println("A");

        } else if (90 <= number && number <= 94) {
            System.out.println("-A");

        } else if (85 <= number && number <= 89) {
            System.out.println("+B");
        } else if (80 <= number && number <= 84) {
            System.out.println("B");

        }
        else if (75 <= number && number <= 79) {
            System.out.println("-B");
    }
        else if (70 <= number && number <= 74) {
            System.out.println("+C");
        }
        else if (65 <= number && number <= 74) {
            System.out.println("C");
        }
        else if (60 <= number && number <= 64) {
            System.out.println("-C");
        }
        else if (55 <= number && number <= 59) {
            System.out.println("+D");
        }
        else if (50 <= number && number <= 54) {
            System.out.println("D");
        }
        else if(number>100 || number < 0){
            System.out.println("error");
        }
        else{
            System.out.println("F");
        }
}}