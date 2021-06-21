package b1_introdution_to_java.thuchanh;

import java.util.Scanner;

public class giaiPhuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner=new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();
        if(a!=0){
            double x=-b/a;
            System.out.println("x="+x);
        }else if(b==0){
            System.out.println("pt vo so nghiem");
        }else{
            System.out.println("pt vo nghiem");
        }

    }
}
