package b7_abstract_or_inderface.thuc_hanh.trien_khai_interface;

import b6_inhertance.thuc_hanh.Circle;

public class TrienKhaiInterFace extends Circle implements Comparable<TrienKhaiInterFace> {
    public TrienKhaiInterFace(){};
    public TrienKhaiInterFace(double radius){
        super(radius);
    };
    public TrienKhaiInterFace(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(TrienKhaiInterFace o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

}

