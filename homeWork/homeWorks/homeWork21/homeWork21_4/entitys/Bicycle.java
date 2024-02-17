package homeWorks.homeWork21.homeWork21_4.entitys;

public class Bicycle extends Vehicle{
    String type;

    public Bicycle( String model, String type) {
        super(2, model);
        this.type=type;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This vehicle has type - "+type);
        System.out.println();
    }
}
