package homeWorks.homeWork21.homeWork21_4;

import homeWorks.homeWork21.homeWork21_4.entitys.Bicycle;
import homeWorks.homeWork21.homeWork21_4.entitys.Car;

public class HW21_4_Demo {
    public static void main(String[] args) {
        Car car=new Car("Ferrari",2);
        Bicycle bicycle=new Bicycle("Velo","Sport");

        car.printInfo();
        car.speedUp();
        car.printInfo();
        car.speedBreak();
        car.printInfo();
        car.printDoorsQuantity();

        bicycle.printInfo();
        bicycle.speedUp();
        bicycle.printInfo();
        bicycle.speedBreak();
        bicycle.printInfo();
    }
}
