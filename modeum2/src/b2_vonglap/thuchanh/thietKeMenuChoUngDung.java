package b2_vonglap.thuchanh;

import java.util.Scanner;

public class thietKeMenuChoUngDung {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1:xxxxx");
        System.out.println("2:yyyyy");
        System.out.println("3:zzzzz");
        System.out.println("4.Exit");
        System.out.println("choice");
        int a=scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("xxxx");
                System.out.println("xxxx");
                System.out.println("x   x");
                System.out.println("x     x");
                System.out.println("x       x");
                System.out.println("xxxxxxxxxxx");
                break;
            case 2:
                System.out.println("yyyy");
                System.out.println("yyyy");
                System.out.println("y   y");
                System.out.println("y     y");
                System.out.println("y       y");
                System.out.println("yyyyyyyyyyy");
                break;
            case 3:
                System.out.println("zzzz");
                System.out.println("zzzz");
                System.out.println("z   z");
                System.out.println("z     z");
                System.out.println("z       z");
                System.out.println("zzzzzzzzzzz");
                break;
            case 4:
                break;
            default:
                System.out.println("no choice");
        }
    }
}
