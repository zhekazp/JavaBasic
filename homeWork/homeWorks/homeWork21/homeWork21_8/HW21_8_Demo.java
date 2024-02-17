package homeWorks.homeWork21.homeWork21_8;

import homeWorks.homeWork21.homeWork21_8.entitys.Guitar;
import homeWorks.homeWork21.homeWork21_8.entitys.Piano;
import homeWorks.homeWork21.homeWork21_8.entitys.Violin;

public class HW21_8_Demo {
    public static void main(String[] args) {

        Violin violin=new Violin();
        Guitar guitar=new Guitar();
        Piano piano=new Piano();
        piano.playNote();
        guitar.playNote();
        violin.playNote();
    }
}
