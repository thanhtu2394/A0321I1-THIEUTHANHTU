package b4_lop_va_doi_tuong_trong_java.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu dai cua hinh chu nhat");
        double chieudai=scanner.nextDouble();
        System.out.println("nhap chieu rong cua hinh chu nhat");
        double chieurong=scanner.nextDouble();
        HinhChuNhat tinhtoan=new HinhChuNhat(chieurong,chieudai);
        tinhtoan.dislay();
        System.out.println("dien thich hinh chu nhat = "+tinhtoan.dienTich());
        System.out.println("chu vi hinh chu nhat = "+tinhtoan.chuVi());

    }
}
