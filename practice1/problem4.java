package practice1;

import java.util.Scanner;

public class problem4 {

    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c =  sc.nextDouble();
        Double D = b*b -(4*a*c);
        if(D <= -1){
            System.out.println("error");

        }else if(D == 0){
            System.out.println(-b/(2*a));
        }
        else{
            Double x1 = (-b + Math.sqrt(D))/(2*a);
            Double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }

}
