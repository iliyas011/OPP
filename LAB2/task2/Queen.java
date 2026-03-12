package LAB2.task2;

public class Queen  extends  Piece{

    public  Queen(Position a){
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b){
        boolean rook = a.getCol() == b.getCol() || a.getRow() == b.getRow() ;
        boolean bishop = Math.abs(a.getCol() - b.getCol()) == Math.abs(a.getRow() - b.getRow());

        return  rook || bishop;
    }
}
