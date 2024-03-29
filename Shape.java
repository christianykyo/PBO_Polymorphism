package pbo_polymorphism;

public class Shape {
    //Private member variable
    private String color;
    //Constructor
    public Shape (String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Shape[color= " + color + "]";
    }
    //All shapes must have amethod called getArea().
    public double getArea() {
        //We need to return some value to compile the program.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
