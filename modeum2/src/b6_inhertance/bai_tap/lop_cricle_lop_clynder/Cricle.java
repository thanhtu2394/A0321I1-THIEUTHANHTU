package b6_inhertance.bai_tap.lop_cricle_lop_clynder;

public class Cricle {
    private double radius;
    private String color;
    public Cricle(double v, String indigo, boolean b){};

    public Cricle(double v, String color) {
        this.radius = radius;
        this.color = this.color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double area(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                "}"+"Area Criclre ="+this.area();
    }
}
