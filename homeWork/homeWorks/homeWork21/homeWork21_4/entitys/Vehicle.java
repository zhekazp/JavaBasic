package homeWorks.homeWork21.homeWork21_4.entitys;

public class Vehicle {
    private int currentSpeed;
    private int wheelQuantity;
    private String model;

    public Vehicle(int wheelQuantity, String model) {
        this.currentSpeed = 0;
        this.wheelQuantity = wheelQuantity;
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void speedUp(){
        currentSpeed++;
    }
    public void speedBreak(){
        if (currentSpeed>0) {
            currentSpeed--;
        }
    }
    public void printInfo(){
        System.out.println(model+" has : "+wheelQuantity+" wheels");
        System.out.println("Current speed is : "+currentSpeed);
        System.out.println();
    }
}
