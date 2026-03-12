package LAB2.TASK1A;

public class Cube extends Shape3D {
    public  Double height ;

    public  Cube(double h){
        this.height = h ;
    }
    @Override
    public  double volume(){
        return  height * height * height ;
    }
    @Override
    public  double surfaceArea(){
        return  6 * height * height;
    }


    public double getheight(){

        return  height;
    }
    public  void  setHeight(){
        this.height = height;
    }


}
