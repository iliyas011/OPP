package LAB2.Bonuss;

class Queenn extends Piecee {

    Queenn(Positionn p, String c) {
        super(p, c, 'q');
    }

    boolean isLegal(Positionn n, Piecee[][] board) {

        int rowDiff = Math.abs(pos.row - n.row);
        int colDiff = Math.abs(pos.col - n.col);

        return rowDiff == colDiff ||
               pos.row == n.row ||
               pos.col == n.col;
    }
}