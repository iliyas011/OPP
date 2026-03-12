package LAB2.TASK1A;

public class Main {
    public static void main(String[] args) {
        Shape3D cube = new Cube(4.0);
        Shape3D sphere = new Sphere(5.0);
        Shape3D cylinder = new Cylinder(6.0, 8.0);


        System.out.println("Cube:" + cube);
        System.out.println("Sphere" + sphere);
        System.out.println("Cylinder" + cylinder);


        Shape3D[] shapes = {cylinder, sphere, cube};
        System.out.println("\nAll shapes:");
        for (Shape3D shape : shapes) {
            System.out.println(shape);
        }


    }
}
