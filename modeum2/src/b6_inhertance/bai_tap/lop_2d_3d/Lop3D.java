package b6_inhertance.bai_tap.lop_2d_3d;

public class Lop3D extends Lop2D {
    private float z;
    public Lop3D(){

    };
    public Lop3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setxyz(float x,float y,float z){
        this.setX(x);
        this.sety(y);
        this.z=z;
    }
    public float[] getxyz(){
        float[] getxyz1=new float[3];
        getxyz1[0]=this.getx();
        getxyz1[1]=this.gety();
        getxyz1[2]=this.getZ();
        return  getxyz1;
    }

    @Override
    public String toString() {
        return "Lop3D{" +
                "z=" + z +
                "x ="+this.getx()+" y="+this.getZ();
    }
}
