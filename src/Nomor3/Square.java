package Nomor3;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square dengan side=" + super.getWidth() +
                ", merupakan subclass dari " + super.toString();
    }

    //Tidak perlu mengoverride method getArea() dan getPerimeter() dari class Rectangle
    //Dikarenakan rumus getArea() dan getPerimeter dalam class Rectangle juga sesuai
    //untuk mencari area dan perimeter untuk class Square
}
