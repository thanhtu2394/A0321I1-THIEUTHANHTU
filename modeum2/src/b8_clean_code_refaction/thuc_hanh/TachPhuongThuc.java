package b8_clean_code_refaction.thuc_hanh;

public class TachPhuongThuc {


        public static double getVolume(int radius, int height){
            double baseArea =getArea(radius);
            double perimeter = getPerimeter(radius);
            double volume = perimeter * height + 2 * baseArea;
            return volume;
        }
        public static double getArea(int radius){
            return Math.PI * radius * radius;
        }
        public static double getPerimeter(int radius){
            return 2 * Math.PI  * radius;
        }

    public static void main(String[] args) {
        System.out.println(TachPhuongThuc.getVolume(23,54));
    }

}
