package homeWork6;

public class HomeWork6_3 {

    public static void main(String[] args) {
        Pizza p1=new Pizza(24);
        Pizza p2=new Pizza(28);
        System.out.println("If you buy pizza 2 you eat more calories : "
                +Math.round(p2.calories-p1.calories));
    }
}
