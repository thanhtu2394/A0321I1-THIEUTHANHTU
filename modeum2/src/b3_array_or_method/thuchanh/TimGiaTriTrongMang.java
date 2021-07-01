package b3_array_or_method.thuchanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap gia tri can tim ");
        String a=scanner.nextLine();
        String[] arr={"ai","love","you","chut","chut1"};
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            if(a.equals(arr[i])){
                check=true;
                break;
            }else{
                check=false;
            }
        }
        if(check){
            System.out.println("co trong mang");
        }else{
            System.out.println("ko co ");
        }
    }
}
