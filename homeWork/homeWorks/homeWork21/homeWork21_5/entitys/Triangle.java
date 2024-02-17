package homeWorks.homeWork21.homeWork21_5.entitys;

public class Triangle extends Shape{
    private double baseSide;
    private double height;

    public Triangle(String name, double baseSide, double height) {
        super(name);
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return 0.5*height*baseSide;
    }
}
