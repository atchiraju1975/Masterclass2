package academy.learnprogramming.composition;

public class Furniture {

    private String name;
    private String manufacturor;
    private String colour;
    private Dimensions dimensions;
    private String location;

    public Furniture(String name, String manufacturor, String colour, Dimensions dimensions) {
        this.name = name;
        this.manufacturor = manufacturor;
        this.colour = colour;
        this.dimensions = dimensions;
    }



}
