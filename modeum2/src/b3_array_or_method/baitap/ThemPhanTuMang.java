package b3_array_or_method.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ThemPhanTuMang {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr1=new int[arr.length+1];
        System.out.println("gia tri them vao mang ");
        int value=scanner.nextInt();
        System.out.println("vi tri can chen");
        int index=scanner.nextInt();
        for(int i=0;i<index;i++){
            arr1[i]=arr[i];
        }
        arr1[index]=value;
        for(int i=index+1;i<arr1.length;i++){
           arr1[i]=arr[i-1];
        }
        System.out.println("cac phan tu cua mang sau khi them");
//        for(int i=0;i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }
        for (int e:arr1) {
            System.out.println(e);
        }

    }
}
