package b1_introdution_to_java.thuchanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap thang ban can tra ngay");
        int a=scanner.nextInt();
        switch (a){
            case 2 :
                System.out.println("thang "+a+" co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("thang"+a+": co 31 ngay");
                break;
            case 4:
            case 6:
            case 8:
            case 9:
                System.out.println("thang"+a+"co 30 ngay");
                break;
            default:
                System.out.println("khong co du lieu");

        }
    }
}
