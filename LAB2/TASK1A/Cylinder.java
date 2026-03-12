package LAB2.TASK1A;

public class Cylinder extends Shape3D {
    private  double radius ;
    private  double height ;
    public  Cylinder(double r , double h){
        this.radius = r ;
        this.height = h;
    }


    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public  double surfaceArea(){
        return  2 * Math.PI *  radius * (radius + height);
    }

    public  double getRadius(){
        return radius;
    }
    public void setRadius(Double radius){
        this.radius = radius;
    }
    public  double getHeight(){
        return height;
    }
    public  void  setHeight(Double height){
        this.height = height;
    }




}
