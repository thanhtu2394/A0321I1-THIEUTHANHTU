package b3_array_or_method.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri can xoa");
        int a = scanner.nextInt();
        boolean check=true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                check=true;
                System.out.println("ban co muon xoa khong ");
                System.out.println("1 xoa");
                System.out.println("2 ko xoa");
                System.out.println("3 exit");
                System.out.print("chon ");
                int b = scanner.nextInt();
                switch (b) {
                    case 1:
                        for (int j = i; j < arr.length-1; j++) {
                            arr[j] = arr[j + 1];
                        }
                        arr[arr.length-1]=0;
                        System.out.print("gia tri cua mang : " );
                        for (int k = 0; k < arr.length; k++) {
                            System.out.print(arr[k]);

                        }
                        break;
                    case 2:
                        System.out.println("gia tri cua mang");
                        for (int k = 0; k < arr.length; k++) {
                            System.out.print(arr[k]);
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("khong co gia tri");
                }
                break;
            } else {
                check=false;
            }
        }
        if(!check){
            System.out.println("khong co gia tri trong mang");
        }
    }
}
