package homeWork3;

import homeWork3.classes.Car;
import homeWork3.classes.Tv;

public class TwoObjects {
    public static void main(String[] args) {
        Tv tv= new Tv("Lg","UA7000",50);
        tv.info();
        Car car=new Car("BMW","X1",200);
        car.info();
    }
}
