package b2_vonglap.baitap;

import java.util.Scanner;

public class hienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" so nguyen to dau tien can in ra ");
        int number= scanner.nextInt();
        int count=0;
        int a=2;
        String b="";
        boolean check=true;
        while(count<number){
            for(int i=2;i<a;i++){
                if(a%i==0){
                    check=false;
                    break;
                }else{
                    check=true;
                }
            }
            if(check){
                count++;
                b+=a+" ";
            }
            a++;

        }
        System.out.println(number+" so nguyen to dau lien :");
        System.out.println(b);
    }
}
