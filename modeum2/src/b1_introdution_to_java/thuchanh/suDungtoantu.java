package b1_introdution_to_java.thuchanh;

import java.util.Scanner;

public class suDungtoantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        width=scanner.nextFloat();
        height=scanner.nextFloat();
        float area=width*height;
        System.out.println("dien tich ="+area);
    }
}