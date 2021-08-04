package b6_inhertance.bai_tap.lop_2d_3d;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class Lop2D {
    private float x;
    private float y;
    public Lop2D(){

    };

    public Lop2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getx(){
        return this.x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float gety(){
        return this.y;
    }
    public void sety(float y){
        this.y=y;
    }
    public void setxy(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getxy(){
        float[] getxy1=new float[2];
        getxy1[0]=this.x;
        getxy1[1]=this.y;
        return getxy1;
    }

    @Override
    public String toString() {
        return "Lop2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
