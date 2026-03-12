package LAB2.Bonuss;

class Bishopp extends Piecee {

    Bishopp(Positionn p, String c) {
        super(p, c, 'b');
    }

    boolean isLegal(Positionn n, Piecee[][] board) {

        int rowDiff = Math.abs(pos.row - n.row);
        int colDiff = Math.abs(pos.col - n.col);

        return rowDiff == colDiff;
    }
}