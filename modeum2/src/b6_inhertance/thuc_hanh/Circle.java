package b6_inhertance.thuc_hanh;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean fillter){
        super(color , fillter);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public void hienthi(){
        System.out.println("C");
    }

    @Override
    public String toString() {
        return "A Circle with radius ="+this.radius+" which is a subclass of"+super.toString();
    }
}
