package homeWork3.classes;

public class Car {
    private String producer;
    private String modelName;
    private int speed;

    public Car(String producer, String modelName, int speed) {
        this.producer = producer;
        this.modelName = modelName;
        this.speed = speed;
    }
    public void info(){
        System.out.println(producer+" "+modelName+" "+speed);
    }
}
