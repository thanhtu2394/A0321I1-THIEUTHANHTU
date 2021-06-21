package b1_introdution_to_java.thuchanh;

import java.util.Scanner;

public class kiemTranamnhuan {
    public static void main(String[] args) {
        Scanner biennhap=new Scanner(System.in);
        System.out.println("nhap nam can tra cuu");
        int a=biennhap.nextInt();
        if(a%100==0&&a%400==0){
            System.out.println(a+"la nam nhan");
        }else if(a%4==0){
            System.out.println(a+"la nam nhuan");
        }else{
            System.out.println(a+"khong phai nam nhuan");
        }

    }
}
