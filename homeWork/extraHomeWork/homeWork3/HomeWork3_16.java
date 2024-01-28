package homeWork3;

import classes.UserInput;
import homeWork3.classes.LightColorDetector;

public class HomeWork3_16 {
    public static void main(String[] args) {
        LightColorDetector ld=new LightColorDetector();
        UserInput ui=new UserInput();
        System.out.println(ld.detect(ui.inputInt("Enter light wave length")));
    }
}
