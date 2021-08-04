package b7_abstract_or_inderface.thuc_hanh.Comprator;

import b6_inhertance.thuc_hanh.Circle;

import java.util.Comparator;

public class Comprator1 implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
    }

