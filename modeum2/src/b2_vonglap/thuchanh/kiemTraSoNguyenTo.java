package b2_vonglap.thuchanh;

import java.util.Scanner;

public class kiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap mot so nguyen can tra cuu");
        int a=scanner.nextInt();
        boolean check=true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                check=false;
                break;
            }else {
                check = true;
            }
        }
        if(check){
            System.out.println(a+" la so nguyen to");
        }else{
            System.out.println(a+" khong phai so nguyen to");
        }
    }
}