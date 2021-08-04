package b7_abstract_or_inderface.thuc_hanh.Comprator;

import b6_inhertance.thuc_hanh.Circle;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1]=new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comprator1 CompratorCricle = new Comprator1();
        Arrays.sort(circles, CompratorCricle);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
