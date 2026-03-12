package LAB2.task2;




public abstract  class Piece {
    Position a ;
    public abstract boolean isLegalMove(Position b);

    public  Piece(Position a){
        this.a = a ;
    }


}
