package homeWorks.homeWork21.homeWork21_5.entitys;

public class Circle extends Shape{

    private double radius;
    public Circle(String name,double radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
