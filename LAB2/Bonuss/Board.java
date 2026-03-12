package LAB2.Bonuss;

public class Board {
	Piecee[][] board = new Piecee[8][8];

    String turn = "white";


    void setup() {

        board[0][4] = new Kingg(new Positionn(0, 4), "black");
        board[7][4] = new Kingg(new Positionn(7, 4), "white");

        board[0][0] = new Rookk(new Positionn(0, 0), "black");
        board[0][7] = new Rookk(new Positionn(0, 7), "black");
        board[7][0] = new Rookk(new Positionn(7, 0), "white");
        board[7][7] = new Rookk(new Positionn(7, 7), "white");
        
        board[0][1] = new Horsee(new Positionn(0,1),"black");
        board[0][6] = new Horsee(new Positionn(0,6),"black");
        board[7][1] = new Horsee(new Positionn(7,1),"white");
        board[7][6] = new Horsee(new Positionn(7,6),"white");

        board[0][2] = new Bishopp(new Positionn(0,2),"black");
        board[0][5] = new Bishopp(new Positionn(0,5),"black");
        board[7][2] = new Bishopp(new Positionn(7,2),"white");
        board[7][5] = new Bishopp(new Positionn(7,5),"white");
        
        board[0][3] = new Queenn(new Positionn(0,3),"black");
        board[7][3] = new Queenn(new Positionn(7,3),"white");

        for (int i = 0; i < 8; i++) {

            board[1][i] = new Pawn(new Positionn(1, i), "black");
            board[6][i] = new Pawn(new Positionn(6, i), "white");

        }
    }
    void draw() {
        System.out.println("\n  a b c d e f g h");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null)
                    System.out.print(". ");
                else
                    System.out.print(board[i][j].getSymbol() + " ");
            }
            System.out.println(8 - i);
        }
        System.out.println("  a b c d e f g h");
    }
    boolean move(int r1, int c1, int r2, int c2) {

        Piecee p = board[r1][c1];

        if (p == null) {

            System.out.println("No piece!");
            return false;
        }

        if (!p.color.equals(turn)) {

            System.out.println("Wrong turn!");
            return false;
        }

        Positionn newPos = new Positionn(r2, c2);

        if (!p.isLegal(newPos, board)) {

            System.out.println("Illegal move!");
            return false;
        }

        if (board[r2][c2] instanceof Kingg) {

            System.out.println(turn + " WINS!");
            return true;
        }

        board[r2][c2] = p;
        board[r1][c1] = null;

        p.pos = newPos;

        turn = turn.equals("white") ? "black" : "white";

        return false;
    }

}