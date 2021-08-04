package b6_inhertance.bai_tap.lop_point_or_moveablePoint;

public class main {
//    public static void main(String[] args) {
//        LopPoint loppoint=new LopPoint(4,7);
//        System.out.println(loppoint);
//        System.out.println(loppoint.getxy()[1]);
//        System.out.println(loppoint.getx());
//        loppoint.setx(8);
//        System.out.println(loppoint);
//    }
public static void main(String[] args) {
    MovablePoint movablepoint=new MovablePoint(3,4,5,7);
    System.out.println(movablepoint);
    movablepoint.move();
    System.out.println(movablepoint);
}

}
