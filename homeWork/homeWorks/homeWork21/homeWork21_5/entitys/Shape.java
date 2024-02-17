package homeWorks.homeWork21.homeWork21_5.entitys;

abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }
    public double getSquare(){return 0;}

    public String getName() {
        return name;
    }
}
