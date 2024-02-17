package homeWorks.homeWork21.homeWork21_7;

import homeWorks.homeWork21.homeWork21_7.entitys.Keyboard;
import homeWorks.homeWork21.homeWork21_7.entitys.Mouse;

public class HW21_7_Demo {
    public static void main(String[] args) {
        Keyboard keyboard=new Keyboard("keyboard1");
        Mouse mouse=new Mouse("mouse1");
        keyboard.connect();
        mouse.disconnect();
    }
}
