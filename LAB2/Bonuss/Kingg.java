package LAB2.Bonuss;

class Kingg extends Piecee {

    Kingg(Positionn p, String c) {
        super(p, c, 'k');
    }

    boolean isLegal(Positionn n, Piecee[][] board) {

        int dr = Math.abs(pos.row - n.row);
        int dc = Math.abs(pos.col - n.col);

        return dr <= 1 && dc <= 1;
    }
}