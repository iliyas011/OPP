package LAB2.task2;

public class King extends Piece {

    public King(Position a){
        super(a);


    }
    @Override
    public  boolean isLegalMove(Position b){
        int  row1 = Math.abs(a.getRow() - b.getRow());
        int  col1 = Math.abs(a.getCol() - b.getCol() );

        return  row1 <= 1 && col1 <= 1 ;
    }
}
