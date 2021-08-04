package b3_array_or_method.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class DemSoLanKiTuString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        System.out.println("nhap chuoi ki tu ");
        String a=scanner.nextLine();
        System.out.println("nhap ki tu can tra cuu trong chuout = ");
        char b=scanner.nextLine().charAt(0);
        for(int i=0;i<a.length();i++){
            if(b==a.charAt(i)){
                count++;
            }
        }
        System.out.println("so ki tu co trong chuoi cua "+ b+" = "+count);
    }

}
