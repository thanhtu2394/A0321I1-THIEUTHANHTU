package b3_array_or_method.thuchanh;

import java.util.Scanner;

public class UngDungDemSInhVIenThiDO {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("tong so hoc sinh can tra cuu = ");
        int b=scanner.nextInt();
        double[] array=new double[b];
        int count=0;
        for(int i=0;i<array.length;i++){
            System.out.print("nhap diem hoc sinh thu "+(i+1)+" = ");
            array[i]=scanner.nextDouble();
            if(array[i]>5 && array[i]<=10){
                count++;
            }
            System.out.println();
        }
        System.out.println("tong so hoc sinh qua mon = "+count+" hoc sinh");
    }
}
