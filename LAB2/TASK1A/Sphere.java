package LAB2.TASK1A;

public class Sphere extends Shape3D {
    public  double radius ;

    public  Sphere(double r ){
        this.radius = r ;

    }

    @Override
    public double volume(){
        return 4/3 * Math.PI * radius * radius * radius;
    }
    @Override
    public  double surfaceArea(){
        return  4 * Math.PI * radius * radius;
    }


    public  double getRadius(){
        return  radius ;
    }
    public  void setRadius(double radius){
        this.radius = radius ;
    }




}
