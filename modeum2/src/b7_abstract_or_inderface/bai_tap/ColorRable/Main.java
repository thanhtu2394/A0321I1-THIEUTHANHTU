package b7_abstract_or_inderface.bai_tap.ColorRable;

import java.sql.SQLOutput;

class Main{
    public static void main(String[] args) {
        Shape[] Color=new Shape[2];
        Color[0]=new Rectangle(4,5);
        Color[1]=new Square(5);
        for (Shape index:Color
             ) {
            System.out.println(index);
            if(index instanceof Square){
                 ((Square) index).howtoColor();
        }

        }


    }
}