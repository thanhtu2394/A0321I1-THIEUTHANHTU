package b7_abstract_or_inderface.bai_tap.resizeable;

public class main {
    public static void main(String[] args) {
        Shape[] cricle=new Shape[3];
        cricle[0]=new Circle(3);
        cricle[1]=new Rectangle(6,4);
        cricle[2]=new Square(4);
        for (Shape index:cricle
             ) {
            System.out.println(index.getArea());

        }
        System.out.println("after resize");
        for (Shape index:cricle
             ) {index.resize(30);
            System.out.println(index.getArea());;
        }

    }
}
