package homeWork14;

import homeWork14.classes.Pen;

public class HomeWork14_5 {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        Pen pen2=new Pen();
        Pen pen3=new Pen();

        Pen[] pens= {pen1,pen2,pen3};

        pens[0].setColor("Green");
        pens[1].setColor("Red");
        pens[2].setColor("Black");

        for (int i=0;i<pens.length;i++){
            System.out.println("Pen number "+i+" has color : "+pens[i].getColor());
        }
    }
}
