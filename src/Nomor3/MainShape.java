package Nomor3;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Shape("red", true);
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(14, 10);
        Square square = new Square(7);
        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
