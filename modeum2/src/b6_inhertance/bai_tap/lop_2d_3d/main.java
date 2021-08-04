package b6_inhertance.bai_tap.lop_2d_3d;

public class main {
//    public static void main(String[] args) {
//        Lop2D lop2D=new Lop2D(3,6);
//        System.out.println(lop2D);
//        System.out.println(lop2D.getxy()[0]);
//        System.out.println(lop2D.getxy()[1]);
//    }
public static void main(String[] args) {
    Lop3D lop3d=new Lop3D(4,6,7);
    System.out.println(lop3d);
    System.out.println(lop3d.getxyz()[0]);
    for (float index:lop3d.getxyz()
         ) {
        System.out.println(index);

    }
}
}
