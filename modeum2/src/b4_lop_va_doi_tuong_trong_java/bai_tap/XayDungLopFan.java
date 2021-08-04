package b4_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopFan {
        private static final int slow = 1;
        private static final int medium = 2;
        private static final int fast = 3;
        int speed;
        boolean on;
        double radius;
        String color = "blue";

        public XayDungLopFan() {

        }

        public XayDungLopFan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSpeed() {
            return speed;
        }

        public boolean getOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

    @Override
    public String toString() {
            if(this.on==true){
            return "XayDungLopFan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}'+"Fan is on";

        }else{
                return "XayDungLopFan{" +
                        "speed=" + speed +
                        ", on=" + on +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        '}'+"Fan is off";
            }
    }

    public static void main(String[] args) {
        XayDungLopFan fan1=new XayDungLopFan(XayDungLopFan.fast,true,10,"yellow");
        XayDungLopFan fan2=new XayDungLopFan(XayDungLopFan.medium,false,5,"blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}

