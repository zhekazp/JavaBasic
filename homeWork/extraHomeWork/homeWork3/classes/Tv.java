package homeWork3.classes;

public class Tv {
    private String producer;
    private String modelName;
    private int diagonal;

    public Tv(String producer, String modelName, int diagonal) {
        this.producer = producer;
        this.modelName = modelName;
        this.diagonal = diagonal;
    }
    public void info(){
        System.out.println(producer+" "+modelName+" "+diagonal);
    }
}
