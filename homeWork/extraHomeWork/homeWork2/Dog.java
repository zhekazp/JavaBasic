package homeWork2;

public class Dog {
    private final String name;
    private  int age;
    private String color;
    public Dog(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void voice(){
        System.out.println(name+" "+age+" "+color);
    }
    void happyBirthday() {
        age++;
    }
    void changeColor(String newColor) {
        color=newColor;
    }
}
