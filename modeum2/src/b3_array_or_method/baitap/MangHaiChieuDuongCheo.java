package b3_array_or_method.baitap;

import java.util.Scanner;

public class MangHaiChieuDuongCheo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] array= new int[4][4];
        int a=0;
        int b=3;
        int total=0;
        int total1=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print("nhap gia tri ma tran array["+i+"]["+j+"]");
                array[i][j]=scanner.nextInt();
                if(j==a){
                    total+=array[i][j];
                }
                if(j==b){
                    total1+=array[i][j];
                }

            }
            a++;
            b--;
        }
        System.out.println("tong gia tri phan tu theo duong cheo = "+total);
        System.out.println("tong gia tri phan tu theo duong cheo nguoc lai = "+total1);
    }
}
