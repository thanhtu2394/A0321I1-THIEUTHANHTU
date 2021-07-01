package b3_array_or_method.thuchanh;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class GiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr= new int[20];
        int count=0;

        while(count<20){
            System.out.print(" gia tri tai san  =");
            arr[count]=scanner.nextInt();
            count++;
        }
        int max=arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.print("gia tri lon nhat cua mang arr ="+max+" vi tri "+index+" trong mang");
    }
}
