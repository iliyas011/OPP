package practice2.task1.task2;

import java.util.Scanner;

public class problem22 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.print("width: ");
        if (cs.hasNextInt()) {
            int g = cs.nextInt();

            StarTriangle small = new StarTriangle(g);

            System.out.println((small.toString()));
        }
        cs.close();
    }
}
