package homeWorks.homeWork21.homeWork21_5;

import homeWorks.homeWork21.homeWork21_5.entitys.Circle;
import homeWorks.homeWork21.homeWork21_5.entitys.Rectangle;
import homeWorks.homeWork21.homeWork21_5.entitys.Triangle;

public class HW21_5_Demo {
    public static void main(String[] args) {
        Triangle triangle=new Triangle("triangle1",5,7);
        System.out.println(triangle.getName()+" has square : "+triangle.getSquare());

        Circle circle=new Circle("circle1",10);
        System.out.println(circle.getName()+" has square : "+circle.getSquare());

        Rectangle rectangle=new Rectangle("rectangle1",10,20);
        System.out.println(rectangle.getName()+" has square : "+rectangle.getSquare());
    }
}
