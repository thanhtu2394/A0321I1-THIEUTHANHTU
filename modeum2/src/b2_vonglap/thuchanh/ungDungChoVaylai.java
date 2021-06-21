package b2_vonglap.thuchanh;

import java.util.Scanner;

public class ungDungChoVaylai {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("so tien cho vay");
        double money=scanner.nextDouble();
        System.out.println("thang  vay");
        int month=scanner.nextInt();
        System.out.println("lai suat theo thang");
        double interestrate=scanner.nextDouble();
        double total,total1=0;

        for(int i=1;i<=month;i++){
            total=money*interestrate/100;
            total1+=total;
        }
        System.out.println("lai suat thu dc "+ total1+"vnd");
        System.out.println("tong so tien thuc te = "+(money+total1)+"vnd");

    }
}
