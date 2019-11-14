package pbo_polymorphism;

public class Rectangle extends Shape {
    //Private member variables
    private int length;
    private int width;
    //Constructor
    public Rectangle(String color, int lentgh, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString() {
        return "Rectangle[length= " + ",width= " + width + ", " + super.toString() + "]";
    }
    //Override the inherited getArea() to provide the proper implementation
    @Override
    public double getArea() {
        return length * width;
    }
}
