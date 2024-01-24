package homeWork3.classes;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.pow(radius,2)*Math.PI;
    }
}
