package academy.learnprogramming;

public class Cylinder extends Circle{

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Radius of the Circle is = "+circle.getRadius());
        System.out.println("Area of the Circle is = "+circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("Radius of the Cylinder is = "+cylinder.getRadius());
        System.out.println("Height of the Cylinder is = "+cylinder.getHeight());
        System.out.println("Volume of the Cylinder is = "+cylinder.getVolume());
    }

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height<0){
            height=0;
        }
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return this.height*super.getArea();
    }

}
