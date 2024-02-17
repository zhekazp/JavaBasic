package homeWorks.homeWork21.homeWork21_3;

import homeWorks.homeWork21.homeWork21_3.services.ServiceHW21_3;

public class HW21_3_Demo {
    public static void main(String[] args) {
        ServiceHW21_3 app=new ServiceHW21_3();
        app.changeLevel("DEBUG");
        app.changeLevel("ERROR");
        app.changePath("d:\\system");
        app.changePath("d:\\system\\");
        app.printSystemConfigurationInfo();
    }
}
