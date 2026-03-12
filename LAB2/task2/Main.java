package LAB2.task2;

public class Main {
    public static   void main(String[] args){
        Position start = new Position(0 , 0);
        Position end = new Position(0 , 5);

        Piece rook = new Rook(start);

        System.out.println(rook.isLegalMove(end));
    }
}
