package b7_abstract_or_inderface.thuc_hanh.trien_khai_interface;

import java.util.Arrays;

public class main {
        public static void main(String[] args) {
            TrienKhaiInterFace[] circles = new TrienKhaiInterFace[3];
            circles[0] = new TrienKhaiInterFace(3.6);
            circles[1] = new TrienKhaiInterFace();
            circles[2] = new TrienKhaiInterFace(3.5, "indigo", false);

            System.out.println("Pre-sorted:");
            for (TrienKhaiInterFace circle : circles) {
                System.out.println(circle);
            }

            Arrays.sort(circles);

            System.out.println("After-sorted:");
            for (TrienKhaiInterFace circle : circles) {
                System.out.println(circle);
            }
        }
    }

