package b3_array_or_method.thuchanh;

import java.util.Scanner;

public class daoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai cua mang");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        int count = 0;
        while (count < arr.length) {
            System.out.println("nhap gia tri thu" + (count + 1));
            arr[count] = scanner.nextInt();
            count++;
        }
        System.out.println("hien thi mang arr");
        for (int index : arr) {
            System.out.println(index);
        }
        System.out.println("dao cac gia tri trong mang");
        for (int i = 0; i < arr.length / 2; i++) {
            int b = arr[i];
            arr[i] = arr[a -1-i];
            arr[a -1- i] = b;
        }
        for(int index:arr){
            System.out.println(index);
        }
    }
}
