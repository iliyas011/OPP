package LAB2.Bonuss;

class Rookk extends Piecee {

    Rookk(Positionn p, String c) {
        super(p, c, 'r');
    }

    boolean isLegal(Positionn n, Piecee[][] board) {

        if (pos.row != n.row && pos.col != n.col)
            return false;

        return true;
    }
}