package b7_abstract_or_inderface.bai_tap.ColorRable;

public class Square extends Rectangle implements ColorrableNew {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howtoColor() {
        System.out.println("color all for sides");
    }

//    public static void main(String[] args) {
//
//            Square square = new Square();
//            System.out.println(square);
//
//            square = new Square(2.3);
//            System.out.println(square);
//
//            square = new Square(5.8, "yellow", true);
//            System.out.println(square);
//    }
}
