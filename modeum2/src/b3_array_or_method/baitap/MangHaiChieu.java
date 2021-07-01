package b3_array_or_method.baitap;

import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] array= new int[3][3];
        int max=0;
        int a=0;
        int b=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print("nhap gia tri array["+i+"]["+j+"] =");
                array[i][j]=scanner.nextInt();
                if(array[i][j]>max){
                    max=array[i][j];
                    a=i;
                    b=j;
                }

            }
        }
        System.out.println("gia tri lon nhat cua mang = " +max);
        System.out.println("vi tri gia tri lon nhat trong mang array["+a+"]["+b+"]");
    }
}
