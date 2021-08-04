package b4_lop_va_doi_tuong_trong_java.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class HinhChuNhat {
    private double weight;
    private double height;
    public HinhChuNhat(){
    }
    public HinhChuNhat(double weight,double height){
        this.weight=weight;
        this.height=height;
    }
    public double dienTich(){
        return this.weight*this.height;
    }
    public double chuVi(){
        return  (this.weight+this.height)*2;
    }
    public void dislay(){
        System.out.println("hinh chu nhat co chieu dai ="+this.height +"rong = "+this.weight);
    }


}
