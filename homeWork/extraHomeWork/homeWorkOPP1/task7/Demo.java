package homeWorkOPP1.task7;

public class Demo {
    public static void main(String[] args) {


        InMemoryDatabase app = new InMemoryDatabase();
        Product pr1=new Product("Cola");
        app.save(pr1);
        Product pr2=new Product("Fanta");
        app.save(pr2);
        Product pr3=new Product("Sprite");
        app.save(pr3);

        Product pr4=app.findByTitle("Cola");
        System.out.println(pr4.getTitle());
    }
}
