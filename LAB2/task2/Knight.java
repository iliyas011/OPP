package LAB2.task2;

public class Knight extends  Piece{

    public Knight(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        int  row1 = Math.abs(a.getRow() - b.getRow());
        int  col1 = Math.abs(a.getCol() - b.getCol() );

        return (row1 == 2 && col1 == 1) || (row1 == 1 && col1 == 2);
    }
}
