package LAB2.Bonuss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Board game = new Board();
        game.setup();

        while (true) {
            game.draw();
            System.out.println(game.turn + " move (e.g. e2 e4):");

            String start = sc.next();
            String end = sc.next();

            int c1 = start.toLowerCase().charAt(0) - 'a';
            int r1 = 8 - Character.getNumericValue(start.charAt(1));

            int c2 = end.toLowerCase().charAt(0) - 'a';
            int r2 = 8 - Character.getNumericValue(end.charAt(1));

            try {
                boolean finished = game.move(r1, c1, r2, c2);
                if (finished) break;
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
        System.out.println("GAME OVER");
    }
}