package b2_vonglap.thuchanh;

import java.util.Scanner;

public class ungChunglonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri a");
        int a = scanner.nextInt();
        System.out.println("nhap gia tri b");
        int b = scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("khong co ucln");
        } else if (a == 0 || b == 0) {
            System.out.println("uoc chung lon nhat =" + (Math.abs(a) + Math.abs(b)));
        } else if (a != 0 && b != 0) {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("uoc chung lon nhat " + a);

        }
    }
}
