package b7_abstract_or_inderface.bai_tap.resizeable;

public class MainCircle {
    public static void main(String[] args) {
        Circle[] cricle =new Circle[3];
        cricle[0]=new Circle(4);
        cricle[1]=new Circle(7);
        cricle[2]=new Circle(8);
        System.out.println("mang ban dau");
        System.out.println("dien tich ban dau cua cac phan tu");
        for (Circle index:cricle
             ) {
            System.out.println(index);
            System.out.println("area=");
            System.out.println(index.getArea());

        }
        System.out.println("dien tich cua cac phan tu sau khi tang ngau nhien");
        cricle[0].resize(Math.random()*100);
        cricle[1].resize(Math.random()*100);
        cricle[2].resize(Math.random()*100);
        for (Circle index:cricle
             ) {
            System.out.println(index );
            System.out.println("area=");
            System.out.println(index.getArea());

        }

    }
}
