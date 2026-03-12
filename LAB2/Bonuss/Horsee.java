package LAB2.Bonuss;

class Horsee extends Piecee {

    Horsee(Positionn p, String c) {
        super(p, c, 'h');
    }

    boolean isLegal(Positionn n, Piecee[][] board) {

        int rowDiff = Math.abs(pos.row - n.row);
        int colDiff = Math.abs(pos.col - n.col);

        return (rowDiff == 2 && colDiff == 1) ||
               (rowDiff == 1 && colDiff == 2);
    }
}