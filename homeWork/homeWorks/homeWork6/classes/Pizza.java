package homeWorks.homeWork6.classes;

public class Pizza {
public double calories;
    public Pizza(int diameter) {
        this.calories = Math.pow(diameter,2)/4*Math.PI*40;
    }
}
