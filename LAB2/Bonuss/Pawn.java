package LAB2.Bonuss;


class Pawn extends Piecee {

    Pawn(Positionn p, String c) {
        super(p, c, 'p');
    }

    boolean isLegal(Positionn n, Piecee[][] board) {
        int dir = color.equals("white") ? -1 : 1;
        if (n.col == pos.col && n.row == pos.row + dir && board[n.row][n.col] == null) return true;
            if (n.col == pos.col && n.row == pos.row + 2*dir && board[pos.row + dir][pos.col] == null && board[n.row][n.col] == null) {
            if ((color.equals("white") && pos.row == 6) || (color.equals("black") && pos.row == 1)) return true;
        }
        return false;
    }
}