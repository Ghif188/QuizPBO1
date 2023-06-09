package Nomor3;

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (2*width) + (2*length);
    }

    @Override
    public String toString() {
        return "Rectangle dengan width=" + width +
                ", length=" + length +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", merupakan subclass dari " + super.toString();
    }
}
