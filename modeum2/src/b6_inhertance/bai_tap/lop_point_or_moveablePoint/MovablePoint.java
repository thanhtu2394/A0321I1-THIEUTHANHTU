package b6_inhertance.bai_tap.lop_point_or_moveablePoint;

public class MovablePoint extends LopPoint {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    ;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arraySpeed = new float[2];
        arraySpeed[0] = this.xSpeed;
        arraySpeed[1] = this.ySpeed;
        return arraySpeed;
    }

    @Override
    public String toString() {
        return "x=" + this.getx() + "y=" + this.gety() + "speed=(" + this.getxSpeed() + ","
                + this.getySpeed() + ")";
    }

    public MovablePoint move() {
        this.setx(this.getx() + this.xSpeed);
        this.sety(this.gety() + this.ySpeed);
        return this;
    }
}
