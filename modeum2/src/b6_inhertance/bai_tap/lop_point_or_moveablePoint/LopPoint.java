package b6_inhertance.bai_tap.lop_point_or_moveablePoint;

public class LopPoint {
    private float x;
    private float y;
    public LopPoint(){};
    public LopPoint(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getx(){
        return this.x;
    }
    public float gety(){
        return this.y;
    }
    public void setx(float x){
        this.x=x;
    }
    public void sety(float y){
        this.y=y;
    }
    public void setxy(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getxy(){
        float[] arrayxy=new float[2];
        arrayxy[0]=this.x;
        arrayxy[1]=this.y;
        return arrayxy;
    }

    @Override
    public String toString() {
        return "LopPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
