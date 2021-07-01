package b3_array_or_method.baitap;

import java.util.Scanner;

public class TongCotTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("gia tri hang = ");
        int hang=scanner.nextInt();
        System.out.print("gia tri cot = ");
        int cot=scanner.nextInt();
        System.out.println("ban muon trich xuat tong gia cot thu bao nhieu trong mang");
        int total;
        int totalcot=0;
        String totalcots="";
        do {
            total=scanner.nextInt();
        }while (total>cot);
        int[][] array=new int[hang][cot];
        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
            System.out.print("nhap gia tri array["+i+"]["+j+"] =");
            array[i][j]=scanner.nextInt();
            if(total==(j+1)){
                totalcot+=array[i][j];
                totalcots+=array[i][j]+" + ";
            }

            }
        }
        System.out.println("tong cot thu "+total+" trong mang la =" +totalcot);
        System.out.println("gia tri cua cac phan thu trong cot = "+totalcots);
    }
}
