package LAB2.Bonuss;

abstract class Piecee {

    Positionn pos;
    String color;
    char symbol;

    Piecee(Positionn p, String c, char s) {

        pos = p;
        color = c;
        symbol = s;
    }

    abstract boolean isLegal(Positionn newPos, Piecee[][] board);

    char getSymbol() {

        return color.equals("white") ?
                Character.toUpperCase(symbol) :
                Character.toLowerCase(symbol);
    }
}
