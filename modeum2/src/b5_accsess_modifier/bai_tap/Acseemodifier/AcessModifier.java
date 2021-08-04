package b5_accsess_modifier.bai_tap.Acseemodifier;

import com.sun.javaws.jnl.ResourcesDesc;

public class AcessModifier {
    private double radius=1.0;
    private String color="red";
    public AcessModifier(){};
    public AcessModifier(double radius){
        this.radius=radius;
    }
    private double getRadius(){
        return this.radius;
    }
     double getArea(){
        return this.radius* Math.PI;
    }
}
