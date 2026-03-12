package LAB2.task2;

public class Bishop extends  Piece{

    public Bishop(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b ){
        return  Math.abs(a.getCol() - b.getCol()) == Math.abs(a.getRow() - b.getRow());
    }
}
