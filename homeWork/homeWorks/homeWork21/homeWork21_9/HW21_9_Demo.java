package homeWorks.homeWork21.homeWork21_9;

import homeWorks.homeWork21.homeWork21_9.entitys.CarNavigationSystem;
import homeWorks.homeWork21.homeWork21_9.entitys.MarineNavigationSystem;

public class HW21_9_Demo {
    public static void main(String[] args) {
        CarNavigationSystem carNavigationSystem=new CarNavigationSystem("nav1");
        MarineNavigationSystem marineNavigationSystem=new MarineNavigationSystem("nav2");
        carNavigationSystem.startNavigation();
        marineNavigationSystem.stopNavigation();
    }
}
