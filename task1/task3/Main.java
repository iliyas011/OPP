package practice2.task1.task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        time t1 = new time(23, 5, 6);
        System.out.println("Universal: " + t1.toUniversal());
        System.out.println("Standard: " + t1.toStandard());

        time t2 = new time(4, 24, 33);
        t1.add(t2);

        System.out.println("After adding t2: " + t1.toUniversal());

        cs.close();
    }
}