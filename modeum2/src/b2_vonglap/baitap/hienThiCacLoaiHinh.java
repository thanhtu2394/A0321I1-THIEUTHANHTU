package b2_vonglap.baitap;

import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 :print the rectangle");
        System.out.println("2 :print the squart triangle");
        System.out.println("3 :print the isosceles triangle");
        System.out.println("4 :exit");
        System.out.println( "choice object print");
        int check=scanner.nextInt();
        int h=3;
        int q=3;
        int w=3;
        if(check==1){
            for (int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }else if(check==2){
            for (int i=0;i<4;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for (int i=0;i<4;i++){
                for(int j=0;j<(4-i);j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for (int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(j>=i){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
            for (int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(j>=h){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
                h--;
            }
        }else if(check==3){
            for (int i=0;i<4;i++){
                for(int j=0;j<7;j++){
                    if(j>=q && j<=w){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
                q--;w++;
            }
        }else if(check==4){
            return;
        }
    }
}
