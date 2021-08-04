package b4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class XayDungLopQua {
    private double a;
    private double b;
    private double c;
    public XayDungLopQua(){
    }

    public XayDungLopQua(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(b,2)-(4*a*c);
    }
    public double getRoot1(){
        return -b+(Math.pow(Math.pow(b,2)-(4*a*c),0.5));
    }
    public double getRoot2(){
        return -b-(Math.pow(Math.pow(b,2)-(4*a*c),0.5));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap a");
        double a=scanner.nextDouble();
        System.out.println("nhap b");
        double b=scanner.nextDouble();
        System.out.println("nhap c");
        double c=scanner.nextDouble();
        XayDungLopQua TimNghiem=new XayDungLopQua(a,b,c);
        if(TimNghiem.getDiscriminant()>0){
            System.out.println("phuong trinh co 2 nghiem");
            System.out.println("x1="+TimNghiem.getRoot1()+"x2="+TimNghiem.getRoot2());
        }else if(TimNghiem.getDiscriminant()==0){
            System.out.println("phuong trinh co 1 nghiem");
            System.out.println("x="+TimNghiem.getRoot1());
        }else{
            System.out.println("pt vo nghiem");
        }
    }
}
