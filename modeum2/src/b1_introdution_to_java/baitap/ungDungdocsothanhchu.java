package b1_introdution_to_java.baitap;

import java.util.Scanner;

public class ungDungdocsothanhchu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so can chuyen thanh chu");
        int a=scanner.nextInt();
        String[] arr={"zero","one","two","there","four","five","six","seven","eight","nine"};
        if(0<=a && a<10){
            switch (a){
                case 1:
                    System.out.println(arr[a]);
                    break;
                case 2:
                    System.out.println(arr[a]);
                    break;
                case 3:
                    System.out.println(arr[a]);
                    break;
                case 4:
                    System.out.println(arr[a]);
                    break;
                case 5:
                    System.out.println(arr[a]);
                    break;
                case 6:
                    System.out.println(arr[a]);
                    break;
                case 7:
                    System.out.println(arr[a]);
                    break;
                case 8:
                    System.out.println(arr[a]);
                    break;
                case 9:
                    System.out.println(arr[a]);
                    break;
                case 0:
                    System.out.println(arr[a]);
                    break;

            }
        }else if(10<=a&&a<20){
            int b=a-10;
            switch (b){
                case 1:
                    System.out.println("muoimot");
                    break;
                case 2:
                    System.out.println("muoihai");
                    break;
                case 3:
                    System.out.println("muoiba");
                    break;
                case 4:
                    System.out.println(arr[b]+"teen");
                    break;
                case 5:
                    System.out.println(arr[b]+"teen");
                    break;
                case 6:
                    System.out.println(arr[b]+"teen");
                    break;
                case 7:
                    System.out.println(arr[b]+"teen");
                    break;
                case 8:
                    System.out.println(arr[b]+"teen");
                    break;
                case 9:
                    System.out.println(arr[b]+"teen");
                    break;
                case 0:
                    System.out.println("ten");
                    break;

            }
        }else if(20<=a &&a<100){
            int b=a/10;
            int c=a%10;
            switch (c){
                case 1:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 2:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 3:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 4:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 5:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 6:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 7:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 8:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 9:
                    System.out.println(arr[b]+"ty"+arr[c]);
                    break;
                case 0:
                    System.out.println("tewnty");
                    break;

            }
        }else if(100<=a&&a<1000){
            int b=a/100;
            int c=a%100;
            int d=c/10;
            int e=c%10;
            switch (b){
                case 1:
                    System.out.println(arr[b]+"hunderred"+arr[d]+"ty"+arr[e]);
                    break;
                case 2:
                    System.out.println(arr[b]+"hunderred"+arr[d]+"ty"+arr[e]);
                    break;
                case 3:
                    System.out.println(arr[b]+"hunderred"+arr[d]+"ty"+arr[e]);
                    break;
                case 4:
                    System.out.println(arr[b]+"hunderred"+arr[d]+"ty"+arr[e]);
                    break;
                case 5:
                    System.out.println(arr[b]+"hunderred"+arr[d]+"ty"+arr[e]);
                    break;
                case 6:
                    System.out.println(arr[b]+"hunderred"+arr[d]+"ty"+arr[e]);
                    break;
                case 7:
                    System.out.println(arr[b]+"hunderred"+arr[d]+"ty"+arr[e]);
                    break;
                case 8:
                    System.out.println(arr[b]+"hunderred"+arr[d]+"ty"+arr[e]);
                    break;
                case 9:
                    System.out.println(arr[b]+"hunderred  "+arr[d]+"ty  "+arr[e]);
                    break;
                case 0:
                    System.out.println("tewnty");
                    break;
                default:
                    System.out.println("khongco");

            }
        }
    }
}
