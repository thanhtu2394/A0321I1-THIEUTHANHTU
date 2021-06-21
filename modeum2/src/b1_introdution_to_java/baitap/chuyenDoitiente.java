package b1_introdution_to_java.baitap;

import java.util.Scanner;

public class chuyenDoitiente {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int vnd=23000;
        System.out.println("nhap usd can tra cuu qua vnd");
        float usd=scanner.nextFloat();
        float tyGia=usd*vnd;
        System.out.println("usd ="+tyGia+"vnd");
    }
}
