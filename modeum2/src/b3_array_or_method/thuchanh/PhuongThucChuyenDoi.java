package b3_array_or_method.thuchanh;

import java.util.Scanner;

public class PhuongThucChuyenDoi {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. chuyen do c sang do f");
            System.out.println("2. chuyen do f sang do c");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("nhap do c can chuyen doi =");
                    celsius=scanner.nextDouble();
                    System.out.println("do f="+celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.print("nhap do f can chuyen doi =");
                    fahrenheit=scanner.nextDouble();
                    System.out.println("do c ="+fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
