package LAB2.Bonuss;

class Positionn {

    int row, col;

    Positionn(int r, int c) {

        if (r < 0 || r > 7 || c < 0 || c > 7)
            throw new IllegalArgumentException();

        row = r;
        col = c;
    }
}