package homeWorks.homeWork21.homeWork21_5.entitys;

public class Rectangle extends Shape{ private double radius;
    private double sidea;
    private double sideb;
    public Rectangle(String name,double sidea, double sideb) {
        super(name);
        this.sidea=sidea;
        this.sideb=sideb;
    }

    @Override
    public double getSquare() {
        return sidea*sideb;
    }

}
