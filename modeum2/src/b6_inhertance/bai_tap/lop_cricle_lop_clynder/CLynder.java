package b6_inhertance.bai_tap.lop_cricle_lop_clynder;

public class CLynder extends Cricle {
    private double height;

    public CLynder(double height) {
        super(3.6, "indigo", false);
        this.height = height;
    }

    public CLynder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double thetich(){
        return super.area()*this.height;
    }

    @Override
    public String toString() {
        return "CLynder{" +
                "height=" + height +
                '}'+super.toString()+"thetichhinhtru ="+this.thetich();
    }
}
