package b2_vonglap.baitap;

import java.util.Scanner;

public class hienThiCacSoNTnhoHown100 {
    public static void main(String[] args) {
        int a=2;
        String c="";
        boolean check=true;
        while(a<100){
            for(int i=2;i<a;i++){
                if(a%i==0){
                    check=false;
                    break;
                }else{
                    check=true;
                }
            }
            if(check && a<100){
                c+=a+" ";
            }
            a++;

        }
        System.out.println("so nguyen to nho hon 100 ");
        System.out.println(c);
    }
}
