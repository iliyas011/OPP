package LAB2.task2;

public class Pawn extends  Piece{

    public Pawn(Position a){
        super(a);
    }

    @Override
    public  boolean isLegalMove(Position b){
        return  a.getRow() + 1 == b.getRow() && a.getCol() == b.getCol() ;
    }
}
