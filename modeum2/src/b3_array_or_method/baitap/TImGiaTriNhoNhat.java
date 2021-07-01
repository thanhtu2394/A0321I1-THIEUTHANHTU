package b3_array_or_method.baitap;

import java.util.Scanner;

public class TImGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[6];
        for (int i=0;i<array.length;i++){
            System.out.print("nhap gia cua mang array["+i+"] = ");
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("gia tri nho nhat = "+min);
    }
}
