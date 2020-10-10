package academy.learnprogramming.composition;

public class Dimensions {

    private double height;
    private double width;
    private double length;

    public Dimensions(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double area(){
        return(this.width*this.length);
    }

}
